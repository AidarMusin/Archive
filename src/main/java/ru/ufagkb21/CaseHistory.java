package ru.ufagkb21;

public class CaseHistory {
    public Person person;
    public Treatment treatment;
    private QrCode qrCode;

    public CaseHistory(Person person, Treatment treatment) {

    }

    public static void main(String[] args) {

        Person person = new Person("Stark","Veronika");
        CaseHistory caseHistory = new CaseHistory(person, new Treatment(001));


    }
}
