package Solve;
import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float total[] = new float[5], costDiaz[] = new float[5];
        
        int numDias[] = new int[5];
        String nombrez[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Coloca el nombre del individuo");
            nombrez[i] = sc.nextLine();
            System.out.println("Cuantos dias trabajo?");
            numDias[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Cuanto le paga usted por dia?");
            costDiaz[i] = sc.nextFloat();
            sc.nextLine(); 
            total[i] = (numDias[i] * costDiaz[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(nombrez[i] + " trabaja " + numDias[i] + " dias y usted le paga " + costDiaz[i] + "$, por lo tanto debe pagarle un total de: " +total[i]+" $");
        }
    }
}
// Por MRodz 😉