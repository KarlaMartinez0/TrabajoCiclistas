package PracticaP2;


public class Velocista extends Ciclista {
    private double pontenciaPrmdio;
    private double velocidadPrmdio;
    

    public Velocista(int id, String nombre, double pontenciaPrmdio, double velocidadPrmdio) {
        super(id, nombre);
        this.pontenciaPrmdio = pontenciaPrmdio;
        this.velocidadPrmdio = velocidadPrmdio;
    }

    public void setPontenciaPrmdio(double pontenciaPrmdio) {
        this.pontenciaPrmdio = pontenciaPrmdio;
    }

    public void setVelocidadPrmdio(double velocidadPrmdio) {
        this.velocidadPrmdio = velocidadPrmdio;
    }

    public double getPontenciaPrmdio() {
        return pontenciaPrmdio;
    }

    public double getVelocidadPrmdio() {
        return velocidadPrmdio;
    }

    @Override
    public String imprimirTipo() {
        return "Este ciclista es VELOCISTA" ;
    }
    @Override
    public void imprmDatos() {
        super.imprmDatos();
        System.out.print("\n Potencia promedio: " + pontenciaPrmdio + "\n Velocidad promedio: " + velocidadPrmdio);
    }

    
}
