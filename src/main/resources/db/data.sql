INSERT INTO infra (type, name) SELECT 'vm', 'paul1' WHERE NOT EXISTS (SELECT * FROM infra WHERE id=1);
INSERT INTO infra (type, name) SELECT 'vm', 'paul2' WHERE NOT EXISTS (SELECT * FROM infra WHERE id=2);