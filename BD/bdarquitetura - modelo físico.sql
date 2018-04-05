CREATE DATABASE dbarquitetura;
use dbarquitetura;

 CREATE TABLE pais(
	id SERIAL PRIMARY KEY,
	nomePais varchar (50),
	sigla varchar (2),
	telefoneQtdeDigitos integer
 );

 
CREATE TABLE cliente (
	id SERIAL PRIMARY KEY,
	nome varchar (40),
	telefone varchar (12),
	limiteCredito numeric (10,2),
	dataNasc date,
	idPais integer,
	FOREIGN KEY (idPais) REFERENCES pais (id)
	


);

select * from pais;
select * from cliente;

