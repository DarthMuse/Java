package Zadanie_8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static final String PATH = "C:/University/Java_labs/laba_5";
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        char[] text_file = new char[1000];
        int kol = 0;
        try(FileReader reader = new FileReader("C:/University/Java_labs/laba_5/students.txt"))
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

        String[] mass = new String[10];
        mass[0] = "1";
        mass[1] = "2";
        mass[2] = "3";
        mass[3] = "4";
        mass[4] = "5";
        mass[5] = "6";
        mass[6] = "7";
        mass[7] = "8";
        mass[8] = "9";
        mass[9] = "10";

        String[] name = new String[3];
        name[0] = word[0];
        int na = 1;

        int s = 0;
        double n = 0;
        String ch1 = null;
        double[] mass_sr = new double[3];
        for (int i = 0; i < word.length; i++) {
            String ch = word[i];
            String rn = "\r\n";
            if (ch.contains(rn)){
                String[] ch_split = ch.split("\r\n");
                ch1 = ch_split[0];
                name[na] = ch_split[1];
                na++;
            }
            if (!ch.contains(rn)){
                for (int j = 0; j < mass.length; j++) {
                    if (ch.equals(mass[j])){
                        mass_sr[s] += Integer.parseInt(mass[j]);
                        n++;
                    }
                }
            } else {
                mass_sr[s] += Integer.parseInt(ch1);
                n++;
                mass_sr[s] /= n;
                s++;
                n = 0;
            }
        }
        mass_sr[s] += Integer.parseInt(ch1);
        n++;
        mass_sr[s] /= n;

        File dir = new File(PATH);
        File newFile = new File(dir, "rez_file2.txt");
        if(!newFile.exists()){
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try(FileWriter writer = new FileWriter("C:/University/Java_labs/laba_5/rez_file2.txt", false))
        {
            for (int i = 0; i < name.length; i++) {
                if (mass_sr[i] > 7){
                    writer.append(name[i]);

                }
            }
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}