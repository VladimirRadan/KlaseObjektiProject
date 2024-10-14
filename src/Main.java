import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Student student = new Student(); //Student@3f99bd52
        student.ime = "Pera";
        student.prezime = "Peric";
        //student.godine = 20;
        student.brIndexa = 3213213;
        Student.godine = 20;

        scanner.next();

        //System.out.println(student.ime);

        Student student1 = new Student("Marko", "Markovic", 321321, 21);
        student.equals(student1);

        Student student2 = new Student("John", "Smith", 21212);
        student2.godine = 25;

//        System.out.println(student);
//        System.out.println(student1);
//        System.out.println(student2);

        Student niz[] = {student, student1, student2};

        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }



//        student1.ispis();
//
//        String ispis = student1.ispisObjekta();
//        System.out.println(ispis);


        System.out.println(Utils.generateRandomEmail());

    }



}