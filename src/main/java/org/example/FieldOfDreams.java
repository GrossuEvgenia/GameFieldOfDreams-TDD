package org.example;

import java.io.*;

public class FieldOfDreams {
    private String question;
    private String answer;
    private Player player;

    public FieldOfDreams(){
        question="";
        answer="";
        player= new Player();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void getQandAOnFile(){
        String[] words = new String[2];
        try {
            File file = new File("src/main/resources/easy_level.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            words = line.split("#");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        question=words[0];
        answer=words[1];
    }

    public void initializationPlayer(){
        player.setNumberOfLives(answer.length());
        player.initializationGuessedWord(answer.length());
    }

    public Boolean checkWords(String word){
        return answer.compareTo(word.toUpperCase())==0;
    }
}
