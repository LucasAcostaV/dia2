//Cargar un array de manera aleatoria con 100 números enteros del -30 al 30. Imprimirlo en
//pantalla y computar cuál es el elemento que más veces se repite, y cuáles son los números
//que no están presentes (si es que hay alguno).

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio202 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio,cantidadDeRepeticiones=0,i,j,c,aux;
        int array[] = new int[100];
        ArrayList<Integer> numerosNoPresentes = new ArrayList<>();

        for (i=0; i<100; i++){
            numeroAleatorio = random.nextInt(61)-30;
            array[i] = numeroAleatorio;
        }

        aux = 0;
        c=0;

       for (i=0; i<100; i++){
           cantidadDeRepeticiones=0;
            for (j=i; j<100; j++){
                if (array[i] == array[j]){
                    cantidadDeRepeticiones += 1;
                }
                if(cantidadDeRepeticiones>c){
                    aux = array[i];
                    c=cantidadDeRepeticiones;
                }
            }
       }

        for(int numero : array){
            System.out.printf("[");
            System.out.printf(""+numero);
            System.out.printf("] ");
        }

        System.out.printf("\nEl numero que se repite mas veces es %d un total de %d veces",aux,c);

        Set<Integer> numerosPresentes = new HashSet<>();                //crea un nuevo objeto de tipo HashSet llamado numerosPresentes que almacenará números enteros.
        for (int num : array) {                                         //Set<Integer>: Esto declara una variable llamada numerosPresentes que es de tipo Set. Set es una interfaz en Java que representa una colección de elementos únicos, lo que significa que no puede contener elementos duplicados. <Integer> indica que este Set contendrá objetos de tipo Integer.
            numerosPresentes.add(num);                                  //new HashSet<>();: Aquí se crea una nueva instancia de HashSet. HashSet es una clase en Java que implementa la interfaz Set y se utiliza para almacenar elementos únicos. Se utiliza el operador new para crear una nueva instancia de HashSet. El tipo de elemento dentro de los corchetes angulares < > se infiere automáticamente como Integer debido a la declaración de tipo en la línea anterior.
        }

        System.out.printf("\nLos numeros del intervalo que no se encuentrar en el array son: ");

        for (i=-30; i<=30; i++) {                                       //if (!numerosPresentes.contains(i)) se utiliza para verificar si el conjunto numerosPresentes no contiene el elemento i.
            if (!numerosPresentes.contains(i)) {                        //numerosPresentes.contains(i): Este método contains(i) se llama en el conjunto numerosPresentes. Verifica si el conjunto contiene el elemento i. Devuelve true si el conjunto contiene i, y false de lo contrario.
                System.out.print(i + " ");                              //!: El operador ! se utiliza como operador de negación lógica. En este contexto, nega el resultado de numerosPresentes.contains(i), lo que significa que si numerosPresentes.contains(i) es true, !numerosPresentes.contains(i) será false, y viceversa.
            }
        }

    }
}
