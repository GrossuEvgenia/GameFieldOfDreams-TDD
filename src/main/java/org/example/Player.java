package org.example;

public class Player {
    private int numberOfLives;
    private int guessedLetters;
    private char[] guessedWord;

    public Player(){
        numberOfLives=0;
        guessedLetters=0;
    }



    public char[] getGuessedWord() {
        return guessedWord;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public void setGuessedWord(char[] guessedWord) {
        this.guessedWord = guessedWord;
    }

    public void initializationGuessedWord(int size){
        guessedWord = new char[size];
        for(int i=0; i<size;i++)
            guessedWord[i]='_';
    }

    public void reduceNumberOfLives(){
        numberOfLives--;
    }
}
