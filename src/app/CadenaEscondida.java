
package app;

/**
 *
 * @author diego
 */
public class CadenaEscondida {

    public String invertir(String cadena) {
        String invertir = "";

        for (int i = 0; i < cadena.length(); i++) {
            invertir = cadena.charAt(i) + invertir;
        }
        return invertir;
    }

    public String borrarcaracter(String cadena, int indice) {
        String cadenaBase = "";

        if (indice < 0 || indice >= cadena.length()) {
            return cadena;
        }

        for (int i = 0; i < cadena.length(); i++) {
            if (i == indice) {
                cadenaBase = cadenaBase + "-";
            } else {
                cadenaBase = cadenaBase + cadena.charAt(i);
            }
        }
        return cadenaBase;
    }
       public boolean procesarCadenas(String base, String escondida, String comandos) {
       
        base = base.toLowerCase();
        escondida = escondida.toLowerCase();
        comandos = comandos.toLowerCase();

        String actual = base; 
        int posision = 0;

        
        while (pos < comandos.length()) {
            char comando = comandos.charAt(pos);

            if (comando == 'i') {
                actual = invertir(actual); 
                System.out.println("i: " + actual);
                posision++;
                
}
            
