import java.util.Scanner;

//Dada una cadena de caracteres (String) de longitud desconocida que tiene solamente dígitos,
//crear un array de N elementos (donde N es el tamaño de la cadena) que tenga cada uno de los
//valores numéricos de los dígitos.

public class Ejercicio204 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        char array[];
        int i;

        System.out.printf("Ingrese una cadena de numeros: ");
        cadena = entrada.nextLine().replaceAll("[^1-9]","");

        array = new char[cadena.length()];

        System.out.printf("\n");
        for (i=0; i<cadena.length(); i++){
            array[i] = cadena.charAt(i);
            System.out.printf("[%c]",array[i]);
        }
    }
}
