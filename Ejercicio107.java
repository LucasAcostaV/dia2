import java.util.Scanner;

//Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.

public class Ejercicio107 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int i;

        for(i=1;i<=100;i++){
            if( i%2 == 0 && i%3 ==0){
                System.out.printf(i+"-");
            }
        }
    }
}
