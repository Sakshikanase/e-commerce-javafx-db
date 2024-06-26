package Home_Screen;

import java.net.URL;
import java.nio.file.Paths;

import common.StageHolder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeScreen {

	public static void show() throws Exception {
		URL fxmlurl = Paths
				.get("C:\\Users\\Admin\\eclipse-workspace\\ECommercejavafxDB\\src\\Home_Screen\\homescreen.fxml")
				.toUri().toURL();

		Parent actorGroup = FXMLLoader.load(fxmlurl);

		StageHolder.stage.setTitle("Home Screen");

		Scene scene = new Scene(actorGroup, 600, 400);

		StageHolder.stage.setScene(scene);
		StageHolder.stage.show();

	}

}
