package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //spotify
        //necesitamos registrar N canciones en la base de datos
        //de spotify, cada cancion debe tener:
        //id
        //nombre
        //artista
        //duracion
        //genero
        //año de lanzamiento
        //clasificacion edad

        //NECESIDADES (intentar no pasarme de 50 lineas de codigo)
        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String,Object>>canciones = new ArrayList<>();
        HashMap<String,Object>cancion= new HashMap<>();

        while(true){


            System.out.print("digita el nombre de la cancion: ");
            cancion.put("nombre",pedirDato.nextLine());

            System.out.print("digita el artista de la cancion: ");
            cancion.put("artista",pedirDato.nextLine());

            System.out.print("digita el genero de la cancion: ");
            cancion.put("duracion",pedirDato.nextLine());

            System.out.print("digita el año de lanzamiento: ");
            cancion.put("añoLanzamiento",pedirDato.nextLine());

            System.out.print("digita la clasificacion de la cancion: ");
            cancion.put("clasificacion",pedirDato.nextLine());

            System.out.print("digita el id de la cancion: ");
            cancion.put("id",pedirDato.nextInt());

            System.out.print("digita la duracion de la cancion en minutos: ");
            cancion.put("duracion",pedirDato.nextDouble());

            pedirDato.nextLine();



        }


    }
}