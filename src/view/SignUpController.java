package view;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * Controlador de la vista de SignUp
 * @author Julen Bujanda
 * @version 1.0
 * @see LoginController
 */
public class SignUpController {

    @FXML
    private MediaView mediaView;

    @FXML
    private ImageView closeButton;

    /**
     * Inicializa la vista. Añade el video de fondo y lo reproduce.
     */
    public void initialize() {
        Media media = new Media(getClass().getResource("../media/backgroundVideo.mp4").toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        mediaPlayer.setVolume(0.5);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
    }

    /**
     * Cierra la ventana.
     */
    @FXML
    private void salir() {
        ((Stage) closeButton.getScene().getWindow()).close();
    }

}
