package com.alpha.JMZapateria.repository;
// Define el paquete donde se encuentra esta interfaz, que pertenece a la capa de repositorio de la aplicación.

import com.alpha.JMZapateria.model.Usuario;
// Importa la clase 'Usuario', que es la entidad que se gestionará en el repositorio.

import org.springframework.data.jpa.repository.JpaRepository;
// Importa la interfaz 'JpaRepository', que proporciona métodos CRUD listos para usar y funcionalidades avanzadas para trabajar con JPA (Java Persistence API).

/**
 *
 * @author USUARIO
 */
// Comentario del autor del archivo, indica quién creó este archivo.

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Define la interfaz 'UsuarioRepository' que extiende 'JpaRepository'. Esto permite el acceso a operaciones CRUD y otras funcionalidades de JPA sin necesidad de implementarlas manualmente.

}
