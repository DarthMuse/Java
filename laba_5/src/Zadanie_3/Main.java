package Zadanie_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient[] patients = new Patient[100];

        Scanner console = new Scanner(System.in);

        String first_name;
        String second_name;
        String third_name;
        String address;
        String diagnoz_in;

        System.out.println("Сколько будет пациентов: ");
        int col = console.nextInt();
        if (col < 0){
            System.out.println("Введите число больше 0");
            col = console.nextInt();
        } else if (col > 2147483647) {
            System.out.println("Слишком много пациентов");
            col = console.nextInt();
        }
        for (int i = 0; i < col; i++) {
            System.out.println("Введите имя: ");
            first_name = console.next();
            if(!console.hasNextInt()){
                if (first_name.length() > 50){
                    System.out.println("Слишком длинное имя, повторите ввод");
                    first_name = console.next();
                }
            } else {
                System.out.println("Введено число, введите заново");
                first_name = console.next();
            }
            System.out.println("Введите фамилию: ");
            second_name = console.next();
            if(!console.hasNextInt()){
                if (second_name.length() > 50){
                    System.out.println("Слишком длинная фамилия, повторите ввод");
                    second_name = console.next();
                }
            } else {
                System.out.println("Введено число, введите заново");
                second_name = console.next();
            }
            System.out.println("Введите отчество: ");
            third_name = console.next();
            if(!console.hasNextInt()){
                if (third_name.length() > 50){
                    System.out.println("Слишком длинное отчество, повторите ввод");
                    third_name = console.next();
                }
            } else {
                System.out.println("Введено число, введите заново");
                third_name = console.next();
            }
            System.out.println("Введите адрес: ");
            address = console.next();
            if(!console.hasNextInt()){
                if (address.length() > 50){
                    System.out.println("Слишком длинный адрес, повторите ввод");
                    address = console.next();
                }
            } else {
                System.out.println("Введено число, введите заново");
                address = console.next();
            }
            System.out.println("Введите диагноз: ");
            diagnoz_in = console.next();
            if(!console.hasNextInt()){
            } else {
                System.out.println("Введено число, введите заново");
                diagnoz_in = console.next();
            }
            patients[i] = new Patient(i, first_name, second_name, third_name,
                    address, i, i, diagnoz_in);
        }

        System.out.println("Введите диагноз, чтобы поциентов с ним: ");
        String diagnoz = console.next();
        if(!console.hasNextInt()){
        } else {
            System.out.println("Введено число, введите заново");
            diagnoz = console.next();
        }

        System.out.println("Пациенты с таким диагнозом: ");
        for (int i = 0; i < col; i++) {
            if(patients[i].getDiagnoz().equals(diagnoz)){
                System.out.println(patients[i].getFirst_name() + " " + patients[i].getSecond_name());
            }
        }

        System.out.println("Введите диапазон значений: ");
        int n1 = console.nextInt();
        if (n1 > patients.length){
            System.out.println("Введен слишком большой диапазон, введите заново: ");
            n1 = console.nextInt();
        }
        int n2 = console.nextInt();
        if (n2 > patients.length){
            System.out.println("Введен слишком большой диапазон, введите заново: ");
            n2 = console.nextInt();
        }
        System.out.println("Пациенты с номером медицинской карты, попадающими в этот диапазон: ");
        for (int i = 0; i < col; i++) {
            if(patients[i].getNumber_medic() > n1 && patients[i].getNumber_medic() < n2){
                System.out.println(patients[i].getFirst_name() + " " + patients[i].getSecond_name());
            }
        }
    }
}