import java.util.Scanner;
class MultiRecursiva{
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int a,b;
        System.out.println("                   MULTIPLICACIÓN RECURSIVA");
        do{
            System.out.print("INGRESE UN NÚMERO: ");
            a = op.nextInt();
            System.out.print("INGRESA OTRO NÚMERO: ");
            b = op.nextInt();
            System.out.println("TU RESULTADO ES: " + (a*b));
        }while(a>0);
    }
}
