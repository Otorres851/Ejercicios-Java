#creamos la base de datos
CREATE DATABASE IF NOT EXISTS base_peliculas;
#seleccionar base de datos
USE base_peliculas;

#Creamos las tablas sin relación
CREATE TABLE If NOT EXISTS peliculas(
id_película INT NOT NULL,
título VARCHAR (45) NOT NULL,
año DATE,
nacionalidad VARCHAR (20),
idioma VARCHAR (120),
formato ENUM ('BLANCO Y NEGRO' , 'COLOR'),
descripción VARCHAR (120),
resumen VARCHAR (255),
observaciones VARCHAR (255),
PRIMARY KEY (id_película)
)ENGINE=INNODB;