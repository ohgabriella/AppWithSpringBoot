package com.eventoapp.appevento.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.appevento.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{
	Usuario findByLogin(String login);
	
}
