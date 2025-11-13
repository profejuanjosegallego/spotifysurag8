package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //spotify
        //Necesitamos registrar N canciones en la base de datos de Spotify,
        //cada cancion debe tener:
        //una Id
        //un nombre
        //un artista
        //una duracion
        //un genero
        //un año de lanzamiento
        //una clasificacion de edad

        //Necesidades (Intentar no pasarme de 50 lienas de código)
        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> canciones = new ArrayList<>();
        HashMap<String, Object>cancion=new HashMap<>();
        while(true){
            System.out.print("Digita el nombre de la canción: ");
            cancion.put("nombre", pedirDato.nextLine());

            System.out.print("Digite el artista de la canción: ");
            cancion.put("artista", pedirDato.nextLine());

            System.out.print("Digita el genero de la cancion: ");
            cancion.put("genero", pedirDato.nextLine());

            System.out.print("Digita el año de lanzamiento de la canción: ");
            cancion.put("añoLanzamiento", pedirDato.nextLine());

            System.out.print("Digite la clasificación de edad que tiene la canción: ");
            cancion.put("clasificacionEdad", pedirDato.nextLine());

            System.out.print("Digita el Id de la canción: ");
            cancion.put("id", pedirDato.nextInt());

            System.out.print("Digite la duración de la canción en minutos: ");
            cancion.put("duracion", pedirDato.nextDouble());

            pedirDato.nextLine();
        }
    }
}