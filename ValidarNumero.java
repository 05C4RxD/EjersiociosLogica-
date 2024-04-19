import java.util.Scanner;
class ValidarNumero {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a;
        System.out.println("                  DETECTOR DE PAR O IMPAR");
        do{
            System.out.println("INGRESA UN NÚMERO: ");
            a = scaner.nextInt();
            if(a%2 == 0){
                System.out.println("EL NÚMERO ES PAR");
            }else{
                System.out.println("EL NÚMERO ES IMPAR");
            }
        }while(a>0);
    }
}
