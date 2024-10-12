package com.alpha.JMZapateria.controller;
// Declara el paquete al que pertenece esta clase, en este caso, el controlador de la aplicación.

import com.alpha.JMZapateria.model.Usuario;
// Importa la clase 'Usuario', que es el modelo o entidad que representa a un usuario en el sistema.

import com.alpha.JMZapateria.service.UsuarioService;
// Importa la interfaz 'UsuarioService', que contiene la lógica de negocio relacionada con la gestión de usuarios.

import org.springframework.beans.factory.annotation.Autowired;
// Importa la anotación '@Autowired', que permite inyectar dependencias automáticamente en Spring.

import org.springframework.web.bind.annotation.*;
// Importa las anotaciones necesarias para definir un controlador REST, manejar peticiones HTTP y gestionar CORS.

@RestController
// Indica que esta clase es un controlador REST, lo que significa que maneja solicitudes HTTP y devuelve datos en formato JSON o XML.

@RequestMapping("/usuario")
// Define la URL base "/usuario" para todas las rutas dentro de este controlador.

@CrossOrigin("*")
// Permite solicitudes desde cualquier origen, útil para manejar peticiones de dominios diferentes (CORS).

public class UsuarioController {
    // Define la clase 'UsuarioController', que manejará todas las operaciones relacionadas con la entidad Usuario.

    @Autowired
    // Inyección de dependencias. Spring se encargará de crear una instancia de 'UsuarioService' e inyectarla aquí.

    private UsuarioService usuarioService;
    // Declara una variable privada de tipo 'UsuarioService' para acceder a los métodos del servicio de usuario.

    @PostMapping("/nuevo")
    // Define un endpoint HTTP POST en la ruta "/usuario/nuevo" para crear un nuevo usuario.

    public Usuario newUsuario(@RequestBody Usuario newUsuario){
        // Método que recibe un objeto 'Usuario' en el cuerpo de la solicitud y lo pasa al servicio para crear un nuevo usuario.

        return this.usuarioService.newUsuario(newUsuario);
        // Llama al método 'newUsuario' del servicio y devuelve el usuario creado.
    }

    @GetMapping("/mostrar")
    // Define un endpoint HTTP GET en la ruta "/usuario/mostrar" para obtener todos los usuarios.

    public Iterable<Usuario> getAll(){
        // Método que devuelve una lista iterable de todos los usuarios almacenados.

        return usuarioService.getAll();
        // Llama al servicio para obtener la lista de usuarios.
    }

    @PostMapping("/modificar")
    // Define un endpoint HTTP POST en la ruta "/usuario/modificar" para modificar un usuario existente.

    public Usuario updateUsuario(@RequestBody Usuario usuario){
        // Método que recibe un objeto 'Usuario' en el cuerpo de la solicitud y lo pasa al servicio para actualizar el usuario.

        return this.usuarioService.modifyUsuario(usuario);
        // Llama al método 'modifyUsuario' del servicio y devuelve el usuario modificado.
    }

    // @PostMapping(value="/{id}")
    // Define un endpoint HTTP POST en la ruta "/usuario/{id}" para eliminar un usuario por su ID.

    // public Boolean delateUsuario(@PathVariable(value="id") Long id){
        // Método que recibe el 'id' del usuario en la URL como parámetro y lo pasa al servicio para eliminarlo.

        // return this.usuarioService.deleteUsuario(id);
        // Llama al método 'delateUsuario' del servicio y devuelve un valor booleano que indica si la eliminación fue exitosa.
    // }
    @PostMapping("delete/{id}")
    public void deleteUsuario(@PathVariable Long id){
        this.usuarioService.deleteUsuario(id);
    }
}
