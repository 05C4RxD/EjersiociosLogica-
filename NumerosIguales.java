import java.util.Scanner;
class NumerosIguales{
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a,b;
        System.out.println("                   NÚMEROS IGUALES");
        do{
            System.out.print("INGRESA UN NÚMERO: ");
           a = scaner.nextInt();
           System.out.print("INGRESA UN NÚMERO: ");
           b = scaner.nextInt();
           if(a==b){
                System.out.println("LOS NÚMEROS SON IGUALES");
            }else{
                System.out.println("LOS NÚMEROS NO SON IGUALES");
            }
        }while(a > 0);
    }
}
