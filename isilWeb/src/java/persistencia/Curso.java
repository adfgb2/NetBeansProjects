package persistencia;
// Generated 07/04/2010 08:17:43 PM by Hibernate Tools 3.2.1.GA

/**
 * Curso generated by hbm2java
 */
public class Curso implements java.io.Serializable {

    private String codCurso;
    private String nomCurso;
    private Integer credCurso;
    private Integer hrsTeoria;
    private Integer hrsPract;
    private Integer hrsLab;
    private Integer ciclo;
    private String tipoCurso;

    public Curso() {
    }

    public Curso(String codCurso) {
        this.codCurso = codCurso;
    }

    public Curso(String codCurso, String nomCurso, Integer credCurso, Integer hrsTeoria, Integer hrsPract, Integer hrsLab, Integer ciclo, String tipoCurso) {
        this.codCurso = codCurso;
        this.nomCurso = nomCurso;
        this.credCurso = credCurso;
        this.hrsTeoria = hrsTeoria;
        this.hrsPract = hrsPract;
        this.hrsLab = hrsLab;
        this.ciclo = ciclo;
        this.tipoCurso = tipoCurso;
    }

    public String getCodCurso() {
        return this.codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public String getNomCurso() {
        return this.nomCurso;
    }

    public void setNomCurso(String nomCurso) {
        this.nomCurso = nomCurso;
    }

    public Integer getCredCurso() {
        return this.credCurso;
    }

    public void setCredCurso(Integer credCurso) {
        this.credCurso = credCurso;
    }

    public Integer getHrsTeoria() {
        return this.hrsTeoria;
    }

    public void setHrsTeoria(Integer hrsTeoria) {
        this.hrsTeoria = hrsTeoria;
    }

    public Integer getHrsPract() {
        return this.hrsPract;
    }

    public void setHrsPract(Integer hrsPract) {
        this.hrsPract = hrsPract;
    }

    public Integer getHrsLab() {
        return this.hrsLab;
    }

    public void setHrsLab(Integer hrsLab) {
        this.hrsLab = hrsLab;
    }

    public Integer getCiclo() {
        return this.ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public String getTipoCurso() {
        return this.tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public int horas() {
        return this.getHrsLab() + this.getHrsPract() + this.getHrsTeoria();
    }
}


