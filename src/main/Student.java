package main;

public class Student {

    //polja - atributi objekta
    private String ime;
    private String prezime;
    private int brIndexa;
    public static int godine;


    //konstruktori - mehanizmi za kreiranje objekata
    public Student(){

    }

    public Student(String i, String p, int brI, int g) {
        ime = i;
        prezime = p;
        brIndexa = brI;
        godine = g;
    }

    public Student(String ime, String prezime, int brIndexa) {
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

    //napraviti metodu za ispis Studenata sa varargs
    public int varargs(int... operands){
        for (int i = 0; i < operands.length; i++) {
            System.out.println(operands[i]);
        }
        return 0;
    }
    //get i set


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
