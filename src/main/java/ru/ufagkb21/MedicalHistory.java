package ru.ufagkb21;

public class MedicalHistory {
    public Person person;
    public Treatment treatment;
    private QrCode qrCode;

    public MedicalHistory (Person person, Treatment treatment) {

    }

    public static void main(String[] args) {

        Person person = new Person("Stark","Veronika");
        MedicalHistory medicalHistory = new MedicalHistory(person, new Treatment(001));


    }
}
