//Lee un número por teclado que pida el precio de un producto (puede tener
//decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del
//10%.

import java.util.Scanner;

public class Ejercicio106 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float precio, precioSinIva,ivaTotal;
        final float iva = 0.1f;


        System.out.printf("Ingrese el precio del producto: ");
        precio = entrada.nextFloat();

        ivaTotal = precio * iva;
        precioSinIva = precio - ivaTotal;

        System.out.printf("El precio sin IVA es: %.2f",precioSinIva);
        System.out.printf("\nEl IVA es: %.2f",ivaTotal);
        System.out.printf("\nEl precio total es: %.2f",precio);

    }
}
