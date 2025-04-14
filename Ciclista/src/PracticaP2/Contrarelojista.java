
package PracticaP2;


public class Contrarelojista extends Ciclista {

    private double velocidadMax;
    
    public Contrarelojista(int id, String nombre, double velocidadMax) {
        super(id, nombre);
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
