package binario;

import java.util.ArrayList;
import java.util.List;

public class BinarioParaCaracter {

    public static void main(String[] args) {
    	
        List<String> listaBinario = new ArrayList<>();
        
        listaBinario.add("01101100");
        listaBinario.add("01100101");
        listaBinario.add("01101001"); 
        listaBinario.add("01100001"); 
        listaBinario.add("00100000"); 
        listaBinario.add("01101111"); 
        listaBinario.add("00100000"); 
        listaBinario.add("01110001"); 
        listaBinario.add("01110010"); 
        listaBinario.add("00100000"); 
        listaBinario.add("01100011"); 
        listaBinario.add("01101111"); 
        listaBinario.add("01100100"); 
        listaBinario.add("01100101"); 
        listaBinario.add("00100000"); 
        listaBinario.add("01100001"); 
        listaBinario.add("01101111"); 
        listaBinario.add("00100000"); 
        listaBinario.add("01101100"); 
        listaBinario.add("01100001"); 
        listaBinario.add("01100100"); 
        listaBinario.add("01101111");

        
        List<Character> caracteres = binarioParaCaracteres(listaBinario);
        
        System.out.println("FRASE DESCODIFICADA:");
        for (char caracter : caracteres) {
            System.out.print(caracter + " ");
        }
    }

    public static List<Character> binarioParaCaracteres(List<String> binarioStrings) {
        
    	List<Character> listra = new ArrayList<>();
        
        for (String binarioString : binarioStrings) {
            int valorDecimal = Integer.parseInt(binarioString, 2);
            listra.add((char) valorDecimal);
        }
        
        return listra;
    }
}