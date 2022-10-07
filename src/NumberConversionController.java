import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class NumberConversionController extends Application implements Initializable {
    public Label label;
    public TextField txtNumberInput;

    public static void main(String[] args) {
        NumberConversionController.launch();

    }
    private NumberConversionModel ncModel = new NumberConversionModel();


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NumberConversion.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void initialize(URL url, ResourceBundle rb) {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Text Input Dialog");
        dialog.setContentText("Please enter your name:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            String message = ncModel.getGreetingsMessage(result.get());

            label.setText(message);
        }
    }
    public double getMilesFromKilometers (double km){

    }public double getKilometersFromMiles (double miles){

    }d
    

}
