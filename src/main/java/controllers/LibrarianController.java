package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class LibrarianController {
    public Button addBookButton;
    @FXML
    private Button goBack;
    @FXML
    public  static TableView Available;
    @FXML
    public static TableColumn AvailableColumn;
    @FXML
    private TableView Unavailable;
    @FXML
    private TableColumn UnavailableColumn;
    @FXML
    private TableView Issued;
    @FXML
    private TableColumn IssuedColumn;
    public static ObservableList<String> getStrings(){
        ObservableList<String> names= FXCollections.observableArrayList();
        names.add("Book1");
        return names;
    }
    public void add(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("addWindow.fxml"));
        Scene RegisterScene =  new Scene(root);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(RegisterScene);
        window.show();
    }

    public void goBackAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("mainWindow.fxml"));
        Scene RegisterScene =  new Scene(root);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(RegisterScene);
        window.show();
    }

}
