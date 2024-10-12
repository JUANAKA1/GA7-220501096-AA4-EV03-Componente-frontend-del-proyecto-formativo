package com.alpha.JMZapateria.model;
// Define el paquete al que pertenece esta clase, que es el modelo o la entidad de la aplicación.

import jakarta.persistence.Column;
// Importa la anotación '@Column', que se utiliza para especificar detalles de las columnas de la base de datos.

import jakarta.persistence.Entity;
// Importa la anotación '@Entity', que define la clase como una entidad de base de datos.

import jakarta.persistence.Id;
// Importa la anotación '@Id', que marca un campo como la clave primaria de la entidad.

import jakarta.persistence.Table;
// Importa la anotación '@Table', que permite especificar el nombre de la tabla en la base de datos.

import lombok.Data;
// Importa la anotación '@Data' de Lombok, que genera automáticamente los getters, setters, toString, hashCode y equals.

// Definición de la clase 'Usuario' que representa una entidad de usuario en la base de datos.
@Entity
// Marca la clase como una entidad gestionada por JPA (Java Persistence API), lo que significa que corresponde a una tabla en la base de datos.

@Data
// Utiliza la anotación de Lombok '@Data' para generar automáticamente los métodos comunes como getters y setters, sin necesidad de escribirlos manualmente.

@Table(name="usuarios")
// Especifica que esta entidad está mapeada a una tabla en la base de datos llamada "usuarios".

public class Usuario {
    // Define la clase pública 'Usuario', que será la representación de la tabla "usuarios" en la base de datos.

    @Id
    // Marca este campo como la clave primaria de la tabla "usuarios".

    @Column
    // Indica que este campo estará representado como una columna en la base de datos.

    private Long id;
    // Clave primaria, es un identificador único para cada usuario en la base de datos.

    @Column
    // Define una columna en la tabla "usuarios" que almacenará el nombre del usuario.

    private String nombre;
    // El campo 'nombre' almacena el nombre del usuario.

    @Column
    // Define una columna en la tabla "usuarios" que almacenará el apellido del usuario.

    private String apellido;
    // El campo 'apellido' almacena el apellido del usuario.
    @Column
    // Define una columna en la tabla "usuarios" que almacenará el cedula del usuario.

    private String cc;
    // El campo 'cc' almacena el cedula del usuario.

    @Column
    // Define una columna en la tabla "usuarios" que almacenará el correo electrónico del usuario.

    private String email;
    // El campo 'email' almacena la dirección de correo del usuario.

    @Column
    // Define una columna en la tabla "usuarios" que almacenará el número de teléfono del usuario.

    private String telefono;
    // El campo 'telefono' almacena el número de teléfono del usuario.
}
