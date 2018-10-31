package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private void openSignUp() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/img/plane.png"));
        stage.setTitle("Sign Up");
        stage.show();
    }

}
