import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Gestion {

    private ArrayList<Cursos> cursos;
    private ArrayList<Matriculas> matriculas;
    private ArrayList<Alumnos> alumnos;

    private final String fichero_cursos = "cursos.csv";
    private final String fichero_matricula = "matricula.csv";
    private final String fichero_alumnos = "alumnos.csv";

    public Gestion(){
        this.cursos = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.matriculas = new ArrayList<>();
        this.cargarCursos();
        
    }

    public void cargarCursos(){
        this.cursos.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(fichero_cursos))){
            String linea;
            while ((linea = reader.readLine())!= null){
                String [] atributos = linea.split (";");
                if(atributos.length == 4){
                    String id = atributos[0];
                    String nombre = atributos[1];
                    String duracion = atributos[2];
                    String momento = atributos[3];
                    Cursos cursos = new Cursos(id, nombre, duracion, momento);
                    this.cursos.add(cursos);
                }
            }
        } catch (IOException e){
            System.err.println("El error es: " + e.getMessage());
        }
        
    }

    public void cargarMatricula(){
        this.matriculas.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(fichero_matricula))){
            String linea;
            while ((linea = reader.readLine())!= null){
                String [] atributos = linea.split (";");
                if(atributos.length == 4){
                    int id = Integer.parseInt(atributos[0]);
                    String fecha = atributos[1];
                    String alumno = atributos[2];
                    String cursos = atributos[3];
                    Matriculas matriculas = new Matriculas(id, fecha, alumno, cursos);
                    this.matriculas.add(matriculas);
                }
            }
        } catch (IOException e){
            System.err.println("El error es: " + e.getMessage());
        }
        
    }

    public void cargarAlumnos(){
        this.cursos.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(fichero_alumnos))){
            String linea;
            while ((linea = reader.readLine())!= null){
                String [] atributos = linea.split (";");
                if(atributos.length == 2){
                    String id = atributos[0];
                    String nombre = atributos[1];                 
                    Alumnos alumnos = new Alumnos(id, nombre);
                    this.alumnos.add(alumnos);
                }
            }
        } catch (IOException e){
            System.err.println("El error es: " + e.getMessage());
        }
        
    }

    public void guardarCursos(Cursos curso){

        try(BufferedWriter writer= new BufferedWriter(new FileWriter(fichero_cursos))){

            writer.write(curso.cursotolinea());
            writer.newLine();   

        }catch(IOException e){
            System.err.println("error: "+System.get.getMessage());
        }


    }

    public void guardarAlumnos(Alumnos alumno){

        try(BufferedWriter writer= new BufferedWriter(new FileWriter(fichero_alumnos))){

            writer.write(alumnos.alumnotolinea());
            writer.newLine();   

        }catch(IOException e){
            System.err.println("error: "+System.get.getMessage());
        }


    }

    public void guardarMatricula(Matriculas matricula){

        try(BufferedWriter writer= new BufferedWriter(new FileWriter(fichero_matricula))){

            writer.write(matricula.matriculatolinea());
            writer.newLine();   

        }catch(IOException e){
            System.err.println("error: "+System.get.getMessage());
        }


    }

    public ArrayList<Cursos> obtenertodosCursos(){

        cargarCursos();
        return this.cursos;

    }

}
