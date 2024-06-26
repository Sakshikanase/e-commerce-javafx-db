package login_screen;

import java.net.URL;
import java.nio.file.Paths;

import common.StageHolder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginScreen extends Application {
	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage stageCreatedByJavafx) throws Exception {
		
		StageHolder.stage=stageCreatedByJavafx;
		
		URL fxmlurl = Paths
				.get("C:\\Users\\Admin\\eclipse-workspace\\ECommercejavafxDB\\src\\login_screen\\Eloginscreen.fxml")
				.toUri().toURL();

		Parent actorGroup = FXMLLoader.load(fxmlurl);

		StageHolder.stage.setTitle("E-Commerce Login");

		Scene scene = new Scene(actorGroup, 600, 400);

		StageHolder.stage.setScene(scene);
		StageHolder.stage.show();

	}

}
