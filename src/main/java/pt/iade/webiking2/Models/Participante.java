package pt.iade.webiking2.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participante")
public class Participante {
    @Id @GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name="participante_id") private int participanteid;
    @Column(name="part_even_id") private int eventoid;
     @Column(name="part_util_id") private int utilizadorid;
    
    
    
    
     public int getUtilizadorid() {
        return utilizadorid;
    }
    public void setUtilizadorid(int utilizadorid) {
        this.utilizadorid = utilizadorid;
    }
    public int getEventoid() {
        return eventoid;
    }
    public void setEventoid(int eventoid) {
        this.eventoid = eventoid;
    }
    public int getParticipanteid() {
        return participanteid;
    }
    public void setParticipanteid(int participante) {
        this.participanteid = participante;
    }



}