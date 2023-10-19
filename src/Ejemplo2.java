public class Ejemplo2 {
    public static void main(String[] args) {
        //Mostrar las 10 tablas de multiplicar

        for(int j = 1;j<=10;j++){
            System.out.println("Tabla de multiplicar del " + j);
            for(int i = 1;i<=10;i++){
                System.out.println(j + " * "+ i + " = "+ j*i );
            }
        }

    }
}