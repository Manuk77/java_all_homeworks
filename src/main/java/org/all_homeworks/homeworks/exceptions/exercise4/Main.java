package org.all_homeworks.homeworks.exceptions.exercise4;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/manuk/IdeaProjects/tokenFile.txt";
       try {
           FileReaderFromUser fileReaderFromUser = new FileReaderFromUser(new FileReader(fileName));
           fileReaderFromUser.read();
           fileReaderFromUser.close();
       }catch (IOException e){
           System.out.println(e.getMessage());
       }

    }
}
