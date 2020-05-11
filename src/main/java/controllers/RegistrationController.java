package controllers;

import exceptions.EmailAlreadyExistsException;
import exceptions.UsernameAlreadyExistsException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import services.UserService;

import java.io.IOException;

public class RegistrationController {

    @FXML private TextField FullName;
    @FXML private TextField PhoneNumber;
    @FXML private TextField Mail;
    @FXML private TextField Adress;
    @FXML
    private Text registrationMessage;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private ChoiceBox role;

    @FXML
    public void initialize() {
        role.getItems().addAll("Student", "Librarian");
    }

    @FXML
    public void handleRegisterAction() {
        try {
            UserService.addUser(usernameField.getText(), passwordField.getText(), (String) role.getValue(),FullName.getText(),Adress.getText(),PhoneNumber.getText(),Mail.getText());
            registrationMessage.setText("Account created successfully!");
        } catch (UsernameAlreadyExistsException e) {
            registrationMessage.setText(e.getMessage());
        }catch (EmailAlreadyExistsException e){
            registrationMessage.setText(e.getMessage());
        }
    }

    public void goBack(ActionEvent actionEvent) throws IOException {

            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("mainWindow.fxml"));
            Scene RegisterScene =  new Scene(root);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(RegisterScene);
            window.show();

    }
}
