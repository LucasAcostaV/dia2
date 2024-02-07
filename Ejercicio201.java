//Cargar un array de manera aleatoria con 10 números enteros del -5 al 5. Imprimirlo en
//pantalla y computar cuál es el mayor elemento del vector.

import java.util.Random;

public class Ejercicio201 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio, aux=-5;
        int array[] = new int [10];

        for(int i=0;i<10;i++){
            numeroAleatorio = random.nextInt(11)-5;
            array[i] = numeroAleatorio;

            if(aux < array[i]){
                aux=array[i];
            }
        }

        for(int numero : array){
            System.out.printf("[");
            System.out.printf(""+numero);
            System.out.printf("] ");
        }

        System.out.printf("\nEl mayor elemento del array es [%d]",aux);
    }
}
