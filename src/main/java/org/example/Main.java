package org.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        FieldOfDreams field = new FieldOfDreams();
        field.getQandAOnFile();
        field.initializationPlayer();
         field.startMessage();

         while (field.hasNext()){
             System.out.println("Ввести букву -1");
             System.out.println("Ввести слово -2");
             System.out.println("Загаданное слово: "+ Arrays.toString(field.getPlayer().getGuessedWord())+"\t количество жизней: "
                     +field.getPlayer().getNumberOfLives());
             int code = System.in.read();
             switch (code){
                 case 49:
                     System.out.print("Ваша буква: ");
                     System.in.skip(System.in.available());
                     char s = scanner.next().charAt(0);
                     field.tryGuessedLetter(s);
                     break;
                 case 50:
                     System.out.print("Ваше слово: ");
                     System.in.skip(System.in.available());
                     String word = scanner.next();
                     field.tryGuessedWord(word);
                     break;
             }

         }

         if(field.getPlayer().getGuessedLetters()==field.getAnswer().length())
            System.out.println("Поздравляем! Вы отгадали слово! Загаданное слово :"+field.getAnswer());
         else {
             System.out.println("Вы проиграли. Загаданное слово: "+field.getAnswer());
         }


    }
}