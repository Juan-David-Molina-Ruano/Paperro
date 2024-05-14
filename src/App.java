import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        short cantidad  = 0 ;
        double precio = 0;
        double total = 0;


        //pedir la cantidad 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos a comprar: ");
        cantidad = sc.nextShort();

        //pedir el precio
        System.out.print("Ingrese el precio del producto: ");
        precio = sc.nextDouble();
        sc.close();

        //calcular el total
        total = cantidad * precio;
        
        //imprimir el total
         System.out.println("el total es : " + total);

    }
}
