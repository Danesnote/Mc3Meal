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
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MorningController implements MenuPanController, Initializable {
	@FXML
	private Button menu21, menu29, menu22, menu23, pass2, menu24, menu25, menu26, menu27, menu28;
	@FXML
	private Label carLabel, proLabel, fatLabel, calLabel, calLabel1, fatLabel1, carLabel1, proLabel1;

	public void initialize(URL location, ResourceBundle rosources) {
		carLabel1.setText(Double.toString(Main.str_car));
		proLabel1.setText(Double.toString(Main.str_pro));
		fatLabel1.setText(Double.toString(Main.str_fat));
		calLabel1.setText(Double.toString(Main.str_cal));
		
		menu21.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1202001, carLabel, proLabel, fatLabel, calLabel));
		menu22.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1202002, carLabel, proLabel, fatLabel, calLabel));
		menu23.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1202003, carLabel, proLabel, fatLabel, calLabel));
		menu24.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1202004, carLabel, proLabel, fatLabel, calLabel));
		menu25.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1202005, carLabel, proLabel, fatLabel, calLabel));
		menu26.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1202006, carLabel, proLabel, fatLabel, calLabel));
		menu27.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1202007, carLabel, proLabel, fatLabel, calLabel));
		menu28.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1202008, carLabel, proLabel, fatLabel, calLabel));
		menu29.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1202009, carLabel, proLabel, fatLabel, calLabel));

//		System.out.println(Main.std_car);
		carLabel1.setText(Main.std_car);
		proLabel1.setText(Main.std_pro);
		fatLabel1.setText(Main.std_fat);
		calLabel1.setText(Main.std_cal);

		Tooltip tooltip21 = new Tooltip();
		Tooltip tooltip22 = new Tooltip();
		Tooltip tooltip23 = new Tooltip();
		Tooltip tooltip24 = new Tooltip();
		Tooltip tooltip25 = new Tooltip();
		Tooltip tooltip26 = new Tooltip();
		Tooltip tooltip27 = new Tooltip();
		Tooltip tooltip28 = new Tooltip();
		Tooltip tooltip29 = new Tooltip();
		Tooltip tooltippass2 = new Tooltip();

		toolset(tooltip21, 1202001);
		toolset(tooltip22, 1202002);
		toolset(tooltip23, 1202003);
		toolset(tooltip24, 1202004);
		toolset(tooltip25, 1202005);
		toolset(tooltip26, 1202006);
		toolset(tooltip27, 1202007);
		toolset(tooltip28, 1202008);
		toolset(tooltip29, 1202009);

		tooltippass2.setText("Move to Burger Menu");

		menu21.setTooltip(tooltip21);
		menu22.setTooltip(tooltip22);
		menu23.setTooltip(tooltip23);
		menu24.setTooltip(tooltip24);
		menu25.setTooltip(tooltip25);
		menu26.setTooltip(tooltip26);
		menu27.setTooltip(tooltip27);
		menu28.setTooltip(tooltip28);
		menu29.setTooltip(tooltip29);
		pass2.setTooltip(tooltippass2);

	}

	public void movePage() {
		Stage newStage = new Stage();
		Stage stage = (Stage) pass2.getScene().getWindow();
		movePageURL(stage, "../view/HamView.fxml");
	}


}