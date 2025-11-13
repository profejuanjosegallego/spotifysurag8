package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //spotify
        //necesitamos registrar N canciones en la base de datos de
        //spotify, cada cancion debe tener:

        //id
        //nombre
        //artista
        //duracion
        //genero
        //año de lanzamiento
        //clasificacion de edad

        //necesidades (intentar no pasarme de 50 lineas de codigo)
        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String,Object>>canciones=new ArrayList<>();
        HashMap<String,Object>cancion=new HashMap<>();
        while(true){

            System.out.print("Digita el nombre de la canción: ");
            cancion.put("nombre", pedirDato.nextLine());

            System.out.print("Digita el artista de la canción: ");
            cancion.put("artista", pedirDato.nextLine());

            System.out.print("Digita el genero de la canción: ");
            cancion.put("genero", pedirDato.nextLine());

            System.out.print("Digita el año de lanzamiento de la canción: ");
            cancion.put("añoLanzamiento", pedirDato.nextLine());

            System.out.print("Digite la clasificación de edad de la canción: ");
            cancion.put("clasificacion", pedirDato.nextLine());

            System.out.print("Digita el id de la canción: ");
            cancion.put("id", pedirDato.nextInt());

            System.out.print("Digita la duración de la canción en minutos: ");
            cancion.put("duracion", pedirDato.nextDouble());

            pedirDato.nextLine();






        }


    }
}