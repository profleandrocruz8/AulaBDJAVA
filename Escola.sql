CREATE DATABASE escola;

USE escola;

CREATE TABLE alunos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    idade INT
);

INSERT INTO alunos (nome, idade) VALUES ('João Silva', 20), ('Maria Souza', 22);

select * from alunos;