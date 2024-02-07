//Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si
//no lo es lo volverá a pedir (do while), después muestra ese número por consola.

import java.util.Scanner;

public class Ejercicio108 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero;

        do{
            System.out.printf("Ingrese un numero: ");
            numero = entrada.nextFloat();
        }while(numero < 0);

        System.out.printf("El numero %.2f es mayor o igual a 0",numero);

    }
}
