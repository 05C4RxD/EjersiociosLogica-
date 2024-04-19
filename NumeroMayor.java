import java.util.Scanner;
class NumeroMAyor{
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a,b;
        System.out.println("                   NÚMERO MÁS ALTO");
        do{
            System.out.print("INGRESA UN NÚMERO: ");
            a = scaner.nextInt();
            System.out.print("INGRESA UN NÚMERO: ");
            b = scaner.nextInt();
            if(a>b){
                System.out.println(a + " ES MAYOR");
            }else{
                System.out.println(b + " ES MAYOR");
            }
        }while(a>0);
    }
}