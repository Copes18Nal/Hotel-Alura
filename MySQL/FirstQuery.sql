create  database hotelAlura;
use hotelAlura;

CREATE TABLE reservas (
id INT NOT NULL AUTO_INCREMENT,
fechaEntrada DATE NOT NULL,
fechaSalida DATE NOT NULL,
valor VARCHAR (50),
formaPago VARCHAR (50) NOT NULL,
PRIMARY KEY (id)
);
	
CREATE TABLE huespedes (
id INT AUTO_INCREMENT,
nombre VARCHAR (50) NOT NULL,
apellido VARCHAR (50) NOT NULL,
fechaNacimiento DATE NOT NULL,
nacionalidad VARCHAR (50) NOT NULL,
telefono VARCHAR (50),
id_Reserva INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (id_reserva) REFERENCES reservas(id)
);


CREATE TABLE usuarios (
nombre VARCHAR (50),
contraseña VARCHAR (50)
);

insert into usuarios (nombre,contraseña) values ('Pilly','1583');
insert into usuarios (nombre,contraseña) values ('Charly','01266');
insert into usuarios (nombre,contraseña) values ('admin','admin');