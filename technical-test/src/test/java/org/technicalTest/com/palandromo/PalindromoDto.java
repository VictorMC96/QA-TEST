package org.technicalTest.com.palandromo;

public class PalindromoDto {

    private final String wordOne;
    private final String wordTwo;
    private final String wordThree;
    private final String wordFour;

    public PalindromoDto(){
        this.wordOne = "acurrucA";
        this.wordTwo = "Hola";
        this.wordThree = "Reconocer";
        this.wordFour = "acariciar";
    }

    public String getWordOne() {
        return wordOne;
    }

    public String getWordTwo() {
        return wordTwo;
    }

    public String getWordThree() {
        return wordThree;
    }

    public String getWordFour() {
        return wordFour;
    }
}