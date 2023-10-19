import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            i++;
            if(i==5){
                continue;
            }
            System.out.println(i);

        }
        //Mostrar los 5 primeros numeros impares utilizando la palabra reservada continue
        System.out.println("Impares");
        i = 0;
        while (i <= 9) {
            i++;
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }

        i = 1;
        while (true) {
            if (i>10){
                break;
            }
            System.out.println(i);
            i++;
        }
        //1.	Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
        //Declarar variables
        //Primitivas
        int numero = 0;
        //Instancia
        Scanner teclado = new Scanner(System.in);
        while (numero >= 0) {
            //Solicitar el número
            System.out.println("Escriba un numero y cuando quiera salir escriba uno negativo");
            numero = teclado.nextInt();
            if (numero >= 0) {
                System.out.println("El cuadrado de " + numero + " es " + (numero * numero));
                System.out.println("El cuadrado de " + numero + " es " + Math.pow(numero, 2));
            } else {
                System.out.println("Gracias ...");
            }
        }
        while (true) {
            //Solicitar el número
            System.out.println("Escriba un numero y cuando quiera salir escriba uno negativo");
            numero = teclado.nextInt();
            if (numero >= 0) {
                System.out.println("El cuadrado de " + numero + " es " + (numero * numero));
                System.out.println("El cuadrado de " + numero + " es " + Math.pow(numero, 2));
            } else {
                System.out.println("Gracias ...");
                break;
            }
        }

    }
}
