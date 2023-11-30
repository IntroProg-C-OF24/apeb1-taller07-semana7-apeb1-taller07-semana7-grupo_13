package Solve;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class E04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalJugadores = 0, totalEdades = 0, edadActual;
        double totalEstaturas = 0, estaturaActual = 0;
        boolean continuar = true;
        String reporte = "", jugadorActual, posicionActual;

        while (continuar) {
            System.out.println("Ingrese el nombre del jugador: ");
            jugadorActual = sc.nextLine();

            System.out.println("Ingrese la posición del jugador: ");
            posicionActual = sc.nextLine();

            System.out.println("Ingrese la edad del jugador: ");
            edadActual = sc.nextInt();
            
            
            System.out.println("Ingrese la estatura del jugador (ejemplo: 1.87): ");
            estaturaActual = sc.nextDouble();

            reporte += "1. " + jugadorActual + " - " + posicionActual + " -, edad "
                    + edadActual + ", estatura " + estaturaActual + "\n";

            System.out.println("Jugador agregado exitosamente.");
            System.out.println("¿Desea introducir más jugadores? 1 = SI. 2 = NO");
            int opcion = sc.nextInt();
            sc.nextLine(); //Limpiar el scanner
            if (opcion != 1) {
                continuar = false;
            }
            totalEdades += edadActual;
            totalEstaturas += estaturaActual;
            totalJugadores++;
        }

        System.out.println("Listado de jugadores:");
        System.out.println("------------------------");
        System.out.println(reporte);
        System.out.println("--------------------------");
        System.out.println("Promedio de edades: " + (totalEdades / totalJugadores));
        System.out.println("Promedio de estatura: " + (totalEstaturas / totalJugadores) + "mts. ");

    }
}
