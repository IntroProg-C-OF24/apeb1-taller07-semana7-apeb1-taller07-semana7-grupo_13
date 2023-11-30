package Solve;
public class E07 {
    public static void main(String[] args) {
        int num= -1;
        int num2= 1;
        do{
            System.out.println(num + " / " +num2);
            num= num *(-1);
            num2= num2+1;
        }while(num2<=10);
    }
}
// Por MRodz 😉