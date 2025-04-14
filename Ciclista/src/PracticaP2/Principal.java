
package PracticaP2;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Equipo equipo = new Equipo("Team Águila", "Colombia");

        Velocista v = new Velocista(1, "Carlos Veloz", 400.0, 70.0);
        v.setTiempoAcumulado(120);

        Escalador e = new Escalador(2, "Juan Montaña", 2.5f, 12.0f);
        e.setTiempoAcumulado(140);

        Contrarelojista c = new Contrarelojista(3, "Luis Crono", 60.0);
        c.setTiempoAcumulado(110);

        equipo.addCiclista(v);
        equipo.addCiclista(e);
        equipo.addCiclista(c);

        equipo.calTiempoTotal();
        equipo.ImpDatosEquipo();
        System.out.println("\nLista de ciclistas:");
        equipo.listNombCiclistas();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el ID del ciclista que desea buscar: ");
        int idBuscado = scanner.nextInt();
        equipo.encontrarXid(idBuscado);
    }
}