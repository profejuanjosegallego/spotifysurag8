package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //spotify

        //Necesitamos registrar n canciones en la base de datos de spotify por cada cancion
        // debe tener un id, nombre, artista, duracion, genero, año de lanzamiento y clasificaion edad

        //Necesidades intentar no pasarme de 50 lineas de codigo

        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String,Object>>canciones = new ArrayList<>();
        HashMap<String,Object> cancion = new HashMap<>();

        while (true){



            System.out.print("Digita el nombre de la cancion: ");
            cancion.put("nombre", pedirDato.nextLine());

            System.out.print("Digita el artista de la cancion: ");
            cancion.put("artista", pedirDato.nextLine());

            System.out.print("Digita el genero de la cancion: ");
            cancion.put("genero", pedirDato.nextLine());

            System.out.print("Digita el año de lanzamiento: ");
            cancion.put("añoLanzamiento", pedirDato.nextLine());

            System.out.print("Digita la clasificacion de edad: ");
            cancion.put("clasificacion", pedirDato.nextLine());

            System.out.print("Digita el id de la cancion: ");
            cancion.put("id", pedirDato.nextInt());

            System.out.print("Digita la duracion de la cancion en minutos");
            cancion.put("duracion", pedirDato.nextDouble());

            pedirDato.nextLine();










        }



    }
}