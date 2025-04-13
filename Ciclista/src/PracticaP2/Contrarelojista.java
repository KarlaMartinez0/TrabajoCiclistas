
package PracticaP2;


public class Contrarelojista extends Ciclista {

    private double velocidadMax = 0.0;
    
    public Contrarelojista(int id, String nombre, double tiempoAcumulado) {
        super(id, nombre, tiempoAcumulado);
        this.velocidadMax = velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    @Override
    public String imprimirTipo() {
        return "Este ciclista es CONTRARELOJISTA";
    }

    @Override
    public void imprmDatos() {
        super.imprmDatos();
        System.out.print("Velecidad maxima: " + velocidadMax);
    }
    
}
