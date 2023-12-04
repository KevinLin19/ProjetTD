import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Collection;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        GameScene scene = new GameScene(root, 1000, 600);
        stage.setScene(scene);
        stage.show();
        Button button = new Button("Bouton!");
               root.getChildren().addAll(button);
                       button.setOnAction((e) ->{
                           scene.retrieveCamera().move(50);
                           scene.render();
                           System.out.println(scene.retrieveCamera().toString());
                       });
    }
}