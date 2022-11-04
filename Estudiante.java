/**
 * 
 * @author - Cristina L�pez Lusarreta -
 * 
 * Describe a un estudiante
 * Todo estudiante tiene un nombre
 * y guarda las 3 notas que ha sacado en cada una de las tres unidades de
 * trabajo que hay en la evaluaci�n
 */
public class Estudiante {
    private String nombre;
    private NotaEstudianteUnidad notaA;
    private NotaEstudianteUnidad notaB;
    private NotaEstudianteUnidad notaC;

    /**
     * Constructor
     * Inicializa el nombre del estudiante y el resto lo deja a null
     * Cuando se crea un estudiante inicialmente no tiene registrada ninguna
     * nota
     */
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notaA = null;
        this.notaB = null;
        this.notaC = null;
    }

    /**
     * Accesor para el nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Mutador para el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cantidad de notas registradas hasta el momento
     * (0, 1, 2 o 3)
     */
    public int totalNotas() {
        int totalCantidadNotas = 0;
        
        if(this.notaA != null){ 
            totalCantidadNotas += 1;
        }
        
         if(this.notaB != null){
            totalCantidadNotas += 1;
        }
        
         if(this.notaC != null){
            totalCantidadNotas += 1;
        }
        
        return totalCantidadNotas;
    }

    /**
     * registra un nuevo objeto nota, la nota asociada a una unidad
     * Los objetos se sit�an uno detr�s de otro pero siempre han de quedar
     * las notas en orden de fecha de finalizaci�n de la UT asociada (de
     * menor a mayor)
     * 
     * Pista!! En este m�todo se utilizar� el m�todo totalNotas()
     */
     public void registrarNotaUnidad(NotaEstudianteUnidad nota) {   
         switch (totalNotas()){
        case 0: notaA = nota;
                break;
        case 1: notaB = nota;
                break;
        case 2: notaC = nota;
                break;
        }
    
    }
  
    /**
     * Calcula y devuelve la nota final obtenida por el estudiante en la
     * evaluaci�n que depender� de la ponderaci�n de cada UT
     * El m�todo devuelve -1 si al invocarlo no se han registrado los tres
     * objetos NotaEstudianteUnidad que se necesitan para calcular la nota final
     */
    public double calcularNotaFinalEstudiante() {
        double notaAUnidadPonderada = 0;
       if(notaA != null){
        notaAUnidadPonderada = this.notaA.calcularNotaUnidad() * notaA.getUnidad().getPesoUnidad() / 10;
        }
        double notaBUnidadPonderada = 0;
       if(notaB != null){
        notaBUnidadPonderada = this.notaB.calcularNotaUnidad() * notaB.getUnidad().getPesoUnidad() / 10;
        }
        double notaCUnidadPonderada = 0;
       if(notaC != null){
         notaCUnidadPonderada = this.notaC.calcularNotaUnidad() * notaC.getUnidad().getPesoUnidad() / 10;
        }
        
       double notaFinalEstudiante = 0;
       
       if(totalNotas() < 3){
        notaFinalEstudiante = -1;
        }
       else {
        notaFinalEstudiante = (notaAUnidadPonderada + notaBUnidadPonderada + notaCUnidadPonderada) / 10;
        }
       
        return notaFinalEstudiante;

    }

    /**
     * Representaci�n textual del estudiante (ver enunciado)
     */
    public String toString() {
       String str = nombre + "\n" + "*".repeat(80) + "\n";
       String notaFin = String.format("\nNota final de evaluaci�n: %5.2f", calcularNotaFinalEstudiante());
       
       if(totalNotas() != 3){
        str += "No es posible calcular su nota final de evaluaci�n, faltan notas por registrar.\n";
        }
        else {
        str += notaA.toString() + notaB.toString() + notaC.toString() + notaFin;
        }
       
        return str + "\n" + notaA.toString() + "\n" + notaB.toString() + "\n" + notaC.toString() + notaFin;
    }

    /**
     * Este m�todo se ha incluido solo para testear la clase m�s f�cilmente
     */
    public void print() {
        System.out.println(this.toString());
 
    }

    

}
