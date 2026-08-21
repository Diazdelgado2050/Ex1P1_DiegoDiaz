/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class MainMenu {

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {

            System.out.println("===Menu===");
            System.out.println("1. Mensaje Secreto Encriptado - Holocron Encriptado");
            System.out.println("2. Tie Fighter en java - Diseño de tie Fighter");
            System.out.println("3. Cadena Escondida - Cadena Escondida");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opcion del menu: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el mensaje del templo jedi");
                    String mensaje = leer.nextLine();

                    System.out.println("Ingrese la palabra clave del holocron");
                    String clave = leer.nextLine();

                    System.out.println("Desea encriptar (1) o desencriptar (2) el mensaje:");
                    int opc = leer.nextInt();

                    if (opc == 1) {
                        String resultado = encriptar(mensaje, clave);
                        System.out.println("A escondido el mensaje de las tropas imperiales. Su mensajes en criptado es:");
                        System.out.println(resultado);
                        
                        

                    }else if (opc == 2){
                        String resultado = desencriptar(mensaje, clave);
                        
                    }

                    break;
                case 2:
                    System.out.println("Adios");

                    break;
                case 3:
                    System.out.println("Buenas");

                    break;
                case 0:
                    System.out.println("Saliendo del programa... :) ");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Ingrese una opcion valida");
            }

        } while (opcion != 4);
        System.out.println("jejejeje atrapado");

    }

    public static String encriptar(String mensaje, String clave) {

        String resultado = "";
        clave = clave.toLowerCase();

        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            if (letra >= 'a' || letra <= 'z') {

                int shift = clave.charAt(i % clave.length()) - 'a';

                if (i % 2 == 0) {

                    int cambiarLetra = letra + shift;
                    if (cambiarLetra > 'z') {
                        cambiarLetra -= 26;

                    }
                    resultado += (char) cambiarLetra;

                } else {
                    int cambiarLetra = letra - shift;
                    if (cambiarLetra < 'a') {
                        cambiarLetra += 26;

                    }
                    resultado += (char) cambiarLetra;

                }

            } else {
                resultado += letra;

            }

        }

        return resultado;

    }

    public static String desencriptar(String mensaje, String clave) {
        String resultado = "";
        clave = clave.toLowerCase();

        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            if (letra >= 'a' || letra <= 'z') {

                int cambiarPos = clave.charAt(i % clave.length() - 'a');

                if (i % 2 == 0) {

                    int cambiarLetra = letra - cambiarPos;
                    if (cambiarLetra > 'a') {
                        cambiarLetra -= 25;

                    }
                    resultado += (char) cambiarLetra;

                }

            } else {
                resultado += letra;
            }

        }

        return resultado;

    }

}
