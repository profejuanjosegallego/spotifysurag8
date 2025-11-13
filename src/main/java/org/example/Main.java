package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //spotify
        // necesitamos registrar m canciones en la base de datos
        // de spotify, cada cancion debe tener
        // id
        // nombre
        // artista
        // duracion
        // genero
        // ano de lanzamiento
        // clasificacion edad
        // intentar no pasarme de 50 lineas de codigo

        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> canciones = new ArrayList<>();

        while (true) {
            HashMap<String, Object> cancion = new HashMap<>();

            System.out.print("Digita el ID de la cancion: ");
            cancion.put("id", pedirDato.nextInt());
            pedirDato.nextLine();

            System.out.print("Digita el nombre de la cancion: ");
            cancion.put("nombre", pedirDato.nextLine());

            System.out.print("Digita el artista de la cancion: ");
            cancion.put("artista", pedirDato.nextLine());

            System.out.print("Digita la duracion de la cancion en minutos: ");
            cancion.put("duracion", pedirDato.nextDouble());
            pedirDato.nextLine();

            System.out.print("Digita el genero de la cancion: ");
            cancion.put("genero", pedirDato.nextLine());

            System.out.print("Digita el ano de lanzamiento: ");
            cancion.put("ano", pedirDato.nextInt());
            pedirDato.nextLine();

            System.out.print("Digita la clasificacion de la cancion: ");
            cancion.put("clasificacion", pedirDato.nextLine());

            canciones.add(cancion);

            System.out.print("¿Deseas agregar otra cancion? (s/n): ");
            String continuar = pedirDato.nextLine();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("\n--- Canciones registradas ---");
        for (HashMap<String, Object> c : canciones) {
            System.out.println(c);
        }

        pedirDato.close();
    }
}
