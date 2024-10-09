public class Student {

    //polja - atributi objekta
    String ime;
    String prezime;
    int brIndexa;
    int godine;


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
    public void ispis(){
        System.out.println("Ime: " + ime + " prezime " + prezime + " broj indexa: " + brIndexa + " godine " + godine);
    }

    public String ispisObjekta(){
        return "Ime: " + ime + " prezime " + prezime + " broj indexa: " + brIndexa + " godine " + godine;
    }

     public int sum (int x, int y){
        return x + y;
     }

    public void sum2 (int x, int y){
        System.out.println(x + y);
    }



}
