package persistencia;
// Generated 07/04/2010 08:17:43 PM by Hibernate Tools 3.2.1.GA



/**
 * Disponibilidad generated by hbm2java
 */
public class Disponibilidad  implements java.io.Serializable {


     private DisponibilidadId id;
     private String horario;

    public Disponibilidad() {
    }

	
    public Disponibilidad(DisponibilidadId id) {
        this.id = id;
    }
    public Disponibilidad(DisponibilidadId id, String horario) {
       this.id = id;
       this.horario = horario;
    }
   
    public DisponibilidadId getId() {
        return this.id;
    }
    
    public void setId(DisponibilidadId id) {
        this.id = id;
    }
    public String getHorario() {
        return this.horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }




}


