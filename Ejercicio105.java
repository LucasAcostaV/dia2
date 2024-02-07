import java.util.Scanner;

//Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es,
//también debemos indicarlo.

public class Ejercicio105 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero;

        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.printf("El numero %d es divisible entre 2",numero);
        }else{
            System.out.printf("El numero %d no es divisible entre 2",numero);
        }
    }
}
