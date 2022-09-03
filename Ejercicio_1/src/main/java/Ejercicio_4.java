
import java.util.Scanner;


public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner grad = new Scanner(System.in);
        
        System.out.println("INGRESE LOS GRADOS CENTIGRADOS");
            double c = grad.nextDouble();
            
            double F=32+(9*c/5);
            
            System.out.println("LA CONVERSION A GRADOS FAHRENHEIT ES: "+F);
    }
}
