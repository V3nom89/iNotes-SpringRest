package it.contrader.service;



import org.springframework.stereotype.Service;

import it.contrader.converter.StaffConverter;
import it.contrader.dao.CandidatiRepository;
import it.contrader.dao.StaffRepository;
import it.contrader.dto.StaffDTO;
import it.contrader.model.Staff;

@Service
public class StaffService extends AbstractService<Staff, StaffDTO> {

	


	public StaffDTO findByIdStaff(long id) {
		
		return converter.toDTO(((StaffRepository)repository).findById(id));
	}

	
}
