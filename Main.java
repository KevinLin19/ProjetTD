import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
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
        GameScene scene = new GameScene(root, 500, 300);
        stage.setScene(scene);
        stage.show();
        System.out.println("backgroundLeft X: " + scene.getBackgroundLeft().getImageView().getX() + ", Y: " + scene.getBackgroundLeft().getImageView().getY());
        System.out.println("backgroundRight X: " + scene.getBackgroundRight().getImageView().getX() + ", Y: " + scene.getBackgroundRight().getImageView().getY());


    }
}
