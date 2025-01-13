package mn.dae.pc.controller;

import mn.dae.pc.model.Infra;
import mn.dae.pc.service.InfraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/infra")
public class InfraController {

    @Autowired
    private InfraService infraService;

    @GetMapping
    public List<Infra> findAll() {
        return infraService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Infra> findById(@PathVariable Long id) {
        return infraService.findById(id);
    }

    // create an infra item
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public Infra create(@RequestBody Infra infra) {
        return infraService.save(infra);
    }

    // update a infra
    @PutMapping
    public Infra update(@RequestBody Infra infra) {
        return infraService.save(infra);
    }

    // delete a infra
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        infraService.deleteById(id);
    }

    @GetMapping("/find/{type}/{name}")
    public List<Infra> findByTypeAndName(@PathVariable String type, @PathVariable String name) {
        return infraService.findByTypeAndName(type, name);
    }
}
