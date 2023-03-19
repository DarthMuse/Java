package Zadanie_7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static final String PATH = "C:/University/Java_labs/laba_5";
    public static void main(String[] args) {

        char[] text_file = new char[1000];
        String[] text_file_UP = new String[1000];
        int kol = 0;
        try(FileReader reader = new FileReader("C:/University/Java_labs/laba_5/text.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                text_file[kol] = (char)c;
                kol++;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        String string_text_file = new String(text_file);

        String[] word = string_text_file.split(" ");
        word = string_text_file.split("\r\n");

        for (int i = 2; i < word.length - 2; i++) {
            if(!word[i].equals(" ") && !word[i + 1].equals(" ") && !word[i + 2].equals(" ")
                && !word[i + 1].equals("\r") && !word[i + 2].equals("\r")
                || !word[i].equals(" ") && !word[i - 1].equals(" ") && !word[i - 2].equals(" ")
                && !word[i - 1].equals("\n") && !word[i - 2].equals("\n")){
                text_file_UP[i] = word[i].toUpperCase();
            }
        }

        /*for (int i = 0; i < word.length; i++) {
            System.out.println(text_file_UP[i]);
        }*/

        File dir = new File(PATH);
        File newFile = new File(dir, "rez_file.txt");
        if(!newFile.exists()){
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try(FileWriter writer = new FileWriter("C:/University/Java_labs/laba_5/rez_file.txt", false))
        {
            for (int i = 0; i < text_file_UP.length; i++) {
                writer.append(text_file_UP[i]);
            }
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}