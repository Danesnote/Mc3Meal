package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
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

public class SideController implements MenuPanController, Initializable {
	@FXML private Button menu31; @FXML private Button menu32; @FXML private Button menu33;
	@FXML private Button menu34; @FXML private Button menu35; @FXML private Button menu36;
	@FXML private Button menu37; @FXML private Button menu43; @FXML private Button menu49;
	@FXML private Button menu38; @FXML private Button menu44; @FXML private Button menu50;
	@FXML private Button menu39; @FXML private Button menu45; @FXML private Button menu51;
	@FXML private Button menu40; @FXML private Button menu46; @FXML private Button pass3;
	@FXML private Button menu41; @FXML private Button menu47; @FXML private Label carLabel;
	@FXML private Button menu42; @FXML private Button menu48; @FXML private Label proLabel;
	@FXML private Label fatLabel; @FXML private Label calLabel; @FXML private Label calLabel1;
	@FXML private Label carLabel1; @FXML private Label proLabel1; @FXML private Label fatLabel1;

	
    
	public void initialize(URL location, ResourceBundle rosources) {
		menu31.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203001, carLabel, proLabel, fatLabel, calLabel));
		menu32.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203002, carLabel, proLabel, fatLabel, calLabel));
		menu33.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203003, carLabel, proLabel, fatLabel, calLabel));
		menu34.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203004, carLabel, proLabel, fatLabel, calLabel));
		menu35.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203005, carLabel, proLabel, fatLabel, calLabel));
		menu36.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203006, carLabel, proLabel, fatLabel, calLabel));
		menu37.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203007, carLabel, proLabel, fatLabel, calLabel));
		menu38.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203008, carLabel, proLabel, fatLabel, calLabel));
		menu39.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203009, carLabel, proLabel, fatLabel, calLabel));
		menu40.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203010, carLabel, proLabel, fatLabel, calLabel));
		menu41.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203011, carLabel, proLabel, fatLabel, calLabel));
		menu42.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203012, carLabel, proLabel, fatLabel, calLabel));
		menu43.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203013, carLabel, proLabel, fatLabel, calLabel));
		menu44.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203014, carLabel, proLabel, fatLabel, calLabel));
		menu45.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203015, carLabel, proLabel, fatLabel, calLabel));
		menu46.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203016, carLabel, proLabel, fatLabel, calLabel));
		menu47.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203017, carLabel, proLabel, fatLabel, calLabel));
		menu48.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203018, carLabel, proLabel, fatLabel, calLabel));
		menu49.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203019, carLabel, proLabel, fatLabel, calLabel));
		menu50.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203020, carLabel, proLabel, fatLabel, calLabel));
		menu51.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1203021, carLabel, proLabel, fatLabel, calLabel));
		
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
		Tooltip tooltip13 = new Tooltip();
		Tooltip tooltip14 = new Tooltip();
		Tooltip tooltip15 = new Tooltip();
		Tooltip tooltip16 = new Tooltip();
		Tooltip tooltip17 = new Tooltip();
		Tooltip tooltip18 = new Tooltip();
		Tooltip tooltip19 = new Tooltip();
		Tooltip tooltip20 = new Tooltip();
		Tooltip tooltip21 = new Tooltip();
		Tooltip tooltippass3 = new Tooltip();

		toolset(tooltip1, 1203001);
		toolset(tooltip2, 1203002);
		toolset(tooltip3, 1203003);
		toolset(tooltip4, 1203004);
		toolset(tooltip5, 1203005);
		toolset(tooltip6, 1203006);
		toolset(tooltip7, 1203007);
		toolset(tooltip8, 1203008);
		toolset(tooltip9, 1203009);
		toolset(tooltip10, 1203010);
		toolset(tooltip11, 1203011);
		toolset(tooltip12, 1203012);
		toolset(tooltip13, 1203013);
		toolset(tooltip14, 1203014);
		toolset(tooltip15, 1203015);
		toolset(tooltip16, 1203016);
		toolset(tooltip17, 1203017);
		toolset(tooltip18, 1203018);
		toolset(tooltip19, 1203019);
		toolset(tooltip20, 1203020);
		toolset(tooltip21, 1203021);
		tooltippass3.setText("Move to Drink Menu");

		menu31.setTooltip(tooltip1);
		menu32.setTooltip(tooltip2);
		menu33.setTooltip(tooltip3);
		menu34.setTooltip(tooltip4);
		menu35.setTooltip(tooltip5);
		menu36.setTooltip(tooltip6);
		menu37.setTooltip(tooltip7);
		menu38.setTooltip(tooltip8);
		menu39.setTooltip(tooltip9);
		menu40.setTooltip(tooltip10);
		menu41.setTooltip(tooltip11);
		menu42.setTooltip(tooltip12);
		menu43.setTooltip(tooltip13);
		menu44.setTooltip(tooltip14);
		menu45.setTooltip(tooltip15);
		menu46.setTooltip(tooltip16);
		menu47.setTooltip(tooltip17);
		menu48.setTooltip(tooltip18);
		menu49.setTooltip(tooltip19);
		menu50.setTooltip(tooltip20);
		menu51.setTooltip(tooltip21);
		pass3.setTooltip(tooltippass3);
	}

    public void movePage() {
	       // 새 스테이지 추가
    	Stage newStage = new Stage();
    	Stage stage = (Stage) pass3.getScene().getWindow();
    	try {
    		Parent second = FXMLLoader.load(getClass().getResource("../view/DrinkView.fxml"));
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
