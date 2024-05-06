import Model.pelicula;

import java.util.Scanner;

public class principal {

    public void muestraelMenu(){

        int option = 0;
        Scanner teclado = new Scanner(System.in);
        while (option != 9){
            String menu = """
                    
                    Bienvenid(a) Screenmatch
                    1) Registrar nueva pelicula
                    2) Registrar nueva Serie
                    9) Exit
                    """;
            System.out.println(menu);
            option = teclado.nextInt();
            teclado.nextLine();
            switch (option){
                case 1:
                    System.out.println("Ingrese el Nombre de la Pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año Lanzamiento de la pelicula");
                    int fechadeLanzamiento1 = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en miniutos");
                    int duracionminutes = teclado.nextInt();
                    teclado.nextLine();
                    pelicula peliculausuario = new pelicula();
                    peliculausuario.setNombre(nombre);
                    peliculausuario.setFechaLanzamiento(fechadeLanzamiento1);
                    peliculausuario.setTimeduracion(duracionminutes);
                    peliculausuario.muestrafichatecnica();
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;


                default:
                    System.out.println("No valid");
                    break;
            }

        }



    }


}
