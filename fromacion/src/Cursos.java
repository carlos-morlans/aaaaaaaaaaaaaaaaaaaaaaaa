public class Cursos {

    private String id;
    private String nombre;
    private String duracion;
    private String momento;

    public Cursos( String id, String nombre, String duracion, String momento){
        this.id=id;
        this.nombre=nombre;
        this.duracion=duracion;
        this.momento=momento;
    }

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDuracion() {return duracion;}

    public void setDuracion(String duracion) {this.duracion = duracion;}

    public String getMomento() {return momento;}

    public void setMomento(String momento) {this.momento = momento;}

    @Override
    public String toString(){
        return "id: " + id + "nombre: " + nombre + "duracion: " + duracion + "momento" + momento;
    }


    
}
