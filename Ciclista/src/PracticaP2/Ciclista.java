
package PracticaP2;


abstract public class Ciclista {
    private int id;
    private String nombre;
    private double tiempoAcumulado = 0.0;

    public Ciclista(int id, String nombre, double tiempoAcumulado) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTiempoAcumulado() {
        return tiempoAcumulado;
    }
    
    public abstract String imprimirTipo ();
    
    public void imprmDatos (){
        System.out.println("ID: " + id);
        System.out.println("NOmbre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcumulado);
    }
}
