import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Definición de variables
        //Primitivas
        double sueldo, sumaSueldo=0;
        int cantidadMayor1000=0;
        //Instancia
        Scanner teclado = new Scanner(System.in);

        for(int i = 1;i<=10;i++){
            //Pedir el sueldo
            System.out.println("Escriba el sueldo " + i );
            sueldo = teclado.nextDouble();
            sumaSueldo+=sueldo;
            if(sueldo>1000){
                cantidadMayor1000++;
            }
        }
        System.out.println("Suma de los sueldos "+ sumaSueldo);
        System.out.println("Cantidad de sueldos mayores a 1000 " + cantidadMayor1000);

    }
}
