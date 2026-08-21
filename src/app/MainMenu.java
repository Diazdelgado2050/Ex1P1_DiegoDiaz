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

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        do {

            System.out.println("===Menu===");
            System.out.println("1. Mensaje Secreto Encriptado - Holocron Encriptado");
            System.out.println("2. Tie Fighter en java - Diseño de tie Fighter");
            System.out.println("3. Cadena Escondida - Cadena Escondida");
            System.out.println("4. Salir");
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
                    
                    
                    

                    break;
                case 2:
                    System.out.println("Adios");

                    break;
                case 3:
                    System.out.println("Buenas");

                    break;
                default:
                    System.out.println("");
                    System.out.println("Ingrese una opcion valida");
            }

        } while (opcion != 4);
        System.out.println("jejejeje atrapado");

    }
    
    public static String encriptar(String palabras, String clave){
        String resultado = "";
        
        
        
        for (int i = 0; i < palabras.length(); i++) {
            char letra = palabras.charAt(i);
            if (letra >= 'a' || letra <= 'z') {
                
                int cambiarPos = 0;
                cambiarPos = clave.charAt(i % clave.length() - 'a');
                
                if (i % 2 == 0) {
                    
                    int cambiarLetra = letra + cambiarPos;
                    if (cambiarLetra > 'z') {
                        cambiarLetra -= 25;
                    
                    }
                    resultado += (char) cambiarLetra;
                    
                    
                }
                
            }else{
                resultado += letra;
            }
                    
            
        }

        return resultado;

    }

}
