import java.util.Scanner;
/**
 * 
 * @author - Cristina L�pez Lusarreta
 * 
 * Prueba del todas las clases
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicaci�n
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
     
        //---------CREAMOS EL ESTUDIANTE-----------------------------------------------------
        System.out.println("Nombre:");
            // nombreEstudiante = "MOLINA HUARTE, Isabel";
            String nombreEstudiante = teclado.nextLine();
            
        //Estudiante estudiante = new Estudiante(nombreEstudiante);
        
        
        //-------CREAMOS LA UNIDAD DE TRABAJO 1-----------------------------------------------        
    
        //- - - pedir datos sobre la ut - - - - - - - - - - - - - - - - - - 
        System.out.println("Nombre de la UT: ");
            //  teclado.nextLine();
            String nombreUT = teclado.nextLine();
            //  teclado.nextLine();
        
        System.out.println("D�a de finalizaci�n de la UT: ");
            int dia = teclado.nextInt();
        
        System.out.println("Mes de finalizaci�n de la UT: ");
            int mes = teclado.nextInt();
        
        System.out.println("A�o de finalizaci�n de la UT: ");
            int a�o = teclado.nextInt();
            
        System.out.println("Peso de la UT: ");
            int peso = teclado.nextInt();
        
        System.out.println("Ponderaci�n controles: ");
            int ponderaControles = teclado.nextInt();
            
        System.out.println("Ponderaci�n actividades: ");
            int ponderaActividades = teclado.nextInt();
            
        System.out.println("Ponderaci�n proyectos: ");
            int ponderaProyectos = teclado.nextInt();
            
        //- - - pedir datos sobre las notas - - - - - - - - - - - - - - - - - -     
        System.out.println("Nota controles: ");
            double notaControles = teclado.nextDouble();
            
        System.out.println("Nota actividades: ");
            double notaActividades = teclado.nextDouble();
            
        System.out.println("Nota proyectos: ");
            double notaProyectos = teclado.nextDouble();
            
        //- - - creamos ambos objetos (UT y notas) - - - - - - - - - - - - - - - - - -  
        Estudiante estudiante = new Estudiante(nombreEstudiante);
        
        UnidadTrabajo unidadTrabajo1 = new UnidadTrabajo(nombreUT, dia, mes, a�o, peso,
                                         ponderaControles, ponderaActividades, ponderaProyectos);
                                         
        NotaEstudianteUnidad notasEstudianteUT1 = new NotaEstudianteUnidad(unidadTrabajo1, 
                                            notaControles, notaActividades, notaProyectos);
                                            
        //- - - registramos las notas de esta UT - - - - - - - - - - - - - - - - - -                                   
        notasEstudianteUT1.setNotaControles(notaControles); 
        notasEstudianteUT1.setNotaActividades(notaActividades); 
        notasEstudianteUT1.setNotaProyectos(notaProyectos);
        
        //double notaUnidad = notasEstudianteUT1.calcularNotaUnidad();
        estudiante.registrarNotaUnidad(notasEstudianteUT1);
        
        estudiante.print();
        notasEstudianteUT1.print();
        //- - - Mostrar en pantalla toda la informaci�n del alumno - - - - - - - - - - - - - - - - - -  
        
        
        
        
        //FALTA POR TERMINAR

       
       
       
    }
}
