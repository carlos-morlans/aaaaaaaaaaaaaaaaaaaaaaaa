public class Matriculas {
    private int id;
    private String fecha;
    private String alumno;
    private String cursos;

    public Matriculas(int id, String fecha, String alumno, String cursos){
        this.id= id;
        this.fecha=fecha;
        this.alumno=alumno;
        this.cursos=cursos;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    

}
