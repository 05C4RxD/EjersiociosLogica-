import java.util.Scanner;
class NumerosEnBucle {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a;
        System.out.println("                  NUMERACIÓN");
        do{
            System.out.println("INGRESA UN NÚMERO: ");
            a = scaner.nextInt();
            for(int i = 0;i <= a; i++){
                System.out.println(i);
            }
        }while(a>0);
    }
}
