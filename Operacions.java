import java.util.Scanner;
class Operaciones{
    public static void main(String[]args){
        Scanner op = new Scanner(System.in);
        int a,b,c;
        System.out.println("                   CALCULADORA");
        do{
            System.out.println("¿QUE DECEAS HACER?");
            System.out.println("0.- SALIR");
            System.out.println("1.- SUMA");
            System.out.println("2.- RESTA");
            System.out.println("3.- ULTIPLICACIÓN");
            System.out.println("4.- DIVISIÓN");
            System.out.println("5.- MODULO");
            a = op.nextInt();
            switch (a) {
                case 1:
                System.out.println("          SUMA");
                System.out.print("INGRESE UN NÚMERO: ");
                b = op.nextInt();
                System.out.print("INGRESE OTRO NÚMERO: ");
                c = op.nextInt();
                System.out.println("TU RESULTADO ES: " + (b+c));
                    break;
                case 2:
                System.out.println("          RESTA");
                System.out.print("INGRESE UN NÚMERO: ");
                b = op.nextInt();
                System.out.print("INGRESE OTRO NÚMERO: ");
                c = op.nextInt();
                System.out.println("TU RESULTADO ES: " + (b-c));
                   break;
                case 3:
                System.out.println("          MULTIPLICACIÓN");
                System.out.print("INGRESE UN NÚMERO: ");
                b = op.nextInt();
                System.out.print("INGRESE OTRO NÚMERO: ");
                c = op.nextInt();
                System.out.println("TU RESULTADO ES: " + (b*c));
                    break;
                case 4:
                System.out.println("          DIVISIÓN");
                System.out.print("INGRESE UN NÚMERO: ");
                b = op.nextInt();
                System.out.print("INGRESE OTRO NÚMERO: ");
                c = op.nextInt();
                System.out.println("TU RESULTADO ES: " + (b/c));
                   break;
                case 5:
                System.out.println("          MODULO");
                System.out.print("INGRESE UN NÚMERO: ");
                b = op.nextInt();
                System.out.print("INGRESE OTRO NÚMERO: ");
                c = op.nextInt();
                System.out.println("TU RESULTADO ES: " + (b%c));
                   break;
                default:
                    break;
            }
        }while(a>0);
    }
    
}