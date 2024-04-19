import java.util.Scanner;
class AreaTringulo {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int a,b;
        do{
            System.out.println("                   AREA DE UN TRIANGULO");
            System.out.println("INGRESE LA BASE: ");
            a = op.nextInt();
            System.out.println("INGRESE LA ALTURA: ");
             b = op.nextInt();
            System.out.println("EL AREA ES: " + (a*b)/2);  
        }while(a>0 );
    }
}
