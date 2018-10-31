import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    private AnchorPane myPane;

    @Override
    public void start(Stage primaryStage) throws Exception {
        myPane = FXMLLoader.load(getClass().getResource("view/Login.fxml"));
        primaryStage.getIcons().add(new Image("file:src/img/plane.png"));
        primaryStage.setTitle("Trip");
        primaryStage.setScene(new Scene(myPane));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
