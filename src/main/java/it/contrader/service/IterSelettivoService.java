package it.contrader.service;



import org.springframework.stereotype.Service;

import it.contrader.converter.IterSelettivoConverter;
import it.contrader.dao.CandidatiRepository;
import it.contrader.dao.IterSelettivoRepository;
import it.contrader.dto.IterSelettivoDTO;
import it.contrader.model.IterSelettivo;

@Service
public class IterSelettivoService extends AbstractService<IterSelettivo, IterSelettivoDTO> {

	
	public IterSelettivoDTO findByIdIterSelettivo(long idIterSelettivo) {
		return converter.toDTO(((IterSelettivoRepository)repository).findById(idIterSelettivo));
	}

}
