import java.util.Scanner;
class AreaCirculo{
public static void main(String[] args) {
    Scanner op = new Scanner(System.in);
    int r;
    System.out.println("                   AREA DE UN CIRCULO");
    do{
        System.out.print("INGRESE EL RADIO: ");
        r = op.nextInt();
        System.out.println("EL AREA DEL CIRCULO ES: " + (Math.PI*(r*r)));
    }while(r!= 0);
}
}