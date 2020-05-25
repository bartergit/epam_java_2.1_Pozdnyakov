//package by.bsu.GoogleSpreadsheets.console;
//
//import by.bsu.GoogleSpreadsheets.validator.Validator;
//
//import java.io.IOException;
//import java.security.GeneralSecurityException;
//import java.util.List;
//import java.util.Scanner;
//
//public class Menu {
//    private Scanner scanner;
//    private Validator validator;
//    private boolean stopMenu = false;
//
//    public Menu(){
//        scanner = new Scanner(System.in);
//        validator = new Validator();
//    }
//
//    public void run(){
//        while (!stopMenu){
//            showMenu();
//            int choice = validator.checkUserChoice(scanner);
//            switch (choice){
//                case 1:
//                    showStudents();
//                    break;
//                case 2:
//                    addNewStudent();
//                    break;
//                case 3:
//                    updateStudent();
//                    break;
//                case 0:
//                    exit();
//                    break;
//                default:
//                    System.out.println("There is no such choice as " + choice);
//            }
//        }
//    }
//
//    public void showMenu(){
//        StringBuilder s = new StringBuilder();
//
//        s.append("Choose the action").append("\n")
//                .append("1.Show table").append("\n")
//                .append("2.Add new line").append("\n")
//                .append("3.Edit line").append("\n")
//                .append("0.Exit program").append("\n")
//                .append(">>> ");
//
//        System.out.print(s.toString());
//    }
//
//    public void showStudents(){
//        try {
//            List<SheetRow> rows = GooglesheetsJavaApi.getAll();
//            System.out.println("-----------------");
//            System.out.println("Rows:");
//            int index = 1;
//            for (SheetRow row: rows){
//                System.out.print(index + " ");
//                System.out.println(row);
//                index++;
//            }
//            System.out.println("-----------------");
//        } catch (IOException | GeneralSecurityException e){
//            System.out.println(e.toString());
//        }
//    }
//
//    public void addNewStudent(){
//        SheetRow sheetRow = studentInput();
//        try {
//            GooglesheetsJavaApi.create(sheetRow);
//        } catch (IOException | GeneralSecurityException e){
//            System.out.println(e.toString());
//        }
//    }
//
//    public void updateStudent(){
//        showStudents();
//        System.out.println("Select student to update");
//        System.out.print(">>>");
//        int studentId = scanner.nextInt();
//
//        SheetRow student = studentInput();
//
//        try{
//            GooglesheetsJavaApi.update(studentId + 1, student);
//        } catch (IOException | GeneralSecurityException e){
//            System.out.println(e.toString());
//        }
//    }
//
//    public SheetRow studentInput(){
//        System.out.println("Enter student name");
//        System.out.print(">>>");
//        String studentName = scanner.next();
//        String gender = selectGender();
//        System.out.println("Enter student major");
//        System.out.print(">>>");
//        String major = scanner.next();
//
//        return new SheetRow(studentName, gender, major);
//    }
//
//    public String selectGender(){
//        System.out.println("Select student Gender");
//        System.out.println("1.Male");
//        System.out.println("2.Female");
//        System.out.print(">>>");
//        int choice = validator.checkGenderChoice(scanner);
//        if (choice == 1){
//            return "Male";
//        } else {
//            return "Female";
//        }
//    }
//
//    public void exit(){
//        System.out.println("Stopping application...");
//        stopMenu = true;
//    }
//
//}