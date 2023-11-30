
package Solve;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class E05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reporte = "", nombreEstudiante;
        double notaEstudiante;
        for(int i = 0; i < 4; i++){
            System.out.println("Ingrese nombre del estudiante número " + (i+1));
            nombreEstudiante = sc.nextLine();
            
            System.out.println("Ingrese el promedio del estudiante " + nombreEstudiante);
            notaEstudiante = sc.nextDouble();
            
            reporte += "Estudiante: " + nombreEstudiante + ".  " + notaEstudiante + ".  ";
            
            if(notaEstudiante >= 7.0){
                reporte += "Aprobado";
            }else{
                reporte += "Reprobado";
            }
            
            sc.nextLine(); //Limpiar Scanner
            reporte += "\n";
            
        }
        
        System.out.println(reporte);
    }
}
