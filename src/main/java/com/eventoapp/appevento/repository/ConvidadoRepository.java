package com.eventoapp.appevento.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.appevento.models.Convidado;
import com.eventoapp.appevento.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);

}
