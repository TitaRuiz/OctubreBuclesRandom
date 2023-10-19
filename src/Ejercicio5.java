import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Declaración variables
        //Primitivas
        int numero, numerosPositivos=0, numerosNegativos=0, sumaPositivos=0, sumaNegativos=0, cantidadCeros=0;
        //Instancia
        Scanner teclado = new Scanner(System.in);

        for(int i=1;i<=10;i++){
            //Leer el numero
            System.out.println("Escriba el número " + i);
            numero = teclado.nextInt();
            if(numero>=0){
                numerosPositivos++;
                //sumaPositivos=sumaPositivos + numero;
                sumaPositivos+=numero;
                if(numero==0){
                    cantidadCeros++;
                }
            }else{
                //Si entra aquí es que es negativo
                numerosNegativos++;
                sumaNegativos+=numero;
            }
        }
        System.out.println("Media de positivos " + (sumaPositivos/numerosPositivos));
        System.out.println("Media de negativos " + (sumaNegativos/numerosNegativos));
        System.out.println("Cantidad de ceros " + cantidadCeros);

    }
}
