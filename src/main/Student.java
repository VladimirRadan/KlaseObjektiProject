package main;

public class Student {

    //polja - atributi objekta
    private String ime;
    private String prezime;
    private int brIndexa;
    public static int godine;

    {
        System.out.println("ispis iz bloka");
    }

    static {
        System.out.println("ispis iz static bloka");
    }

    //konstruktori - mehanizmi za kreiranje objekata
    Student(){
        System.out.println("ispis iz praznog konstruktora");
    }

    public Student(String i, String p, int brI, int g) {
        System.out.println("ispis iz param 4 konstruktora");
        ime = i;
        prezime = p;
        brIndexa = brI;
        godine = g;
    }

    public Student(String ime, String prezime, int brIndexa) {
        System.out.println("ispis iz param 3 konstruktora");
        this.ime = ime;
        this.prezime = prezime;
        this.brIndexa = brIndexa;
    }

    //metode - ono sto objekat radi
    void ispis(String ime){
        System.out.println("Ime: " + this.ime + " prezime " + prezime + " broj indexa: " + brIndexa + " godine " + godine + ime);
    }





    String ispisObjekta(){
        return "Ime: " + ime + " prezime " + prezime + " broj indexa: " + brIndexa + " godine " + godine;
    }



    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    @Override
    public String toString() {
        return "main.Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brIndexa=" + brIndexa +
                ", godine=" + godine +
                '}';
    }
}
