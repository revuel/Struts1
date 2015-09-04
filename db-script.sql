-- ------------------------------------------------------
-- SCRIPT DE GENERACIÓN DE LA BASE DE DATOS DEL EXAMEN --
-- ------------------------------------------------------

-- Crear esquema
create schema exastruts1;

-- Tablas primitivas
create table exastruts1.alumno (
	id int(6) not null auto_increment,
	nombre varchar(100),
	apellidos varchar(100),
	edad integer(3),
	nota integer(3),
	primary key (id),
	constraint chk_edad check (edad between 0 and 100), 
	constraint chk_nota check (nota between 0 and 100)
);

-- Inserciones 

