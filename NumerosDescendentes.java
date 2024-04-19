import java.util.Scanner;
public class NumerosDescendentes {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a,b,c;
        System.out.println("                            ORDENADOR DE 3 NÚMEROS");
        do{
            System.out.println("INGRSA 3 NúMERO: ");
            a = scaner.nextInt();
            b = scaner.nextInt();
            c = scaner.nextInt();
           if(a>b && b>c){
            System.out.println(a + " " + b + " " +c);
            }else if(a>c && c>b){
                System.out.println(a + " " + c + " " +b);
            }else if(b>a && a>c){
                System.out.println(b + " " + a + " " +c);
            }else if(b>c && c>a){
                System.out.println(b + " " + c + " " +a);
            }else if(c>a && a>b){
                System.out.println(c + " " + a + " " +b);
            }else if(c>b && b>a){
                System.out.println(c + " " + b + " " +a);
            }else{
                System.out.println(c + " " + b + " " +a);
           }
        }while(a>0);
    }
}
