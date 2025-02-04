/**
 * 
 * @author - Cristina L�pez Lusarreta
 * 
 * Un objeto de esta clase est� asociado con una unidad de trabajo
 * y guarda la nota que un estudiante ha sacado en los controles, actividades y
 * proyectos de esa unidad
 */
public class NotaEstudianteUnidad {
    private UnidadTrabajo unidad;
    private double notaControles;
    private double notaActividades;
    private double notaProyectos;

    /**
     * Constructor
     */
    public NotaEstudianteUnidad(UnidadTrabajo unidad, double notaControles,
                                double notaActividades,
                                double notaProyectos) {
        this.unidad = unidad;
        this.notaControles = notaControles;
        this.notaActividades = notaActividades;
        this.notaProyectos = notaProyectos;
    }

    /**
     * Accesor para la UT
     */
    public UnidadTrabajo getUnidad() {
        return unidad;
    }

    /**
     * Accesor para la UT
     */
    public void setUnidad(UnidadTrabajo unidad) {
        this.unidad = unidad;
    }

    /**
     * Accesor para nota controles
     */
    public double getNotaControles() {
        return notaControles;
    }

    /**
     * Mutador para nota controles
     */
    public void setNotaControles(double notaControles) {
        this.notaControles = notaControles;
    }

    /**
     * Accesor para nota actividades
     */
    public double getNotaActividades() {
        return notaActividades;
    }

    /**
     * Mutador para nota actividades
     */
    public void setNotaActividades(double notaActividades) {
        this.notaActividades = notaActividades;
    }

    /**
     * Accesor para nota proyectos
     */
    public double getNotaProyectos() {
        return notaProyectos;
    }

    /**
     * Mutador para nota proyectos
     */
    public void setNotaProyectos(double notaProyectos) {
        this.notaProyectos = notaProyectos;
    }

    /**
     * Calcula y devuelve la nota obtenida en la UT teniendo
     * en cuenta la ponderaci�n de los instrumentos de evaluaci�n
     */
    public double calcularNotaUnidad() {
        double notaPonderadaControles = getNotaControles() * (unidad.getPonderacion().getControles()) / 10;
        double notaPonderadaActividades = getNotaActividades() * (unidad.getPonderacion().getActividades()) / 10;
        double notaPonderadaProyectos = getNotaProyectos() * (unidad.getPonderacion().getProyectos()) / 10;

        return (notaPonderadaControles + notaPonderadaActividades + notaPonderadaProyectos) / 10;


    }

    /**
     * Representaci�n textual del objeto (ver enunciado)
     */
    public String toString() {
        String str1 = String.format("Controles: %5.2f \tActividades clase: %5.2f \tProyectos: %5.2f",
                                    getNotaControles(), getNotaActividades(), getNotaProyectos());
        String str2 = String.format("\nNota final obtenida en Unidad de Trabajo: %5.2f\n", calcularNotaUnidad());
        
        return unidad.toString() + str1 + str2 + "-".repeat(80);
    }

    /**
     * Este m�todo se ha incluido solo para testear la clase m�s f�cilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

   

}
