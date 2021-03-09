package it.contrader.converter;

import org.springframework.stereotype.Component;
import it.contrader.dto.CorsoDTO;
import it.contrader.model.Corso;


@Component
public class CorsoConverter extends AbstractConverter<Corso, CorsoDTO>{

	@Override
	public Corso toEntity(CorsoDTO corsoDTO) {
		Corso corso = null;
		if (corsoDTO != null) {
			corso = new Corso(corsoDTO.getIdCorso(),corsoDTO.getIdCandidato(), corsoDTO.getIdIterSelettivo(), corsoDTO.getArgomentoCorso(),corsoDTO.getValutazioneComunicazioni(), 
					 corsoDTO.getValutazioneIntuitivita(), corsoDTO.getValutazioneAttitudine(), corsoDTO.getValutazioneTeamWork(), corsoDTO.getOreTotali(), corsoDTO.getIdStaff(), corsoDTO.getDataInizio());
			
		}
		return corso;
	}
	@Override
	public CorsoDTO toDTO(Corso corso) {
		CorsoDTO corsoDTO = null;
		if (corso != null) {
			corsoDTO = new CorsoDTO(corso.getIdCorso(),corso.getIdCandidato(),corso.getIdIterSelettivo(), corso.getArgomentoCorso(),corso.getValutazioneComunicazioni(),
					corso.getValutazioneIntuitivita(), corso.getValutazioneAttitudine(), corso.getValutazioneTeamWork(), corso.getOreTotali(), corso.getIdStaff(), corso.getDataInizio());
		}
		return corsoDTO;
	}

}