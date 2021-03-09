package it.contrader.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import it.contrader.model.IterSelettivo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="idIterSelettivo")
public class IterSelettivoDTO {

	private long idIterSelettivo;

	private long idCandidato;
	
	private long idStaff;
	
	private int punteggioTotaleScritto;
	
	private int punteggioLogica;
	
	private int punteggioPhp;
	
	private int punteggioJava;
	
	private int punteggioHTML;
	
	private int punteggioInglese;
	
	private String dataTestScritto;
	
	private String dataTestOrale;
	
	private int valutazioneOrale;

}
