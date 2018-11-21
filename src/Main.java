import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Julen Bujanda
 * @version 1.0
 * @see view.LoginController
 */
public class Main extends Application {

    private AnchorPane myPane;

    private double xOffset;
    private double yOffset;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        myPane = FXMLLoader.load(getClass().getResource("view/Login.fxml"));
        Scene scene = new Scene(myPane);
        primaryStage.getIcons().add(new Image("file:src/img/plane.png"));
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Rectangle rect = new Rectangle(520, 525);
        rect.setArcHeight(60.0);
        rect.setArcWidth(60.0);
        myPane.setOnMousePressed(event -> {
            xOffset = primaryStage.getX() - event.getScreenX();
            yOffset = primaryStage.getY() - event.getScreenY();
        });
        myPane.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() + xOffset);
            primaryStage.setY(event.getScreenY() + yOffset);
        });
        myPane.setClip(rect);
        primaryStage.setTitle("Trip Log In");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
