package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //spotify
        //Necesitamos registrar N canciones en la base de datos
        //en la base de datos de Spotify
        //cada cancion debe tene

        //id
        //nombre
        //artista
        //duracion
        //genero
        //año de lanzamiento
        //clasificacion de edad

        //NECESIDADES (Intentar no pasarme de 50 lineas de codigo)

        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> canciones = new ArrayList<>();

        String decision="Entrar";

        while (!decision.equals("Salir")) {

            System.out.println("Digite Salir si quiere terminar de lo contrario digite Entrar: ");
            decision=pedirDato.nextLine();
            System.out.println("Digitaste " + decision);

            if (decision.equals("salir")){
                break;
            }

            HashMap<String, Object> cancion = new HashMap<>();

            System.out.print("Digita el nombre de la cancion: ");
            cancion.put("nombre", pedirDato.nextLine());

            System.out.print("Digita el genero de la cancion: ");
            cancion.put("genero", pedirDato.nextLine());

            System.out.print("Digite el año de lanzamiento de la cancion: ");
            cancion.put("añoLanzamiento", pedirDato.nextLine());

            System.out.print("Digite la clasificacion de la cancion: ");
            cancion.put("clasificacion", pedirDato.nextLine());

            System.out.print("Digita el artista de la cancion: ");
            cancion.put("artista", pedirDato.nextLine());

            System.out.print("Digita el ID de la cancion: ");
            cancion.put("ID", pedirDato.nextInt());

            System.out.print("Digita la duracion de la cancion en minutos: ");
            cancion.put("duracion", pedirDato.nextDouble());


            pedirDato.nextLine();

            canciones.add(cancion);
            System.out.println("Cancion agregada a la lista con exito");

            System.out.println(canciones);


        }
    }
}