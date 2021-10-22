package application.model;


import javafx.beans.property.*;

public abstract class Menu {
	private IntegerProperty menu_id;
	private StringProperty menu_name;
	private DoubleProperty menu_car;
	private DoubleProperty menu_pro;
	private DoubleProperty menu_fat;
	private DoubleProperty menu_cal;
	
	public Menu() {
		this.menu_id = new SimpleIntegerProperty();
		this.menu_name = new SimpleStringProperty(); 
		this.menu_car = new SimpleDoubleProperty();
		this.menu_pro = new SimpleDoubleProperty();
		this.menu_fat = new SimpleDoubleProperty();
		this.menu_cal = new SimpleDoubleProperty();
	}
	
	public IntegerProperty getMenuIdProperty() {
		return menu_id;
	}
	
	public int getMenuId() {
		return menu_id.get();
	}
	
	public void setMenuId(int menu_id) {
		System.out.println(menu_id);
		this.menu_id.set(menu_id);
	}
	
	public String getMenuName() {
		return menu_name.get();
	}
	
	public StringProperty getMenuNameProperty() {
		return menu_name;
	}
	
	public void setMenuName(String menu_name) {
		this.menu_name.set(menu_name);;
	}
	
	public double getMenuCar() {
		return menu_car.get();
	}
	
	public DoubleProperty getMenuCarProperty() {
		return menu_car;
	}
	
	public void setMenuCar(double menu_car) {
		this.menu_car.set(menu_car);
	}
	

	public double getMenuPro() {
		return menu_pro.get();
	}
	
	public DoubleProperty getMenuProProperty() {
		return menu_pro;
	}
	
	public void setMenuPro(double menu_pro) {
		this.menu_pro.set(menu_pro);;
	}
	
	public double getMenuFat() {
		return menu_fat.get();
	}
	
	public DoubleProperty getMenuFatProperty() {
		return menu_fat;
	}
	
	public void setMenuFat(double menu_fat) {
		this.menu_fat.set(menu_fat);
	}
	
	public double getMenuCal() {
		return menu_cal.get();
	}
	
	public DoubleProperty getMenuCalProperty() {
		return menu_cal;
	}
	public void setMenuCal(double menu_cal) {
		this.menu_cal.set(menu_cal);;
	}
	
	public abstract int getType();

}