package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Doctor extends Application {

	@Override
	public void start(Stage doctor) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/DoctorReg.fxml"));
		Scene scene = new Scene(root,726,750);
		doctor.setResizable(false);
		doctor.setScene(scene);
		doctor.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

