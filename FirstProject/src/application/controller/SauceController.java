package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.controller.MainController.MyButtonEventHandler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SauceController implements MenuPanController, Initializable {
	@FXML private Button menu101; @FXML private Button menu99;
	@FXML private Button menu92; @FXML private Button menu100; 
	@FXML private Button menu93; @FXML private Button pass5;
	@FXML private Button menu94; @FXML private Button menu102; 
	@FXML private Button menu95; 
	@FXML private Button menu96; @FXML private Label carLabel;
	@FXML private Button menu97;  @FXML private Label proLabel;
	@FXML private Button menu98;  @FXML private Label fatLabel;
	@FXML private Label calLabel; @FXML private Label calLabel1; 
	@FXML private Label carLabel1;
	@FXML private Label proLabel1; @FXML private Label fatLabel1;
	
	public void initialize(URL location, ResourceBundle rosources) {
		menu101.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1204001, carLabel, proLabel, fatLabel, calLabel));
		menu92.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1204002, carLabel, proLabel, fatLabel, calLabel));
		menu93.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1204003, carLabel, proLabel, fatLabel, calLabel));
		menu94.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1204004, carLabel, proLabel, fatLabel, calLabel));
		menu95.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1204005, carLabel, proLabel, fatLabel, calLabel));
		menu96.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1204006, carLabel, proLabel, fatLabel, calLabel));
		menu97.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1204007, carLabel, proLabel, fatLabel, calLabel));
		menu98.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1204008, carLabel, proLabel, fatLabel, calLabel));
		menu99.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1204009, carLabel, proLabel, fatLabel, calLabel));
		menu100.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1204010, carLabel, proLabel, fatLabel, calLabel));
		menu102.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1204011, carLabel, proLabel, fatLabel, calLabel));
		
		carLabel1.setText(Main.std_car);
		proLabel1.setText(Main.std_pro);
		fatLabel1.setText(Main.std_fat);
		calLabel1.setText(Main.std_cal);
		
		initLabel();
		
		Tooltip tooltip1 = new Tooltip();
		Tooltip tooltip2 = new Tooltip();
		Tooltip tooltip3 = new Tooltip();
		Tooltip tooltip4 = new Tooltip();
		Tooltip tooltip5 = new Tooltip();
		Tooltip tooltip6 = new Tooltip();
		Tooltip tooltip7 = new Tooltip();
		Tooltip tooltip8 = new Tooltip();
		Tooltip tooltip9 = new Tooltip();
		Tooltip tooltip10 = new Tooltip();
		Tooltip tooltip11 = new Tooltip();
		Tooltip tooltip12 = new Tooltip();
		

		Tooltip tooltippass5 = new Tooltip();

		toolset(tooltip1, 1204001);
		toolset(tooltip2, 1204002);
		toolset(tooltip3, 1204003);
		toolset(tooltip4, 1204004);
		toolset(tooltip5, 1204005);
		toolset(tooltip6, 1204006);
		toolset(tooltip7, 1204007);
		toolset(tooltip8, 1204008);
		toolset(tooltip9, 1204009);
		toolset(tooltip10, 1204010);
		toolset(tooltip11, 1204011);
		toolset(tooltip12, 1204012);
		

		tooltippass5.setText("Move to End");

		menu92.setTooltip(tooltip1);
		menu93.setTooltip(tooltip3);
		menu94.setTooltip(tooltip4);
		menu95.setTooltip(tooltip5);
		menu96.setTooltip(tooltip6);
		menu97.setTooltip(tooltip7);
		menu98.setTooltip(tooltip8);
		menu99.setTooltip(tooltip9);
		menu100.setTooltip(tooltip10);
		menu101.setTooltip(tooltip11);
		menu102.setTooltip(tooltip12);
		
	
		pass5.setTooltip(tooltippass5);
	}

   
    
    public void movePage() {
	       // 새 스테이지 추가
	       Stage newStage = new Stage();
	       Stage stage = (Stage)pass5.getScene().getWindow();

	       try {
	           Parent second = FXMLLoader.load(getClass().getResource("../view/EndView.fxml"));
	           Scene sc = new Scene(second);
	           stage.setScene(sc);
	           stage.show();

	       } catch (IOException e) {
	           e.printStackTrace();
	       }
    }
    public void initLabel() {
		calLabel.setText(Double.toString(Main.str_cal));
		carLabel.setText(Double.toString(Main.str_car));
		proLabel.setText(Double.toString(Main.str_pro));
		fatLabel.setText(Double.toString(Main.str_fat));
	}
}