package Ejercicio1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = menu();

        // SegÃºn la opcion introducida debemos lanzar un proceso u otro.
        // Todos los procesos son comandos de Windows, por lo que deben comenzar con cmd

        switch (opc) {
            // Si elige crear una carpeta, debo pedirle tambien la ruta donde quiere crearla
            // y el nombre de la carpeta
            case 1:
                System.out.println("Introduce la ruta: ");
                String ruta = sc.nextLine();
                System.out.println("Introduce el nombre de la carpeta a crear: ");
                String carpeta = sc.nextLine();
                String[] comando1 = {"cmd", "/C", "md", ruta+carpeta };
                crearCF(comando1);

                break;
            // Si elige crear un fichero, debo pedirle tambien la ruta donde quiere crearlo
            // y el nombre del fichero
            case 2:
                System.out.println("Introduce la ruta: ");
                String ruta2 = sc.nextLine();
                System.out.println("Introduce el nombre del fichero a crear: ");
                String fichero = sc.nextLine();
                String[] comando2 = {"cmd", "/C", "type", "nul", ">", ruta2+fichero};
                crearCF(comando2);
                break;
            // Si elige mostrar un directorio, debo pedirle tambien la ruta del directorio a
            // mostrar. Si lo deja vacio, debo mostrar el contenido del directorio actual
            case 3:


                break;
            default:
                System.out.println("La opcion introducida no es correcta");
        }
    }

    public static int menu() {
        // En opc guardaremos la opcion seleccionada por el usuario
        int opc;
        Scanner sc = new Scanner(System.in);

        // Imprimimos el menu con las diversas opciones
        System.out.println("Elija que comando desea ejecutar:");
        System.out.println("1. Crear carpeta");
        System.out.println("2. Crear fichero");
        System.out.println("3. Mostrar contenido del directorio");

        // Leemos la opcion de teclado
        opc = sc.nextInt();


        return opc;
    }

    public static void crearCF(String[] comando){


        ProcessBuilder pb1 = new ProcessBuilder(comando);
        pb1.inheritIO();
        try {
            Process p1 = pb1.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}