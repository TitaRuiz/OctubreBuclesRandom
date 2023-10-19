import java.util.Random;

public class PruebaRandom {
    public static void main(String[] args) {
        //Variable de instancia
        Random numeroAleatorio = new Random();
        //Mostrar un número aleatorio
        System.out.println(numeroAleatorio.nextInt());
        System.out.println(numeroAleatorio.nextInt(50));
        System.out.println(numeroAleatorio.nextInt(1,6));

    }

}
