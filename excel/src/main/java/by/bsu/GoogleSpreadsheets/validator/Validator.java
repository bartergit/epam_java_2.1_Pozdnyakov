package by.bsu.GoogleSpreadsheets.validator;

import java.util.Scanner;

public class Validator {
    public int checkUserChoice(Scanner scanner){
        while(!scanner.hasNextInt()){
            System.out.println("Choice must be an integer");
            System.out.print(">>> ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public int checkGenderChoice(Scanner scanner){
        int choice = checkUserChoice(scanner);
        while(choice < 1 || choice > 2){
            System.out.println("There is no such choice");
            System.out.print(">>> ");
            scanner.next();
            choice = scanner.nextInt();
        }
        return choice;
    }

}