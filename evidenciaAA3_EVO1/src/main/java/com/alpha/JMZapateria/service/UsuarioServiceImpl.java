package com.alpha.JMZapateria.service;
// Define el paquete donde se encuentra esta clase, correspondiente a la capa de servicio.

import com.alpha.JMZapateria.model.Usuario;
// Importa la clase 'Usuario', que es la entidad que será gestionada por este servicio.

import com.alpha.JMZapateria.repository.UsuarioRepository;
// Importa la interfaz 'UsuarioRepository', que proporciona los métodos para interactuar con la base de datos.

import java.util.Optional;
// Importa la clase 'Optional', que se utiliza para manejar posibles valores nulos al buscar datos en la base de datos.

import org.springframework.beans.factory.annotation.Autowired;
// Importa la anotación '@Autowired', que permite la inyección automática de dependencias.

import org.springframework.stereotype.Service;
// Importa la anotación '@Service', que indica que esta clase es un servicio de Spring.

@Service
// Marca esta clase como un servicio gestionado por Spring, lo que significa que Spring se encargará de instanciarla y administrarla.
public class UsuarioServiceImpl implements UsuarioService {
    // Define la clase 'UsuarioServiceImpl', que implementa la interfaz 'UsuarioService'.

    @Autowired
    private UsuarioRepository usuarioRepository;
    // Inyecta automáticamente una instancia de 'UsuarioRepository' para interactuar con la base de datos.

    @Override
    public Usuario newUsuario(Usuario newUsuario) {
        // Implementación del método para crear un nuevo usuario.
        return usuarioRepository.save(newUsuario);
        // Utiliza el método 'save' de 'usuarioRepository' para guardar el nuevo usuario en la base de datos.
    }

    @Override
    public Iterable<Usuario> getAll() {
        // Implementación del método para obtener todos los usuarios.
        return this.usuarioRepository.findAll();
        // Utiliza el método 'findAll' para devolver todos los registros de la tabla 'usuarios'.
    }

    @Override
    public Usuario modifyUsuario(Usuario usuario) {
        // Implementación del método para modificar un usuario.
        Optional<Usuario> usuarioEncontrado = this.usuarioRepository.findById(usuario.getId());
        // Busca el usuario en la base de datos por su ID usando 'findById', que devuelve un 'Optional<Usuario>'.

        if (usuarioEncontrado.get() != null) {
            // Verifica si el usuario fue encontrado.
            usuarioEncontrado.get().setNombre(usuario.getNombre());
            // Actualiza el nombre del usuario.
            usuarioEncontrado.get().setApellido(usuario.getApellido());
            usuarioEncontrado.get().setCc(usuario.getCc());
            // Actualiza el apellido del usuario.
            usuarioEncontrado.get().setEmail(usuario.getEmail());
            // Actualiza el correo electrónico del usuario.
            usuarioEncontrado.get().setTelefono(usuario.getTelefono());
            // Actualiza el teléfono del usuario.
            return this.newUsuario(usuarioEncontrado.get());
            // Guarda los cambios en la base de datos y devuelve el usuario actualizado.
        }
        return null;
        // Si no se encuentra el usuario, retorna null.
    }

    @Override
    public void deleteUsuario(long id) {
        this.usuarioRepository.deleteById(id);
    }

    //@Override
    // public boolean deleteUsuario(long id) {
        // Implementación del método para eliminar un usuario.
        // this.usuarioRepository.deleteById(id);
        // Utiliza el método 'deleteById' para eliminar el usuario con el ID proporcionado.
        // return true;
        // Retorna true para indicar que la operación fue exitosa.
    //}

}
