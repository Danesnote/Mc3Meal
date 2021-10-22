package application.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class RootLayoutController {
    public void handleExit(ActionEvent actionEvent) {
        System.exit(0);
    }
    
    public void handleHelp(ActionEvent actionEvent) {
        Alert alert = new Alert (Alert.AlertType.INFORMATION);
        alert.setTitle("Program Information");
        alert.setHeaderText("This is a sample JAVAFX application for Mc3Meal!");
        alert.setContentText("You can choose the menu of Mcdonalds for your happy meal!");
        alert.show();
    }
}