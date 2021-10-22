package application.controller;

import java.sql.SQLException;

import application.model.Menu;
import application.model.MenuDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SettingController {
	@FXML
	private TextField menuIdText;
	@FXML
	private TextField typeIdText;
	@FXML
	private TextArea resultArea;
	
	@FXML
	private TextField idText;
	@FXML
	private TextField nameText;
	@FXML
	private TextField carText;
	@FXML
	private TextField proText;
	@FXML
	private TextField fatText;
	@FXML
	private TextField calText;
	
	@FXML
	private TableView menuTable;

	
	@FXML
	private TableColumn<Menu, Integer> menuIdColumn;
	@FXML
	private TableColumn<Menu, String> menuNameColumn;
	@FXML
	private TableColumn<Menu, Double> menuCarColumn;
	@FXML
	private TableColumn<Menu, Double> menuProColumn;
	@FXML
	private TableColumn<Menu, Double> menuFatColumn;	
	@FXML
	private TableColumn<Menu, Double> menuCalColumn;

	@FXML
	private void searchMenu(ActionEvent actionEvent) throws ClassNotFoundException, SQLException {
		try {
			Menu menu = MenuDAO.searchMenu(menuIdText.getText());

			
			populateANdShowMenu(menu);
		} catch(SQLException e){
			e.printStackTrace();
			resultArea.setText("Error occurred while getting employee information from DB.\n" + e);
			throw e;
		}
	}
	
	@FXML
	private void searchAll(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
		try {
			if(typeIdText.getText().isEmpty()) {
				ObservableList<Menu> menuData = MenuDAO.searchMenu();
				
				populateMenus(menuData);
			}
			else {
				ObservableList<Menu> menuData = MenuDAO.searchType(typeIdText.getText());
				populateMenus(menuData);
			}
			
		} catch(SQLException e) {
			System.out.println("Error occurred while getting menu information from DB.\n" + e);
			throw e;
		}
	}

	
	private void populateMenus(ObservableList<Menu> menuData) {
		menuTable.setItems(menuData);
		
	}

	@FXML
	private void initialize() {
		menuIdColumn.setCellValueFactory(cellData -> cellData.getValue().getMenuIdProperty().asObject());
		menuNameColumn.setCellValueFactory(cellData -> cellData.getValue().getMenuNameProperty());
		menuCarColumn.setCellValueFactory(cellData -> cellData.getValue().getMenuCarProperty().asObject());
		menuProColumn.setCellValueFactory(cellData -> cellData.getValue().getMenuProProperty().asObject());
		menuFatColumn.setCellValueFactory(cellData -> cellData.getValue().getMenuFatProperty().asObject());
		menuCalColumn.setCellValueFactory(cellData -> cellData.getValue().getMenuCalProperty().asObject());
	}
	
	@FXML
	private void populateANdShowMenu(Menu menu) {
		if (menu != null) {
			populateMenu(menu);
			setMenuInfoToTextArea(menu);
		} else
			resultArea.setText("This menu does not exist!\n");
		
	}

	@FXML
	private void setMenuInfoToTextArea(Menu menu) {
		resultArea.setText(menu.getMenuId() +
					" " + menu.getMenuName() +
					" " + menu.getMenuCar() +
					" " + menu.getMenuPro() +
					" " + menu.getMenuFat() +
					" " + menu.getMenuCal());
	}

	@FXML
	private void populateMenu(Menu menu) {
		ObservableList<Menu> menuData = FXCollections.observableArrayList();
		menuData.add(menu);
		menuTable.setItems(menuData);
	}
	
	@FXML
	private void insertMenu(ActionEvent actionEvent) throws ClassNotFoundException, SQLException {
		try {
			MenuDAO.insertMenu(idText.getText(), nameText.getText(), carText.getText(), proText.getText(), fatText.getText(), calText.getText());
		} catch(SQLException e) {
			resultArea.setText("Problem occurred while inserting menu " + e);
			throw e;
		}
	}
	
	@FXML
	private void deleteMenu(ActionEvent actionEvent) throws ClassNotFoundException, SQLException {
		try {
			MenuDAO.deleteMenuWithId(menuIdText.getText());
			resultArea.setText("Menu deleted! menu id: " + menuIdText.getText() + "\n") ;
		} catch (SQLException e) {
			resultArea.setText("Problem occurred while deleting menu " + e);
			throw e;
		}
	}
	
	
}
