package palandromo;

public class PalindromoMessageDto {
    private final String messageIs;
    private final String messagePalandromo;

    public PalindromoMessageDto(){
        this.messageIs = "La palabra: ";
        this.messagePalandromo = " ¿Es un palindromo? ";
    }

    public String getMessageIs() {
        return messageIs;
    }

    public String getMessagePalandromo() {
        return messagePalandromo;
    }
}
