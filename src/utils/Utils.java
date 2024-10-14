package utils;

import main.Student;

public class Utils {

    Student student = new Student();

    public static String generateRandomEmail(){

        return System.currentTimeMillis() + "@email.com";
    }


    public void ispis(){
        student.prezime = "";
    }





}
