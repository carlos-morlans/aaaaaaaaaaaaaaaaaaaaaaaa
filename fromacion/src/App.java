import java.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);
    private static Gestion gestion = new Gestion();
    
    public static void main(String[] args)  {

        
         int opcion;
        do{
        System.out.println("Bienvendio al cursos CARLOSCABEZA");
        System.out.println("Selecciona una opcion: ");
        System.out.println("1: CREAR CURSO");
        System.out.println("2: CREAR ALUMNO");
        System.out.println("3: MATRICULAR ALUMNO");
        System.out.println("4: MOSTRAR CURSOS");
        opcion =sc.nextInt();
       
        }while (!sc.hasNextInt()); {
                System.out.print("Por favor, introduzca un número válido: ");
                sc.next(); // consumir entrada no válida
            }

        switch(opcion){

            case 1 ->{  
                            menuCrearCurso();
                    } 
            case 2->{}
            case 3->{}
            case 4 ->{
                mostrarTodosCursos(gestion);
            }
            default->{
                System.out.println("introduce una opcion valida");
            }

        }
    }


    public static void menuCrearCurso(){

                System.out.println("ID DEL CURSO");
                String id=sc.next();
                System.out.println("NOMBRE DEL CURSO");
                String nombre=sc.next();
                System.out.println("DURACION DEL CURSO");
                String duracion=sc.next();
                System.out.println("MOMENTO DEL CURSO");
                String momento=sc.next();
                
              Cursos curso= new Cursos(id, nombre, duracion, momento);
              guardarCursos(curso);
               
    }


    public static void mostrarTodosCursos(Gestion gestion){

        ArrayList<Cursos> TodosCursos= obtenertodosCursos();

        if(TodosCursos.isEmpty()){

            System.out.println("No hay cursos");
            return;

        }
        else{
            for(Cursos curso : TodosCursos){

                System.out.println(curso);
            }

        }
    }



}
