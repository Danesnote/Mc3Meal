package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
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

public class DrinkController implements MenuPanController, Initializable{
	@FXML private Button menu91; @FXML private Button menu52; @FXML private Button menu53;
	@FXML private Button menu54; @FXML private Button menu55; @FXML private Button menu56;
	@FXML private Button menu57; @FXML private Button menu63; @FXML private Button menu69;
	@FXML private Button menu58; @FXML private Button menu64; @FXML private Button menu70;
	@FXML private Button menu59; @FXML private Button menu65; @FXML private Button pass4;
	@FXML private Button menu60; @FXML private Button menu66; @FXML private Label carLabel;
	@FXML private Button menu61; @FXML private Button menu67; @FXML private Label proLabel;
	@FXML private Button menu62; @FXML private Button menu68; @FXML private Label fatLabel;
	@FXML private Button menu71; @FXML private Button menu79; @FXML private Button menu87;
	@FXML private Button menu72; @FXML private Button menu80; @FXML private Button menu88;
	@FXML private Button menu73; @FXML private Button menu81; @FXML private Button menu89;
	@FXML private Button menu74; @FXML private Button menu82; @FXML private Button menu90;
	@FXML private Button menu75; @FXML private Button menu83; @FXML private Label calLabel;
	@FXML private Button menu76; @FXML private Button menu84; 
	@FXML private Button menu77; @FXML private Button menu85; 
	@FXML private Button menu78; @FXML private Button menu86;
	@FXML private Label calLabel1; @FXML private Label carLabel1;
	@FXML private Label proLabel1; @FXML private Label fatLabel1;
	
	public void initialize(URL location, ResourceBundle rosources) {
		
		
		menu53.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205001, carLabel, proLabel, fatLabel, calLabel));
		menu54.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205002, carLabel, proLabel, fatLabel, calLabel));
		menu55.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205003, carLabel, proLabel, fatLabel, calLabel));
		menu56.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205004, carLabel, proLabel, fatLabel, calLabel));
		menu57.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205005, carLabel, proLabel, fatLabel, calLabel));
		menu58.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205006, carLabel, proLabel, fatLabel, calLabel));
		menu59.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205007, carLabel, proLabel, fatLabel, calLabel));
		menu60.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205008, carLabel, proLabel, fatLabel, calLabel));
		menu61.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205009, carLabel, proLabel, fatLabel, calLabel));
		menu62.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205010, carLabel, proLabel, fatLabel, calLabel));
		menu63.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205011, carLabel, proLabel, fatLabel, calLabel));
		menu64.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205012, carLabel, proLabel, fatLabel, calLabel));
		menu65.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205013, carLabel, proLabel, fatLabel, calLabel));
		menu66.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205014, carLabel, proLabel, fatLabel, calLabel));
		menu67.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205015, carLabel, proLabel, fatLabel, calLabel));
		menu68.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205016, carLabel, proLabel, fatLabel, calLabel));
		menu69.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205017, carLabel, proLabel, fatLabel, calLabel));
		menu70.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205018, carLabel, proLabel, fatLabel, calLabel));
		menu71.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205019, carLabel, proLabel, fatLabel, calLabel));
		menu72.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205020, carLabel, proLabel, fatLabel, calLabel));
		menu73.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205021, carLabel, proLabel, fatLabel, calLabel));
		menu74.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205022, carLabel, proLabel, fatLabel, calLabel));
		menu75.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205023, carLabel, proLabel, fatLabel, calLabel));
		menu76.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205024, carLabel, proLabel, fatLabel, calLabel));
		menu77.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205025, carLabel, proLabel, fatLabel, calLabel));
		menu78.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205026, carLabel, proLabel, fatLabel, calLabel));
		menu79.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205027, carLabel, proLabel, fatLabel, calLabel));
		menu80.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205028, carLabel, proLabel, fatLabel, calLabel));
		menu81.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205029, carLabel, proLabel, fatLabel, calLabel));
		menu82.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205030, carLabel, proLabel, fatLabel, calLabel));
		menu83.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205031, carLabel, proLabel, fatLabel, calLabel));
		menu84.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205032, carLabel, proLabel, fatLabel, calLabel));
		menu85.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205033, carLabel, proLabel, fatLabel, calLabel));
		menu86.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205034, carLabel, proLabel, fatLabel, calLabel));
		menu87.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205035, carLabel, proLabel, fatLabel, calLabel));
		menu88.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205036, carLabel, proLabel, fatLabel, calLabel));
		menu89.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205037, carLabel, proLabel, fatLabel, calLabel));
		menu90.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205038, carLabel, proLabel, fatLabel, calLabel));
		menu91.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyButtonEventHandler(1205039, carLabel, proLabel, fatLabel, calLabel));

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
		Tooltip tooltip22 = new Tooltip();
		Tooltip tooltip23 = new Tooltip();
		Tooltip tooltip24 = new Tooltip();
		Tooltip tooltip25 = new Tooltip();
		Tooltip tooltip26 = new Tooltip();
		Tooltip tooltip27 = new Tooltip();
		Tooltip tooltip28 = new Tooltip();
		Tooltip tooltip29 = new Tooltip();
		Tooltip tooltip30 = new Tooltip();
		Tooltip tooltip31 = new Tooltip();
		Tooltip tooltip32 = new Tooltip();
		Tooltip tooltip33 = new Tooltip();
		Tooltip tooltip34 = new Tooltip();
		Tooltip tooltip35 = new Tooltip();
		Tooltip tooltip36 = new Tooltip();
		Tooltip tooltip37 = new Tooltip();
		Tooltip tooltip38 = new Tooltip();
		Tooltip tooltip39 = new Tooltip();
		Tooltip tooltippass4 = new Tooltip();

		toolset(tooltip1, 1205001);
		toolset(tooltip2, 1205002);
		toolset(tooltip3, 1205003);
		toolset(tooltip4, 1205004);
		toolset(tooltip5, 1205005);
		toolset(tooltip6, 1205006);
		toolset(tooltip7, 1205007);
		toolset(tooltip8, 1205008);
		toolset(tooltip9, 1205009);
		toolset(tooltip10, 1205010);
		toolset(tooltip11, 1205011);
		toolset(tooltip12, 1205012);
		toolset(tooltip13, 1205013);
		toolset(tooltip14, 1205014);
		toolset(tooltip15, 1205015);
		toolset(tooltip16, 1205016);
		toolset(tooltip17, 1205017);
		toolset(tooltip18, 1205018);
		toolset(tooltip19, 1205019);
		toolset(tooltip20, 1205020);
		toolset(tooltip21, 1205021);
		toolset(tooltip22, 1205022);
		toolset(tooltip23, 1205023);
		toolset(tooltip24, 1205024);
		toolset(tooltip25, 1205025);
		toolset(tooltip26, 1205026);
		toolset(tooltip27, 1205027);
		toolset(tooltip28, 1205028);
		toolset(tooltip29, 1205029);
		toolset(tooltip30, 1205030);
		toolset(tooltip31, 1205031);
		toolset(tooltip32, 1205032);
		toolset(tooltip33, 1205033);
		toolset(tooltip34, 1205034);
		toolset(tooltip35, 1205035);
		toolset(tooltip36, 1205036);
		toolset(tooltip37, 1205037);
		toolset(tooltip38, 1205038);
		toolset(tooltip39, 1205039);

		tooltippass4.setText("Move to Sauce Menu");

		menu52.setTooltip(tooltip1);
		menu54.setTooltip(tooltip2);
		menu55.setTooltip(tooltip3);
		menu56.setTooltip(tooltip4);
		menu57.setTooltip(tooltip5);
		menu58.setTooltip(tooltip6);
		menu59.setTooltip(tooltip7);
		menu60.setTooltip(tooltip8);
		menu61.setTooltip(tooltip9);
		menu62.setTooltip(tooltip10);
		menu63.setTooltip(tooltip11);
		menu64.setTooltip(tooltip12);
		menu65.setTooltip(tooltip13);
		menu66.setTooltip(tooltip14);
		menu67.setTooltip(tooltip15);
		menu68.setTooltip(tooltip16);
		menu69.setTooltip(tooltip17);
		menu70.setTooltip(tooltip18);
		menu71.setTooltip(tooltip19);
		menu72.setTooltip(tooltip20);
		menu73.setTooltip(tooltip21);
		menu74.setTooltip(tooltip22);
		menu75.setTooltip(tooltip23);
		menu76.setTooltip(tooltip24);
		menu77.setTooltip(tooltip25);
		menu78.setTooltip(tooltip26);
		menu79.setTooltip(tooltip27);
		menu80.setTooltip(tooltip28);
		menu81.setTooltip(tooltip29);
		menu82.setTooltip(tooltip30);
		menu83.setTooltip(tooltip31);
		menu84.setTooltip(tooltip32);
		menu85.setTooltip(tooltip33);
		menu86.setTooltip(tooltip34);
		menu87.setTooltip(tooltip35);
		menu88.setTooltip(tooltip36);
		menu89.setTooltip(tooltip37);
		menu90.setTooltip(tooltip38);
		menu91.setTooltip(tooltip39);
		pass4.setTooltip(tooltippass4);
	}
	
	double new_car = 0;
	double new_pro = 0;
	double new_fat = 0;
	double new_cal = 0;
	
	
    public void movePage() {
	       // 새 스테이지 추가
	       Stage newStage = new Stage();
	       Stage stage = (Stage)pass4.getScene().getWindow();

	       try {
	  
	           Parent second = FXMLLoader.load(getClass().getResource("../view/SauceView.fxml"));

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
