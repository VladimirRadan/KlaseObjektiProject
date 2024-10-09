public class Main {


    public static void main(String[] args) {

        Student student = new Student(); //Student@3f99bd52
        student.ime = "Pera";
        student.prezime = "Peric";
        student.godine = 20;
        student.brIndexa = 3213213;

        //System.out.println(student.ime);

        Student student1 = new Student("Marko", "Markovic", 321321, 21);

        Student student2 = new Student("John", "Smith", 21212);

//        student1.ispis();
//
//        String ispis = student1.ispisObjekta();
//        System.out.println(ispis);





        int a = student.sum(4,5) + 10;
        student.sum2(4,5);

        System.out.println(a);

    }



}