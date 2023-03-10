package Zadanie_1;

import java.util.ArrayList;
import java.util.List;

public class Mobile {
    private String brend_name;
    private List<Model> model;
    public void add_model(String kol_ader, String kol_px, String number_model, String processor, String op){
        model.add(new Model(kol_ader, kol_px, number_model, processor, op));
    }
    public Mobile(String brend_name) {
        this.brend_name = brend_name;
        model = new ArrayList<>();
    }
    public String getBrend_name() {
        return brend_name;
    }

    public void setBrend_name(String brend_name) {
        this.brend_name = brend_name;
    }

    public List<Model> getModel() {
        return model;
    }

    public void setModel(List<Model> model) {
        this.model = model;
    }

    private class Model{
        private String kol_ader;
        private String kol_px;
        private String number_model;
        private String processor;
        private String op;

        public String getKol_ader() {
            return kol_ader;
        }

        public void setKol_ader(String kol_ader) {
            this.kol_ader = kol_ader;
        }

        public String getKol_px() {
            return kol_px;
        }

        public void setKol_px(String kol_px) {
            this.kol_px = kol_px;
        }

        public String getNumber_model() {
            return number_model;
        }

        public void setNumber_model(String number_model) {
            this.number_model = number_model;
        }

        public String getProcessor() {
            return processor;
        }

        public void setProcessor(String processor) {
            this.processor = processor;
        }

        public String getOp() {
            return op;
        }

        public void setOp(String op) {
            this.op = op;
        }

        public Model(String kol_ader, String kol_px, String number_model, String processor, String op) {
            this.kol_ader = kol_ader;
            this.kol_px = kol_px;
            this.number_model = number_model;
            this.processor = processor;
            this.op = op;
        }
    }
}

