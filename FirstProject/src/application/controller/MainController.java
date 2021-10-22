package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Control;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lombok.NoArgsConstructor;
import javafx.event.EventHandler;

@NoArgsConstructor
public class MainController implements Initializable{
    @FXML 
    private Button menuBtn, recordBtn, settingBtn;
 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	menuBtn.addEventHandler(MouseEvent.MOUSE_ENTERED, new MyButtonEventHandler());
    	recordBtn.addEventHandler(MouseEvent.MOUSE_ENTERED, new MyButtonEventHandler());
    	settingBtn.addEventHandler(MouseEvent.MOUSE_ENTERED, new MyButtonEventHandler());
    	
    	Tooltip tooltip = new Tooltip();
    	tooltip.setText("Order");
    	menuBtn.setTooltip(tooltip);
    	Tooltip tooltip1 = new Tooltip();
    	tooltip1.setText("Record");
    	recordBtn.setTooltip(tooltip1);
    	Tooltip tooltip2 = new Tooltip();
    	tooltip2.setText("Setting");
    	settingBtn.setTooltip(tooltip2);
    	
    }
    
    
	public class MyButtonEventHandler implements EventHandler<MouseEvent> {
	    @Override
	    public void handle( final MouseEvent ME )
	    {
	      Object obj = ME.getSource();
	 
	     
	      ButtonBase button = (ButtonBase) obj;
	      button.setCursor(Cursor.HAND);
	    }
	}
    @FXML
    public void moveHam(ActionEvent event) throws Exception {               
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/UserView.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));  
            stage.show();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void moveRecord(ActionEvent event) throws Exception {    
    	
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/RecordView.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));  
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void moveSetting(ActionEvent event) throws Exception {    
    	
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/SettingView.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));  
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}