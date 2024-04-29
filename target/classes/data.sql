insert into codigos_postales (codigo_postal, localidad, provincia) values ('14920', 'Aguilar', 'Cordoba');
insert into codigos_postales (codigo_postal, localidad, provincia) values ('14500', 'Montilla', 'Cordoba');
insert into codigos_postales (codigo_postal, localidad, provincia) values ('14800', 'Lucena', 'Cordoba');
insert into codigos_postales (codigo_postal, localidad, provincia) values ('23567', 'Carmona', 'Sevilla');
insert into codigos_postales (codigo_postal, localidad, provincia) values ('23561', 'Lora del Rio', 'Sevilla');
insert into codigos_postales (codigo_postal, localidad, provincia) values ('32123', 'Antequera', 'Malaga');
insert into codigos_postales (codigo_postal, localidad, provincia) values ('33001', 'Campillos', 'Malaga');
insert into codigos_postales (codigo_postal, localidad, provincia) values ('32668', 'Teba', 'Malaga');
insert into codigos_postales (codigo_postal, localidad, provincia) values ('44321', 'Martos', 'Jaen');
insert into codigos_postales (codigo_postal, localidad, provincia) values ('41222', 'Andujar', 'Jaen');

insert into propietarios (nombre, primer_apellido, segundo_apellido, dni, domicilio,codigo_postal_id) values ('Cib', 'Ros', 'Arna', '11111111A', 'Pe Sa Vnte, 2', 1);
insert into propietarios (nombre, primer_apellido, segundo_apellido, dni, domicilio, codigo_postal_id) values ('Atio', 'Gca', 'Arna', '22222222B', 'Mrila, 23', 2);
insert into propietarios (nombre, primer_apellido, segundo_apellido, dni, domicilio, codigo_postal_id) values ('Mgul Anel', 'Pez', 'Ana', '33333333C', 'Salalla, 5', 1);
insert into propietarios (nombre, primer_apellido, segundo_apellido, dni, domicilio, codigo_postal_id) values ('Je Aonio', 'Casco', 'Ana', '44444444D', 'Emada, 76', 3);
insert into propietarios (nombre, primer_apellido, segundo_apellido, dni, domicilio, codigo_postal_id) values ('Alto', 'Lez', 'Arna', '55555555E', 'Creras, 8', 2);
insert into propietarios (nombre, primer_apellido, segundo_apellido, dni, domicilio, codigo_postal_id) values ('Rel', 'Saez', 'Ana', '66666666F', 'Alante, 6', 1);
insert into propietarios (nombre, primer_apellido, segundo_apellido, dni, domicilio, codigo_postal_id) values ('Jan', 'Lucna', 'Ana', '77777777G', 'Gaos, 34', 7);
insert into propietarios (nombre, primer_apellido, segundo_apellido, dni, domicilio, codigo_postal_id) values ('Pro', 'Banco', 'Arna', '88888888H', 'Esiantes, 65', 1);
insert into propietarios (nombre, primer_apellido, segundo_apellido, dni, domicilio, codigo_postal_id) values ('Plo', 'Vao', 'Ana', '99888888I', 'Toto, 7', 1);
insert into propietarios (nombre, primer_apellido, segundo_apellido, dni, domicilio, codigo_postal_id) values ('Mio', 'Pez', 'Arna', '99999999J', 'Llo, 89', 1);

insert into proveedores (nombre, dni_cif, domicilio, codigo_postal_id) values ('GRUPO PEÑA SL', 'B14995673', 'Peña Blanca, 2', 3);
insert into proveedores (nombre, dni_cif, domicilio, codigo_postal_id) values ('TORNILLOS LA LAGUNA SL', 'B14445676', 'Calle Blanca Palima, 3', 5);
insert into proveedores (nombre, dni_cif, domicilio, codigo_postal_id) values ('PLACAS DE PIEZAS, SL', 'B14665765', 'Las Albarizas, 5', 6);
insert into proveedores (nombre, dni_cif, domicilio, codigo_postal_id) values ('MOTORES ORDOÑEZ', 'B14436571', 'Calle Baena, 28', 3);
insert into proveedores (nombre, dni_cif, domicilio, codigo_postal_id) values ('COMPONENTES ELOY', 'B14005600', 'Calle las cimas, 80', 2);

insert into vehiculos (matricula, marca, modelo, color, propietario_id) values ('2345DFG', 'RENAULT', 'CLIO', 'Blanco', 1);
insert into vehiculos (matricula, marca, modelo, color, propietario_id) values ('3214FVC', 'FORD', 'FIESTA', 'Azul', 3);
insert into vehiculos (matricula, marca, modelo, color, propietario_id) values ('0090VVC', 'CITROEN', 'BERLINGO', 'Negro', 1);
insert into vehiculos (matricula, marca, modelo, color, propietario_id) values ('8870FZZ', 'SEAT', 'IBIZA', 'Blanco', 5);
insert into vehiculos (matricula, marca, modelo, color, propietario_id) values ('0011GGA', 'PEUGEOT', '407', 'Rojo', 1);
insert into vehiculos (matricula, marca, modelo, color, propietario_id) values ('2200VVM', 'RENAULT', 'LAGUNA', 'Negro', 3);
insert into vehiculos (matricula, marca, modelo, color, propietario_id) values ('7000QQQ', 'PEUGEOT', '508', 'Naranja', 4);
insert into vehiculos (matricula, marca, modelo, color, propietario_id) values ('5111UUU', 'SEAT', 'TOLEDO', 'Azul', 1);
insert into vehiculos (matricula, marca, modelo, color, propietario_id) values ('2110YTY', 'RENAULT', 'CMAX', 'Amarillo', 6);
insert into vehiculos (matricula, marca, modelo, color, propietario_id) values ('0499FCK', 'FORD', 'FOCUS', 'Blanco', 5);

insert into mano_de_obra (fecha_nuevo_precio, precio_hora, precio_hora_actual) values ('2022-11-19', 20.5, false);
insert into mano_de_obra (fecha_nuevo_precio, precio_hora, precio_hora_actual) values ('2023-01-01', 32.0, true);

insert into piezas (referencia, nombre_pieza, precio_venta) values ('VA23356', 'Arandela de cobre', 0.50);
insert into piezas (referencia, nombre_pieza, precio_venta) values ('VA40001', 'polea distribucion', 25.30);
insert into piezas (referencia, nombre_pieza, precio_venta) values ('TE23126', 'filtro aceite', 4.20);
insert into piezas (referencia, nombre_pieza, precio_venta) values ('TE11111', 'filtro de combustible', 10.78);
insert into piezas (referencia, nombre_pieza, precio_venta) values ('TE34000', 'filtro de aire', 9.76);
insert into piezas (referencia, nombre_pieza, precio_venta) values ('TE32111', 'filtro de polen', 12.60);
insert into piezas (referencia, nombre_pieza, precio_venta) values ('VA00000', 'volante motor', 119.25);
insert into piezas (referencia, nombre_pieza, precio_venta) values ('R333300', 'radiador', 150.87);
insert into piezas (referencia, nombre_pieza, precio_venta) values ('VA55555', 'culata', 300.45);
insert into piezas (referencia, nombre_pieza, precio_venta) values ('VA44099', 'caja de cambios', 300.34);