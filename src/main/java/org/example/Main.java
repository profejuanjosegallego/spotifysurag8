package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //spotify
        //necesitamos registrar N cantidad de datos
        //de espotify, cada cancion debe tener:
        //id
        //nombre
        //artista
        //duracion
        //genero
        //año delanzamiento
        //clasificacion de edad

        //NECESIDADES (no pasasr de 50 lineas de codigo)
        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String,Object>>canciones=new ArrayList<>();
        HashMap<String, Object>cancion=new HashMap<>();


        while(true){

            System.out.print("Digita el nombre de la cancion: ");
            cancion.put("nombre",pedirDato.nextLine());

            System.out.print("Digite el nombre del artista: ");
            cancion.put("artista", pedirDato.nextLine());

            System.out.print("Digite el genero de la cancion");
            cancion.put("genero",pedirDato.nextLine());

            System.out.print("Digite la clasificacion de edad");
            cancion.put("edad",pedirDato.nextLine());

            System.out.print("Digite el año de lanzamiento");
            cancion.put("año",pedirDato.nextLine());

            System.out.print("Digita el id de la cancion:");
            cancion.put("id",pedirDato.nextInt());


            System.out.print("Digita la duracion de la cancion (minutos)");
            cancion.put("duracion", pedirDato.nextDouble());










        }


    }
}