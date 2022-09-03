
import java.util.Scanner;


public class Ejercicio_3 {
    public static void main(String[] args) {
        int numdoble;
        int numtriple;
        
            Scanner num = new Scanner(System.in);
                System.out.println("INGRESE UN NUMERO:");
                int num1 = num.nextInt();

                numdoble= num1 *2;
                numtriple = num1 * 3;
                
            System.out.println("EL NUMERO DOBLE DE "+num1+" ES: "+numdoble);
            System.out.println("EL NUMERO DOBLE DE "+num1+" ES: "+numtriple);
            
            
    }
}
