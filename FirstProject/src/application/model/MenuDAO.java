package application.model;


import java.sql.ResultSet;
import java.sql.SQLException;
import application.util.DBUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MenuDAO {

	public static Menu searchMenu(String menuId) throws SQLException, ClassNotFoundException {
		String selectStmt = "SELECT * FROM menu WHERE menu_id=" + menuId;
		try {
			ResultSet rsMenu = DBUtil.dbExecuteQuery(selectStmt);
			Menu menu = getMenuFromResultSet(rsMenu);
			return menu;
		} catch(SQLException e) {
			System.out.println("While searching an menu with " + menuId + " id, an error occurred: " + e);
			throw e;
		}
	}

	private static Menu getMenuFromResultSet(ResultSet rs) throws SQLException {
		Menu menu = null;
		if(rs.next()) {
			switch(rs.getInt("MENU_ID")/1000) {
			case 1201 :	
				menu = new Ham();
				break;
			case 1202 :
				menu = new Morning();
				break;
			case 1203 :
				menu = new Side();
				break;
			case 1204 :
				menu = new Sauce();
				break;
			case 1205 :
				menu = new Drink();
				break;
			}
			menu.setMenuId(rs.getInt("MENU_ID"));
			menu.setMenuName(rs.getString("MENU_NAME"));
			menu.setMenuCar(rs.getDouble("CAR"));
			menu.setMenuPro(rs.getDouble("PRO"));
			menu.setMenuFat(rs.getDouble("FAT"));
			menu.setMenuCal(rs.getDouble("CAL"));
		}
		return menu;
	}

	public static void deleteMenuWithId(String menuId) throws ClassNotFoundException, SQLException  {
		String updateStmt = "BEGIN\n" + "	DELETE FROM menu\n" + "		WHERE menu_id =" + menuId + ";\n"
				+ "   COMMIT;\n" + "END;";
		System.out.println(updateStmt);
		try {
			DBUtil.dbExecuteUpdate(updateStmt);
		} catch(SQLException e) {
			System.out.print("Error occurred while DELETE Operation: " + e);
			throw e;
		}
	}

	public static void insertMenu(String id, String name, String car, String pro, String fat, String cal) throws ClassNotFoundException, SQLException {
		String updateStmt = "{call insertMenu(?,?,?,?,?,?,?)}";
		try {
			DBUtil.dbProExecuteUpdate(updateStmt, id, name, car, pro, fat, cal, id.substring(0,4));
		} catch (SQLException e) {
			System.out.print("Error occurred while DELETE Operation: " + e);
			throw e;
		}
		
	}

	public static ObservableList<Menu> searchMenu() throws ClassNotFoundException, SQLException {
		String selectStmt = "SELECT * FROM menu";
		try {
			ResultSet rsmenu = DBUtil.dbExecuteQuery(selectStmt);
			ObservableList<Menu> menuList = getMenuList(rsmenu);
			return menuList;
		} catch (SQLException e) {
			System.out.println("SQL select operation has been failed: " + e);
			throw e;
		}
	}

	private static ObservableList<Menu> getMenuList(ResultSet rs) throws SQLException {
		ObservableList<Menu> menuList = FXCollections.observableArrayList();
		while(rs.next()) {
			Menu menu = null;
			switch(rs.getInt("MENU_ID")/1000) {
			case 1201 :	
				menu = new Ham();
				break;
			case 1202 :
				menu = new Morning();
				break;
			case 1203 :
				menu = new Side();
				break;
			case 1204 :
				menu = new Sauce();
				break;
			case 1205 :
				menu = new Drink();
				break;
			}
			menu.setMenuId(rs.getInt("MENU_ID"));
			menu.setMenuName(rs.getString("MENU_NAME"));
			menu.setMenuCar(rs.getDouble("CAR"));
			menu.setMenuPro(rs.getDouble("PRO"));
			menu.setMenuFat(rs.getDouble("FAT"));
			menu.setMenuCal(rs.getDouble("CAL"));
			menuList.add(menu);
		}
		return menuList;
	}

	public static ObservableList<Menu> searchType(String type) throws ClassNotFoundException, SQLException {
		String selectStmt = "SELECT * FROM menu WHERE menu_id in (SELECT menu_id FROM st_menu WHERE m_type=" + type +")";
		try {
			ResultSet rsmenu = DBUtil.dbExecuteQuery(selectStmt);
			ObservableList<Menu> menuList = getMenuList(rsmenu);
			return menuList;
		} catch (SQLException e) {
			System.out.println("SQL select operation has been failed: " + e);
			throw e;
		}
	}
	
	

}
