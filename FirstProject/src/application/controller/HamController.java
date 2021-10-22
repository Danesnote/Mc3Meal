package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import application.Main;

import application.controller.MainController.MyButtonEventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;




public class HamController implements MenuPanController, Initializable {
	@FXML private Button pass1,menu1,menu2,menu3,menu4,menu5,menu6,menu7,menu8,menu9,menu10,menu11,menu12,menu13,menu14,menu15,menu16,menu17,menu18,menu19,menu20; 
	@FXML private Label carLabel, carLabel1, proLabel, proLabel1,calLabel,calLabel1,fatLabel,fatLabel1;

	
	public void initialize(URL location, ResourceBundle rosources) {
		menu1.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201001, carLabel, proLabel, fatLabel, calLabel));
		menu2.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201002, carLabel, proLabel, fatLabel, calLabel));
		menu3.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201003, carLabel, proLabel, fatLabel, calLabel));
		menu4.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201004, carLabel, proLabel, fatLabel, calLabel));
		menu5.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201005, carLabel, proLabel, fatLabel, calLabel));
		menu6.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201006, carLabel, proLabel, fatLabel, calLabel));
		menu7.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201007, carLabel, proLabel, fatLabel, calLabel));
		menu8.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201008, carLabel, proLabel, fatLabel, calLabel));
		menu9.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201009, carLabel, proLabel, fatLabel, calLabel));
		menu10.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201010, carLabel, proLabel, fatLabel, calLabel));
		menu11.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201011, carLabel, proLabel, fatLabel, calLabel));
		menu12.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201012, carLabel, proLabel, fatLabel, calLabel));
		menu13.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201013, carLabel, proLabel, fatLabel, calLabel));
		menu14.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201014, carLabel, proLabel, fatLabel, calLabel));
		menu15.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201015, carLabel, proLabel, fatLabel, calLabel));
		menu16.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201016, carLabel, proLabel, fatLabel, calLabel));
		menu17.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201017, carLabel, proLabel, fatLabel, calLabel));
		menu18.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201018, carLabel, proLabel, fatLabel, calLabel));
		menu19.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201019, carLabel, proLabel, fatLabel, calLabel));
		menu20.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1201020, carLabel, proLabel, fatLabel, calLabel));
		
		
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
		Tooltip tooltippass1 = new Tooltip();

		toolset(tooltip1, 1201001);
		toolset(tooltip2, 1201002);
		toolset(tooltip3, 1201003);
		toolset(tooltip4, 1201004);
		toolset(tooltip5, 1201005);
		toolset(tooltip6, 1201006);
		toolset(tooltip7, 1201007);
		toolset(tooltip8, 1201008);
		toolset(tooltip9, 1201009);
		toolset(tooltip10, 1201009);
		toolset(tooltip11, 1201010);
		toolset(tooltip12, 1201011);
		toolset(tooltip13, 1201012);
		toolset(tooltip14, 1201013);
		toolset(tooltip15, 1201014);
		toolset(tooltip16, 1201015);
		toolset(tooltip17, 1201016);
		toolset(tooltip18, 1201017);
		toolset(tooltip19, 1201018);
		toolset(tooltip20, 1201019);
		tooltippass1.setText("Move to Side Menu");

		menu1.setTooltip(tooltip1);
		menu2.setTooltip(tooltip2);
		menu3.setTooltip(tooltip3);
		menu4.setTooltip(tooltip4);
		menu5.setTooltip(tooltip5);
		menu6.setTooltip(tooltip6);
		menu7.setTooltip(tooltip7);
		menu8.setTooltip(tooltip8);
		menu9.setTooltip(tooltip9);
		menu10.setTooltip(tooltip10);
		menu11.setTooltip(tooltip11);
		menu12.setTooltip(tooltip12);
		menu13.setTooltip(tooltip13);
		menu14.setTooltip(tooltip14);
		menu15.setTooltip(tooltip15);
		menu16.setTooltip(tooltip16);
		menu17.setTooltip(tooltip17);
		menu18.setTooltip(tooltip18);
		menu19.setTooltip(tooltip19);
		menu20.setTooltip(tooltip20);
		pass1.setTooltip(tooltippass1);
	}
	
	double new_car = 0;
	double new_pro = 0;
	double new_fat = 0;
	double new_cal = 0;
	
    
    public void movePage() {
	       // 새 스테이지 추가
	       Stage newStage = new Stage();
	       Stage stage = (Stage)pass1.getScene().getWindow();

	       try {
	  
	           Parent second = FXMLLoader.load(getClass().getResource("../view/SideView.fxml"));

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
