package Zadanie_2;

import java.util.ArrayList;
import java.util.List;

public class Vistovka {
    private String name_vistovka;
    private String time_begin;
    private String time_end;
    private String date;
    private List<Picture> pictures;
    public void add_picture(String name_picture, String name_avtor){
        pictures.add(new Picture(name_picture, name_avtor));
    }
    public Vistovka(String name_vistovka, String time_begin, String time_end, String date) {
        this.name_vistovka = name_vistovka;
        this.time_begin = time_begin;
        this.time_end = time_end;
        this.date = date;
        pictures = new ArrayList<>();
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getName_vistovka() {
        return name_vistovka;
    }

    public void setName_vistovka(String name_vistovka) {
        this.name_vistovka = name_vistovka;
    }

    public String getTime_begin() {
        return time_begin;
    }

    public void setTime_begin(String time_begin) {
        this.time_begin = time_begin;
    }

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    private class Picture{
        private String name_of_picture;
        private String name_of_avtor;

        public Picture(String name_of_picture, String name_of_avtor) {
            this.name_of_picture = name_of_picture;
            this.name_of_avtor = name_of_avtor;
        }

        public String getName_of_picture() {
            return name_of_picture;
        }

        public void setName_of_picture(String name_of_picture) {
            this.name_of_picture = name_of_picture;
        }

        public String getName_of_avtor() {
            return name_of_avtor;
        }

        public void setName_of_avtor(String name_of_avtor) {
            this.name_of_avtor = name_of_avtor;
        }
    }
}
