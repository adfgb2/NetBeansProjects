package persistencia;
// Generated 07/04/2010 08:17:43 PM by Hibernate Tools 3.2.1.GA



/**
 * DisponibilidadId generated by hbm2java
 */
public class DisponibilidadId  implements java.io.Serializable {


     private String docente;
     private String curso;

    public DisponibilidadId() {
    }

    public DisponibilidadId(String docente, String curso) {
       this.docente = docente;
       this.curso = curso;
    }
   
    public String getDocente() {
        return this.docente;
    }
    
    public void setDocente(String docente) {
        this.docente = docente;
    }
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DisponibilidadId) ) return false;
		 DisponibilidadId castOther = ( DisponibilidadId ) other; 
         
		 return ( (this.getDocente()==castOther.getDocente()) || ( this.getDocente()!=null && castOther.getDocente()!=null && this.getDocente().equals(castOther.getDocente()) ) )
 && ( (this.getCurso()==castOther.getCurso()) || ( this.getCurso()!=null && castOther.getCurso()!=null && this.getCurso().equals(castOther.getCurso()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getDocente() == null ? 0 : this.getDocente().hashCode() );
         result = 37 * result + ( getCurso() == null ? 0 : this.getCurso().hashCode() );
         return result;
   }   


}

