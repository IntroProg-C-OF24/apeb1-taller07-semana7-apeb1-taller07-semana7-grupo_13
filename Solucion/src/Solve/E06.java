package Solve;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class E06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreCliente, reporte = "";
        int tipoCliente;
        double precio;
        
        for(int i = 0; i < 7; i++){
            System.out.println("Ingrese el nombre del cliente número " + (i+1));
            nombreCliente = sc.nextLine();
            
            System.out.println("Ingrese el costo de la computadora: ");
            precio = sc.nextDouble();
            
            System.out.println("Ingrese tipo de cliente: ");
            tipoCliente = sc.nextInt();
            
            if(tipoCliente == 1){
                precio -= precio * 0.10;
            }else if(tipoCliente == 2){
                precio -= precio * 0.20;
            }
            
            reporte += "Cliente: " + nombreCliente + " tipo " + tipoCliente + " compra computadora con precio $" + precio
                    + "\n";
            
            sc.nextLine(); //Limpiar the damn scanner.
         }
        
        System.out.println("Reporte de compras: ");
        System.out.print(reporte);
    }
}
