package parte02.ejercicio01;

import java.io.UnsupportedEncodingException;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "fbf";

		if(isPalindrome(text)){
			System.out.println("El texto: [" + text + "] es Palindromo");
			return;
		}

		System.out.println("El texto: [" + text + "] NO es Palindromo");
	}

	/**
	 * Evaluar si un texto es palindromo
	 * @param text texto a evaluar si es un palindromo
	 * @return true si es palindromo else false
	 */
	public static boolean isPalindrome(String text)
    {
        StringBuffer sb = new StringBuffer();
        boolean result = false;
 
        //iterar cadena del ultimo caracter al 1ero y concatenarlo en el buffer
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
 
        // evaluar la cadena original VS la cadena calculada
        if (text.equalsIgnoreCase(sb.toString())) {
        	result = true;
        }

        return result;
    }

}
