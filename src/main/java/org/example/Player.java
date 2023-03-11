package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

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

    public int getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessedLetters(int guessedLetters) {
        this.guessedLetters = guessedLetters;
    }

    public void initializationGuessedWord(int size){
        guessedWord = new char[size];
        for(int i=0; i<size;i++)
            guessedWord[i]='_';
    }

    public void reduceNumberOfLives(){
        numberOfLives--;
    }

    public  void addGuessedLetters(int number){
        guessedLetters+=number;
    }

    public void openGuessedLetter(char s, int [] index){
        for(int i : index){
            guessedWord[i]=s;
        }
    }

    public Boolean checkGuessedLetter(char s){
        Stream<Character> charStream = new String(guessedWord).chars().mapToObj(i -> (char)i);
        return charStream.filter(i->i==s).count()!=0;
    }
}
