import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("   ");
        System.out.println("BIENVENIDOS a immersion en JAVA");
        System.out.println("   ");

        //System.out.println("Pelicula The Avengers");
        int i=0;
        int fechaDeLanzamiento = 2015;
        double evaluacion = 4.6;
        boolean incluidoenBasico = true;
        String nombre= "The Avengers";
        String sinopsis = """
                La pelicula con mas recaudacion en los ultimos años
                """;
        double mediaevualateuser =0;

        double mediaevaluacion = (4.5 + 4.9 + 2.5 + 3.2)/4;

        System.out.println("Media Evaluacion de: " + " " + nombre + " " +  mediaevaluacion);


        System.out.println("Pelicula: " + nombre);
        System.out.println("Lanzamiento: "+ fechaDeLanzamiento);
        System.out.println("Evaluacion: " + evaluacion);
        System.out.println("En Plan: " + incluidoenBasico);

        if (fechaDeLanzamiento >= 2023 ){
            System.out.println("Pelicula popular en su momento");

        } else {
            System.out.println("´Pelicula retro que si vale la pena ver");
        }

        for (int i = 0; i < 3 ; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese una nota a The avengers: ");
            double notaMovie= teclado.nextDouble();
            mediaevualateuser = mediaevaluacion + notaMovie;
        }

        /*
        while (i < 3) {
            System.out.println("Ingrese una nota a The avengers: ");
            Scanner teclado = new Scanner(System.in);
            double notaMovie = teclado.nextDouble();
            mediaevaluacion += notaMovie;
            i++;
        }
        */

        System.out.println("Media de la pelicula" +
                "The avengers es: " + mediaevualateuser/3);




    }
}
