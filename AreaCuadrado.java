import java.util.Scanner;
class AreaCuadrado{
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a;
        System.out.println("                   AREA DE UN CUADRADO");
        do{
            System.out.print("INGRESA UN LADO: ");
            a = scaner.nextInt();
            System.out.println("EL AREA ES: " + (a*a));
        }while(a!= 0);
    }
}