package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import it.contrader.converter.CorsoConverter;
import it.contrader.dao.CandidatiRepository;
import it.contrader.dao.CorsoRepository;
import it.contrader.dto.CorsoDTO;
import it.contrader.model.Corso;

@Service
public class CorsoService extends AbstractService<Corso, CorsoDTO> {

	

	public CorsoDTO findByIdCorso(long id) {
		
		return converter.toDTO(((CorsoRepository)repository).findById(id));
	}

	
}
