package utils;

import main.Student;

public class Utils {

    private Utils(){}

    Student student = new Student("", "", 21321);

    public static String generateRandomEmail(){
        return System.currentTimeMillis() + "@email.com";
    }


//    public void ispis(){
//        student.prezime = "";
//    }





}
