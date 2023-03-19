package Zadanie_5;

import java.io.*;
public class Main {
    public static void main(String[] args) {
        char[] text = new char[100];
        char[] text_gl = new char[100];

        int kol = 0;
        try(FileReader reader = new FileReader("C:/University/Java_labs/laba_5/old_file.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                text[kol] = (char)c;
                kol++;
                //System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        char mas[] = new char[9];
        mas[0] = 'у';
        mas[1] = 'е';
        mas[2] = 'ы';
        mas[3] = 'а';
        mas[4] = 'о';
        mas[5] = 'э';
        mas[6] = 'я';
        mas[7] = 'и';
        mas[8] = 'ю';

        int g = 0;
        for (int i = 0; i < kol; i++) {
            if((i == 0) || (text[i-1] == '\n') || (text[i-1] == ' ')){
                for (int j = 0; j < 9; j++){
                    if(text[i] == mas[j]){
                        int k = i;
                        while (text[k] != '\r' && text[k] != ' ' && k < kol){
                            //System.out.print(text[k]);
                            text_gl[g] = text[k];
                            k++; g++;
                        }
                        text_gl[g] = '\r';
                        g++;
                        text_gl[g] = '\n';
                        g++;
                    }
                }
            }
        }

        try(FileWriter writer = new FileWriter("C:/University/Java_labs/laba_5/new_file.txt", false))
        {
            for (int i = 0; i < g; i++) {
                writer.append(text_gl[i]);
            }
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}