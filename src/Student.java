public class Student {

    //polja - atributi objekta
    String ime;
    String prezime;
    int brIndexa;
    static int godine;


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
    public void ispis(String ime){
        System.out.println("Ime: " + this.ime + " prezime " + prezime + " broj indexa: " + brIndexa + " godine " + godine + ime);
    }

    public String ispisObjekta(){
        return "Ime: " + ime + " prezime " + prezime + " broj indexa: " + brIndexa + " godine " + godine;
    }




    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brIndexa=" + brIndexa +
                ", godine=" + godine +
                '}';
    }
}
