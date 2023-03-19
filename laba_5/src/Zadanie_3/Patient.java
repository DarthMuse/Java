package Zadanie_3;

public class Patient {
    private int id;
    private String first_name;
    private String second_name;
    private String third_name;
    private String address;
    private int number_phone;
    private int number_medic;
    private String diagnoz;

    @Override
    public String toString() {
        return "Patient{" +
                "number_phone=" + number_phone +
                ", number_medic=" + number_medic +
                '}';
    }

    public Patient(int id, String first_name, String second_name, String third_name, String address, int number_phone, int number_medic, String diagnoz) {
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.third_name = third_name;
        this.address = address;
        this.number_phone = number_phone;
        this.number_medic = number_medic;
        this.diagnoz = diagnoz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getThird_name() {
        return third_name;
    }

    public void setThird_name(String third_name) {
        this.third_name = third_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(int number_phone) {
        this.number_phone = number_phone;
    }

    public int getNumber_medic() {
        return number_medic;
    }

    public void setNumber_medic(int number_medic) {
        this.number_medic = number_medic;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }
}
