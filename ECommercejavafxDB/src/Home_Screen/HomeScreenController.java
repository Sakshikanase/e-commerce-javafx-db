package Home_Screen;

import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import login_screen.DBUtils;

public class HomeScreenController {
	@FXML
	Button productmanagementclick;

	@FXML
	Button usermanagementclick;

	@FXML
	Button logoutclick;

	public void productmanagementclick() {
		System.out.println("Welcome to Product Management");

	}

	public void usermanagementclick() {
		System.out.println("Welcome to User Management");

	}

	public void logoutclick() {
		System.out.println("  logout");

	}

}
