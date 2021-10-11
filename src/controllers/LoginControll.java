package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginControll {

    @FXML
    private AnchorPane ExPane;

    @FXML
    private Pane pane;

    @FXML
    private Label logLable;

    @FXML
    private TextField user;

    @FXML
    private PasswordField PWD;

    @FXML
    private JFXButton btn;

    @FXML
    private Label newAcc;
    
    @FXML
    private Label pwdreset;
    
    @FXML
    void CreateAcc(MouseEvent event) {
    	newAcc.getScene().getWindow().hide();
    	Stage userselect = new Stage();
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/UserSelect.fxml"));
			Scene scene = new Scene(root);
			userselect.setResizable(false);
			userselect.setScene(scene);
			userselect.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    @FXML
    void pwdreset(MouseEvent event) {
    	pwdreset.getScene().getWindow().hide();
    	Stage userselect = new Stage();
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/PasswordReset.fxml"));
			Scene scene = new Scene(root);
			userselect.setResizable(false);
			userselect.setScene(scene);
			userselect.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


}