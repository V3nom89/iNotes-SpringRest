package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Corso;

@Repository
@Transactional
public interface CorsoRepository extends CrudRepository<Corso, Long>{
	
	Corso findById(long id);

}
