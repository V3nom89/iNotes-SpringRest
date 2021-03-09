package it.contrader.service;


import org.springframework.stereotype.Service;

import it.contrader.converter.CandidatiConverter;
import it.contrader.dao.CandidatiRepository;
import it.contrader.dao.UserRepository;
import it.contrader.dto.CandidatiDTO;

import it.contrader.model.Candidati;

@Service
public class CandidatiService extends AbstractService<Candidati, CandidatiDTO> {
	
	

	public CandidatiDTO findByidCandidati(long idCandidati) {
		return converter.toDTO(((CandidatiRepository)repository).findByidCandidati(idCandidati));
	}
}
