package util;

import java.util.Scanner;

public class Util {

    public static String enterString(String title){
        System.out.println(title);
        Scanner scanner=new Scanner(System.in);
        String answer=scanner.nextLine();
        return answer;

    }
    public static int nextInteger(String title){
        System.out.println(title);
        Scanner scanner=new Scanner(System.in);
        int answer=scanner.nextInt();
        return answer;
    }

    public static String fillUserInfo(){
        String nameSurname=enterString("Enter Name and Surname");
        String email=enterString("Enter your E-mail");
        String phoneNumber=enterString("Enter your phone number");
        return "Name: "+ nameSurname+ "\nEmail: "+email+ "\nPhone number: "+phoneNumber;
    }
    public static String fillTripInfo(){
        String location=Util.enterString("Your current location");
        int passengers=Util.nextInteger("How many passengers will travel?");
        String time=Util.enterString("Enter time:");
        String requires=Util.enterString("Enter requires: For example: (SMOKING-NO) , PET-YES , LUGGAGE-NO");
        return "Your destination from location "+location+" with "+passengers+" passengers and with these requires "+requires+
                " at "+time;
    }
}
