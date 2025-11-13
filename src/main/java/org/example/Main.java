package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //spotify


        //Intentar no pasarme de 50 linea de codigo
        //Necesitamos registrar n canciones en la base de datos de spotify, cada cancion debe tener.
        //ID
        //nombre
        //artista
        //duracion
        //genero
        //año lanzamiento
        //clasificacion edad








        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String,Object>>canciones = new ArrayList<>();

        String decision = "entrar";


        while(!decision.equals("salir")){

            System.out.println("Digita salir si quieres terminar, de lo contrario digita cualquier cosa: ");
            decision=pedirDato.nextLine();
            System.out.println("Dijitaste " + decision);
            if (decision.equals("salir")){
                break;
            }



            HashMap<String, Object> cancion = new HashMap<>();


            //Cargando diccionario

            System.out.print("Digita el nombre de la canción: ");
            cancion.put("nombre", pedirDato.nextLine());

            System.out.print("Digita el artista de la canción: ");
            cancion.put("artista", pedirDato.nextLine());

            System.out.print("Digita el genero de la canción: ");
            cancion.put("genero", pedirDato.nextLine());

            System.out.print("Digita el año de lanzamiento: ");
            cancion.put("añoLanzamiento", pedirDato.nextLine());

            System.out.print("Digita la clasificación de edad:  ");
            cancion.put("clasificacion", pedirDato.nextLine());

            System.out.print("Digita el ID de la canción: ");
            cancion.put("id", pedirDato.nextInt());

            System.out.print("Digita la duración de la canción (En minutos): ");
            cancion.put("duracion", pedirDato.nextDouble());

            pedirDato.nextLine();

            //Cargando la lista
            canciones.add(cancion);
            System.out.println("Canción agregada a la lista con exito");

            //mostrando la lista
            System.out.println(canciones);

//ES IMPORTANTE EL ORDEN DE LOS TIPOS DE DATOS, PORQUE SE VUELVE LOCO.


        }
    }
}