package com.alpha.JMZapateria.service;
// Define el paquete donde se encuentra esta interfaz, perteneciente a la capa de servicio de la aplicación.

import com.alpha.JMZapateria.model.Usuario;
// Importa la clase 'Usuario', que es la entidad que será gestionada por el servicio.

public interface UsuarioService {
    // Define la interfaz 'UsuarioService', que actúa como una capa intermedia entre el controlador y el repositorio.

    Usuario newUsuario(Usuario newUsuario);
    // Método para crear un nuevo usuario. Recibe un objeto de tipo 'Usuario' como parámetro y devuelve el usuario creado.

    Iterable<Usuario> getAll();
    // Método que devuelve una lista iterable de todos los usuarios almacenados. Este método es útil para mostrar todos los registros de usuarios.

    Usuario modifyUsuario(Usuario usuario);
    // Método para modificar un usuario existente. Recibe un objeto 'Usuario' como parámetro y devuelve el usuario actualizado.

    // boolean deleteUsuario(long id);
    // Método para eliminar un usuario por su ID. Recibe el ID como un parámetro de tipo 'long' y devuelve un valor booleano que indica si la eliminación fue exitosa.

    public void  deleteUsuario(long id);
}
