package com.eventoapp.appevento.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.appevento.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	Evento findByCodigo(long codigo);
	
}
