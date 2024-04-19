import java.util.Scanner;
class Multipplicacion{
    public static void main(String[] args) {
        int a,b;
        Scanner op = new Scanner(System.in);
        System.out.println("           MULTIPLICACIÓN");
        System.out.print("INGRESA UN NÚMERO: ");
        a = op.nextInt();
        System.out.print("INGRESA OTRO NÚMERO: ");
        b = op.nextInt();
        System.out.println("TU RESULTADO ES: " + (a*b));
    }
}
