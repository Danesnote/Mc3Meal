package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lombok.NoArgsConstructor;

public interface MenuPanController extends Initializable {
	public class MyButtonEventHandler implements EventHandler<MouseEvent> {
		double car = 0, pro = 0, fat = 0, cal = 0;
		Label carlabel, prolabel, fatlabel, callabel;
		

		public MyButtonEventHandler(int id, Label carLabel, Label proLabel, Label fatLabel, Label calLabel) {
			String values[] = Main.menu_table.get(id);
			car = Double.parseDouble(values[1]);
			pro = Double.parseDouble(values[2]);
			fat = Double.parseDouble(values[3]);
			cal = Double.parseDouble(values[4]);
			this.carlabel = carLabel;
			this.prolabel = proLabel;
			this.fatlabel = fatLabel;
			this.callabel = calLabel;
		}

		@Override
		public void handle(final MouseEvent ME) {
			Object obj = ME.getSource();
			ButtonBase button = (ButtonBase) obj;
		      button.setCursor(Cursor.HAND); // 커서모양 변경
			System.out.println(obj.toString());
			if (ME.getButton() == MouseButton.SECONDARY) {
				if (Main.str_car < car || Main.str_pro < pro || Main.str_fat < fat || Main.str_cal <= cal) {
				} else {
					Main.str_car -= car;
					Main.str_pro -= pro;
					Main.str_fat -= fat;
					Main.str_cal -= cal;
				}
			} else {
				Main.str_car += car;
				Main.str_pro += pro;
				Main.str_fat += fat;
				Main.str_cal += cal;
			}
			System.out.println(Main.str_car + " " + Main.str_pro + " " + Main.str_fat + " " + Main.str_cal);
			carlabel.setText(Double.toString(Main.str_car));
			prolabel.setText(Double.toString(Main.str_pro));
			fatlabel.setText(Double.toString(Main.str_fat));
			callabel.setText(Double.toString(Main.str_cal));
			
			
		}
	}

	public default void toolset(Tooltip t, int id) {
		String values[] = Main.menu_table.get(id);
		t.setText("탄수화물(g) : " + values[1] + "\n단백질(g) : " + values[2] + "\n포화지방(g) : " + values[3] + " \n칼로리(kcal) : "
				+ values[4]);
	}

	public default void movePageURL(Stage sg, String url) {
		try {
			Parent second = FXMLLoader.load(getClass().getResource(url));

			Scene sc = new Scene(second);
			sg.setScene(sc);
			sg.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
