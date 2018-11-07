package view;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class LoginController {

    @FXML
    private Pane pane1;

    @FXML
    private Pane pane2;

    @FXML
    private Pane pane3;

    @FXML
    private Pane pane4;

    @FXML
    private ImageView closeButton;

    public void initialize() {
        pane1.setStyle("-fx-background-image: url(img/fade1.jpg);");
        pane2.setStyle("-fx-background-image: url(img/fade2.jpg);");
        pane3.setStyle("-fx-background-image: url(img/fade3.jpg);");
        pane4.setStyle("-fx-background-image: url(img/fade4.jpg);");
        animacionFondo();
    }

    @FXML
    private void salir() {
        ((Stage) closeButton.getScene().getWindow()).close();
    }

    private void animacionFondo() {
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(5),
                pane4);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();
        fadeTransition
                .setOnFinished(event -> {

                    FadeTransition fadeTransition1 = new FadeTransition(
                            Duration.seconds(3), pane3);
                    fadeTransition1.setFromValue(1);
                    fadeTransition1.setToValue(0);
                    fadeTransition1.play();

                    fadeTransition1.setOnFinished(event1 -> {
                        FadeTransition fadeTransition2 = new FadeTransition(
                                Duration.seconds(3), pane2);
                        fadeTransition2.setFromValue(1);
                        fadeTransition2.setToValue(0);
                        fadeTransition2.play();

                        fadeTransition2.setOnFinished(event2 -> {

                            FadeTransition fadeTransition0 = new FadeTransition(
                                    Duration.seconds(3), pane2);
                            fadeTransition0.setFromValue(0);
                            fadeTransition0.setToValue(1);
                            fadeTransition0.play();

                            fadeTransition0.setOnFinished(event3 -> {

                                FadeTransition fadeTransition11 = new FadeTransition(
                                        Duration.seconds(3), pane3);

                                fadeTransition11.setFromValue(0);
                                fadeTransition11.setToValue(1);
                                fadeTransition11.play();

                                fadeTransition11.setOnFinished(event4 -> {

                                    FadeTransition fadeTransition22 = new FadeTransition(
                                            Duration.seconds(3), pane4);

                                    fadeTransition22.setFromValue(0);
                                    fadeTransition22.setToValue(1);
                                    fadeTransition22.play();

                                    fadeTransition22.setOnFinished(event5 -> {

                                        animacionFondo();
                                    });

                                });

                            });

                        });
                    });

                });
    }

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
        stage.initStyle(StageStyle.UNDECORATED);
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        Rectangle rect = new Rectangle(900, 506);
        rect.setArcHeight(60.0);
        rect.setArcWidth(60.0);
        root.setClip(rect);
        stage.getIcons().add(new Image("file:src/img/plane.png"));
        stage.setTitle("Sign Up");
        ((Stage) pane1.getScene().getWindow()).close();
        stage.show();
    }

}
