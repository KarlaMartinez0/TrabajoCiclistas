
package PracticaP2;


abstract public class Ciclista {
    private int id;
    private String nombre;
    private int tiempoAcumulado;

    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = (int) tiempoAcumulado;
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
