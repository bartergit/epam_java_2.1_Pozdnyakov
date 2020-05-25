package by.bsu.GoogleSpreadsheets.run;


import by.bsu.GoogleSpreadsheets.controller.SheetManipulator;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class Main {
    public static void main(String[] args) throws IOException, GeneralSecurityException {
        SheetManipulator sheetManipulator = new SheetManipulator("tokens","/credentials.json");
        sheetManipulator.setSpreadsheetId("1NikstCejlPwT-iM3jCJIaeNeCZZVcVTLiY6U1ux0ISg");
        sheetManipulator.addLine("Ivan","Pozd","Barter",5);
        System.out.println(sheetManipulator.showTable());
//        Menu menu = new Menu();
//        menu.run();
    }
}
