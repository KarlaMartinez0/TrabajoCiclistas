
package PracticaP2;


public class Escalador extends Ciclista {
    
    private float aceleracionSubida;
    private float gradoRampa;
    
    public Escalador(int id, String nombre, float aceleracionSubida, float gradoRampa) {
        super(id, nombre);
        this.aceleracionSubida = aceleracionSubida;
        this.gradoRampa = gradoRampa;
    }
    public void setAceleracionSubida(float aceleracionSubida) {
        this.aceleracionSubida = aceleracionSubida;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    public float getAceleracionSubida() {
        return aceleracionSubida;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    @Override
    public String imprimirTipo() {
        return "Este ciclista es Escalador";     
    }

    @Override
    public void imprmDatos() {
        super.imprmDatos();
        System.out.print("Aceleracion promedio en subida: " + aceleracionSubida
        + "\nGrado de rampa soportada: " + gradoRampa);
    }
    
}
