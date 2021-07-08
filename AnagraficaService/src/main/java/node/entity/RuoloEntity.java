package node.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RUOLI")
public class RuoloEntity {

	@Id
    @Column(name="RUOLO")
    private String ruolo;
     
    @Column(name="DESCRIZIONE_RUOLO")
    private String descrizioneRuolo;

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getDescrizioneRuolo() {
		return descrizioneRuolo;
	}

	public void setDescrizioneRuolo(String descrizioneRuolo) {
		this.descrizioneRuolo = descrizioneRuolo;
	}
     
	@Override
	public String toString() {
		return String.format("RuoliEntity [ruolo=%s, descrizioneRuolo=%s]", ruolo, descrizioneRuolo);
	}
    
}
