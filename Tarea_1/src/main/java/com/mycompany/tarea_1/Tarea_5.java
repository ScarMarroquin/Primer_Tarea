
package com.mycompany.tarea_1;

import java.util.Scanner;

public class Tarea_5 {
        public static void main(String[] args) {
        Scanner rad = new Scanner(System.in);
        
            System.out.println("INGRESE EL RADIO DEL CONO");
                int radio = rad.nextInt();
            System.out.println("INGRESE LA ALTURA DEL CONO");
                int altura = rad.nextInt();
                    
                    final float Pi = 3.1416f;
                    float formula = (Pi*(radio*radio)*altura)/3;
                    
            System.out.println("EL VOLUMEN DEL CONO ES: "+formula);
    }
}
