package palandromo;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Palindromo {
    static Logger logger = Logger.getLogger(Palindromo.class.getName());
    static PalindromoDto palindromoDto = new PalindromoDto();
    static PalindromoMessageDto palindromoMessageDto = new PalindromoMessageDto();

    //Se ignore todos los caracteres no alfanuméricos como puntuación y espacios.
    private static boolean isAlphanumeric(char c) {
        return !Character.isAlphabetic(c) && !Character.isDigit(c);
    }

    public static boolean validPalindromeIgnorePunctuation(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            //Omite caracteres alfanuméricos.
            while (j >= 0 && isAlphanumeric(s.charAt(j))) j--;
            while (i < s.length() && isAlphanumeric(s.charAt(i))) i++;
            //Verifique no que no queda nada por validar.
            if (i >= j) return true;

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }
        return true;
    }

    //Reliza la validación de cada una de las palabras setteadas dentro de los getters, regresando un true si es un
    //palindromo;en caso, de que no sea una palindromo gresará false.
    public static void main(String[] args) {
        boolean value1 = validPalindromeIgnorePunctuation(palindromoDto.getWordOne());
        boolean value2 = validPalindromeIgnorePunctuation(palindromoDto.getWordTwo());
        boolean value3 = validPalindromeIgnorePunctuation(palindromoDto.getWordThree());
        boolean value4 = validPalindromeIgnorePunctuation(palindromoDto.getWordFour());
        logger.log(Level.INFO, () -> palindromoMessageDto.getMessageIs() + palindromoDto.getWordOne() +
                palindromoMessageDto.getMessagePalandromo()  + value1);
        logger.log(Level.INFO, () -> palindromoMessageDto.getMessageIs() + palindromoDto.getWordTwo() +
                palindromoMessageDto.getMessagePalandromo()  + value2);
        logger.log(Level.INFO, () -> palindromoMessageDto.getMessageIs() + palindromoDto.getWordThree() +
                palindromoMessageDto.getMessagePalandromo() + value3);
        logger.log(Level.INFO, () -> palindromoMessageDto.getMessageIs() + palindromoDto.getWordFour() +
                palindromoMessageDto.getMessagePalandromo() + value4);
    }
}