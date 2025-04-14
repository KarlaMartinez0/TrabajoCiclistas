
package PracticaP2;
import java.util.ArrayList;
import java.util.List;


public class Equipo {
    private String nmbEquipo;
    private String pais; 
    private static int tiempTotalEquipo;
    private List<Ciclista> ciclistas;
    
    public Equipo(String nmbEquipo, String pais) {
        this.nmbEquipo = nmbEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public void setNmbEquipo(String nmbEquipo) {
        this.nmbEquipo = nmbEquipo;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static void setTiempTotalEquipo(int tiempTotalEquipo) {
        Equipo.tiempTotalEquipo = tiempTotalEquipo;
    }

    public void setCiclistas(List<Ciclista> ciclistas) {
        this.ciclistas = ciclistas;
    }

    public String getNmbEquipo() {
        return nmbEquipo;
    }

    public String getPais() {
        return pais;
    }

    public static int getTiempTotalEquipo() {
        return tiempTotalEquipo;
    }

    public List<Ciclista> getCiclistas() {
        return ciclistas;
    }
    protected void ImpDatosEquipo (){
        System.out.print("Nombre equipo: " + nmbEquipo + "\nPais: " + pais + 
        "\nTiempo total equipo: " + tiempTotalEquipo + "\nCiclistas: ");
        for (Ciclista ciclista:ciclistas){
        ciclista.imprmDatos();
        }
    }
    protected void addCiclista(Ciclista ciclista){
        ciclistas.add(ciclista);
        calTiempoTotal();
    }
    protected void calTiempoTotal(){
        tiempTotalEquipo = 0;
        for (Ciclista ciclista : ciclistas){
            tiempTotalEquipo += ciclista.getTiempoAcumulado();
        }
    }
    protected List<String> listNombCiclistas(){
        List<String> nombres = new ArrayList<>();
        for (Ciclista ciclista : ciclistas){
        nombres.add(ciclista.getNombre());
        }
        return nombres;
    }
    
    protected void encontrarXid (int id){
    for (Ciclista ciclista : ciclistas){
        if (ciclista.getId() == id){
            ciclista.imprmDatos();
            return;
        }else {System.out.println("Ciclista con ID " + id + " no encontrado.");}
        }
        
    }
}


