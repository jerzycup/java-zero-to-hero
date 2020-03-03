package ee.itcollage.level6;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        System.out.println("How old are you?");

        Scanner sc = new Scanner(System.in);
        String insertedInt = sc.nextLine(); //or sc.nextLine() for String
        int age = Integer.parseInt(insertedInt);
        System.out.println("You are: " + insertedInt + " years old");
        int year_born = 2020 - age;
        System.out.println("You were born in " + year_born);
        if(age>=18){
            System.out.println("Have you ever coded java? [y/n]");
            String codedJava = sc.nextLine();
            if(codedJava.equals("y")){
                System.out.println("respect");
            }else if(codedJava.equals("n")){
                System.out.println("Good luck");
            }
        }

        // todo calculate and print which year person was born in
        // todo if person is 18+ ask them whether they have coded java
        // todo if yes, print respect, if no, print good luck
        // todo we will use scanner only in this project, but it's a new thing you can google about a bit
    }
}
