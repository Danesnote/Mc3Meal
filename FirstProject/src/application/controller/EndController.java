package application.controller;

import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class EndController implements Initializable {

	@FXML
	private PieChart pie;
	@FXML private Label carLabel;
	@FXML private Label proLabel;
	@FXML private Label fatLabel;
	@FXML private Label calLabel;
	@FXML private Button press;
	
	@Override
	public void initialize(URL location, ResourceBundle rosources) {

	
    	pie.setData(FXCollections.observableArrayList(
				new PieChart.Data("CAR", Main.str_car),
				new PieChart.Data("PRO", Main.str_pro),
				new PieChart.Data("FAT", Main.str_fat),
				new PieChart.Data("CAL", Main.str_cal)
				));
	
	}
	
	@FXML
    public void gogo(ActionEvent event) throws Exception {

		carLabel.setText(Double.toString(Main.str_car));
		proLabel.setText(Double.toString(Main.str_pro));
		fatLabel.setText(Double.toString(Main.str_fat));
		calLabel.setText(Double.toString(Main.str_cal));
}
}
