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
        String nombreEstudiante = "MOLINA HUARTE, Isabel";
        Estudiante estudiante = new Estudiante(nombreEstudiante);

        String nombreUT = "";
        int dia = 0;
        int mes = 0;
        int a�o = 0;
        int peso = 0;
        int ponderaControles = 0;
        int ponderaActividades = 0;
        int ponderaProyectos = 0;
        double notaControles = 0;
        double notaActividades = 0;
        double notaProyectos = 0;

        double notaUnidad = 0;

        UnidadTrabajo unidadTrabajo1;
        NotaEstudianteUnidad notasEstudianteUT1;

        UnidadTrabajo unidadTrabajo2;
        NotaEstudianteUnidad notasEstudianteUT2;
        Fecha fechaFinUT2;
        PonderacionInstrumentos ponderacionUT2;

        UnidadTrabajo unidadTrabajo3;
        NotaEstudianteUnidad notasEstudianteUT3;
        Fecha fechaFinUT3;
        PonderacionInstrumentos ponderacionUT3;

        if(estudiante.totalNotas() == 0){
            nombreUT = "Interaccion de objetos. Estructura de control iterativa.";
            dia = 25;
            mes = 11;
            a�o = 2022;
            peso = 55;
            ponderaControles = 60;
            ponderaActividades = 10;
            ponderaProyectos = 30;
            notaControles = 5;
            notaActividades = 6;
            notaProyectos = 7;

            unidadTrabajo1 = new UnidadTrabajo(nombreUT, dia, mes, a�o, peso, ponderaControles, ponderaActividades, ponderaProyectos);
            notasEstudianteUT1 = new NotaEstudianteUnidad(unidadTrabajo1, notaControles, notaActividades, notaProyectos);

            notasEstudianteUT1.setNotaControles(notaControles); 
            notasEstudianteUT1.setNotaActividades(notaActividades); 
            notasEstudianteUT1.setNotaProyectos(notaProyectos);

            notaUnidad = notasEstudianteUT1.calcularNotaUnidad();

            estudiante.registrarNotaUnidad(notasEstudianteUT1);

        }

        if(estudiante.totalNotas() == 1){
            nombreUT = "Objetos y clases.";
            dia = 21;
            mes = 9;
            a�o = 2022;
            peso = 10;
            ponderaControles = 70;
            ponderaActividades = 10;
            ponderaProyectos = 20;
            notaControles = 6;
            notaActividades = 10;
            notaProyectos = 7;

            fechaFinUT2 = new Fecha(dia, mes, a�o);
            ponderacionUT2 = new PonderacionInstrumentos(ponderaControles, ponderaActividades, ponderaProyectos);
            unidadTrabajo2 = new UnidadTrabajo(nombreUT, fechaFinUT2, peso, ponderacionUT2);
            notasEstudianteUT2 = new NotaEstudianteUnidad(unidadTrabajo2, notaControles, notaActividades, notaProyectos);

            notasEstudianteUT2.setNotaControles(notaControles); 
            notasEstudianteUT2.setNotaActividades(notaActividades); 
            notasEstudianteUT2.setNotaProyectos(notaProyectos);

            notaUnidad = notasEstudianteUT2.calcularNotaUnidad();

            estudiante.registrarNotaUnidad(notasEstudianteUT2);

        }      

        if(estudiante.totalNotas() == 2){
            nombreUT = "Definici�n de una clase. Estuctura condicional.";
            dia = 16;
            mes = 10;
            a�o = 2022;
            peso = 35;
            ponderaControles = 65;
            ponderaActividades = 10;
            ponderaProyectos = 25;
            notaControles = 8;
            notaActividades = 6;
            notaProyectos = 9;

            fechaFinUT3 = new Fecha(dia, mes, a�o);
            ponderacionUT3 = new PonderacionInstrumentos(ponderaControles, ponderaActividades, ponderaProyectos);
            unidadTrabajo3 = new UnidadTrabajo(nombreUT, fechaFinUT3, peso, ponderacionUT3);
            notasEstudianteUT3 = new NotaEstudianteUnidad(unidadTrabajo3, notaControles, notaActividades, notaProyectos);

            notasEstudianteUT3.setNotaControles(notaControles); 
            notasEstudianteUT3.setNotaActividades(notaActividades); 
            notasEstudianteUT3.setNotaProyectos(notaProyectos);

            notaUnidad = notasEstudianteUT3.calcularNotaUnidad();

            estudiante.registrarNotaUnidad(notasEstudianteUT3);

            estudiante.print();
            UnidadTrabajo copiaUT3 = unidadTrabajo3.clonar();
            copiaUT3.print();
        }      

    }
}
