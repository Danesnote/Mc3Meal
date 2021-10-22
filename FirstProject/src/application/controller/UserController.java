package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*; 
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL; 
import java.util.ResourceBundle;

public class UserController implements Initializable{
	@FXML private TextField carEnter; 
	@FXML private TextField proEnter;
	@FXML private TextField fatEnter;
	@FXML private TextField calEnter;
	@FXML private Label resultLabel; 
	@FXML private Button enterBtn,enterBtn1,enterBtn2,enterBtn3;
	@FXML private Button moveBtn;
	
	private String inputValue; 
	
	@FXML private void handleButtonAction(ActionEvent event){
		inputValue = carEnter.getText(); 
		carEnter.setText("");
		Main.std_car = inputValue;
		resultLabel.setText("기준 탄수화물 값 " + Main.std_car + " 입력완료  ");
		
		}
	
	@FXML private void handleButtonAction1(ActionEvent event){
		inputValue = proEnter.getText(); 
		proEnter.setText("");
		Main.std_pro = inputValue;
		resultLabel.setText("기준 단백질 값 " + Main.std_pro + " 입력완료  ");
		
		}
	
	@FXML private void handleButtonAction2(ActionEvent event){
		inputValue = fatEnter.getText(); 
		fatEnter.setText("");
		Main.std_fat = inputValue;
		resultLabel.setText("기준 포화지방 값 " + Main.std_fat + " 입력완료  ");
		
		}
	
	@FXML private void handleButtonAction3(ActionEvent event){
		inputValue = calEnter.getText(); 
		calEnter.setText("");
		Main.std_cal = inputValue;
		resultLabel.setText("기준 칼로리 값 " + Main.std_cal + " 입력완료  ");
		
		}
	
	
	@Override public void initialize(URL location, ResourceBundle resources)
	{ 
	}
	
	public void movePage() {
	       
	       Stage newStage = new Stage();
	       Stage stage = (Stage)moveBtn.getScene().getWindow();

	       try {
	           Parent second = FXMLLoader.load(getClass().getResource("../view/MorningView.fxml"));
	           Scene sc = new Scene(second);
	           stage.setScene(sc);
	           stage.show();

	       } catch (IOException e) {
	           e.printStackTrace();
	       }

	   }
	

	
}

