package controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PatientControll {
	@FXML
    private AnchorPane pane1;

    @FXML
    private TextField userID;

    @FXML
    private TextField patientName;

    @FXML
    private TextField patientEmail;

    @FXML
    private PasswordField PWD;

    @FXML
    private TextField patientWeight;

    @FXML
    private TextField patientHeight;

    @FXML
    private RadioButton pMale;

    @FXML
    private RadioButton pFemale;

    @FXML
    private PasswordField confirmPWD;

    @FXML
    private TextArea Others;

    @FXML
    private JFXButton editRequest;

    @FXML
    private JFXButton patientreg;

    @FXML
    private ImageView back;

    @FXML
    void Backword(MouseEvent event) {
    	back.getScene().getWindow().hide();
    	Stage backword = new Stage();
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/UserSelect.fxml"));
			Scene scene = new Scene(root);
			backword.setResizable(false);
			backword.setScene(scene);
			backword.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}

