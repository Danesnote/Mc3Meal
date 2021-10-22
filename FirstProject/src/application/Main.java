package application;
	
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import application.model.Menu;
import application.model.MenuDAO;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	public static Double str_car = 0.0;
	public static Double str_pro = 0.0;
	public static Double str_fat = 0.0;
	public static Double str_cal = 0.0;
	public static String std_car;
	public static String std_pro;
	public static String std_fat;
	public static String std_cal;
	public static HashMap<Integer, String[]> menu_table;
	
	
	@Override
	public void start(Stage primaryStage) throws ClassNotFoundException, SQLException {
		menu_table = new HashMap<Integer, String[]>();
		ObservableList<Menu> menuData = MenuDAO.searchMenu();
		
		for(Menu me : menuData) {
			String[] value = new String[5];
			value[0] = me.getMenuName();
			value[1] = Double.toString(me.getMenuCar());
			value[2] = Double.toString(me.getMenuPro());
			value[3] = Double.toString(me.getMenuFat());
			value[4] = Double.toString(me.getMenuCal());
			
			//System.out.println(me.getMenuId() + " " + value[0] + " " + value[1] + " " + value[2] + " " + value[3] + " " + value[4]);
			menu_table.put(me.getMenuId(), value);
		}
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Mc3Meal App");
		initRootLayout();    // Initialize RootLayout
		showMainView();  // Display the MainOperations View
	}
	
	public void initRootLayout() { // ��Ʈ���̾ƿ�
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			Scene scene = new Scene(rootLayout); 
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showMainView() { // ����ȭ��
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("view/MainView.fxml"));
			AnchorPane MainOperationsView = (AnchorPane) loader.load();
			rootLayout.setCenter(MainOperationsView);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
