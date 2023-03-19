package Zadanie_6;


import java.io.*;
public class Main {
    public static void main(String[] args) {
        char[] text = new char[100];
        char[] text_gl = new char[100];

        int kol = 0;
        try (FileReader reader = new FileReader("C:/University/Java_labs/laba_5/old_file.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                text[kol] = (char) c;
                kol++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        int i_nach_one = 0;
        int g = 0;
        for (int i = 3; i < kol; i++) {
            if (text[i] == '\n') {
                i_nach_one = i + 1;
            } else if (text[i + 2] == '\n' && text[i + 3] == text[i]) {
                int k = i_nach_one;
                while (text[k] != '\r' && text[k] != ' ' && k < kol) {
                    text_gl[g] = text[k];
                    k++;
                    g++;
                }
                text_gl[g] = '\r';
                g++;
                text_gl[g] = '\n';
                g++;
            }
            if (text[i - 3] == text[i] && text[i - 1] == '\n') {
                int k = i;
                while (text[k] != '\r' && text[k] != ' ' && k < kol) {
                    //System.out.print(text[k]);
                    text_gl[g] = text[k];
                    k++;
                    g++;
                }
                text_gl[g] = '\r';
                g++;
                text_gl[g] = '\n';
                g++;
            }
            if (text[i] == ' ') {
                i_nach_one = i + 1;
            } else if (text[i] == ' ' && text[i + 1] == text[i]) {
                int k = i_nach_one;
                while (text[k] != '\r' && text[k] != ' ' && k < kol) {
                    //System.out.print(text[k]);
                    text_gl[g] = text[k];
                    k++;
                    g++;
                }
                text_gl[g] = '\r';
                g++;
                text_gl[g] = '\n';
                g++;
            }
            if (text[i - 2] == text[i] && text[i - 1] == ' ') {
                int k = i;
                while (text[k] != '\r' && text[k] != ' ' && k < kol) {
                    text_gl[g] = text[k];
                    k++;
                    g++;
                }
                text_gl[g] = '\r';
                g++;
                text_gl[g] = '\n';
                g++;
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