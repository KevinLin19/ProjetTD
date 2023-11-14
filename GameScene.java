import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

class GameScene extends Scene {
    private Group root;
    private Camera camera;
    private StaticThing backgroundLeft;
    private StaticThing backgroundRight;

    public GameScene(Group root, double width, double height) {
        super(root, width, height);
        this.root = root;
        camera = new Camera(0, 0);
        backgroundLeft = new StaticThing("img/desert.png", width, height, 0,100);
        backgroundRight = new StaticThing("img/desert.png", width, height, 100,100);

        if (backgroundLeft.getImageView() != null && !root.getChildren().contains(backgroundLeft.getImageView())) {
            root.getChildren().add(backgroundLeft.getImageView());
        }

        if (backgroundRight.getImageView() != null && !root.getChildren().contains(backgroundRight.getImageView())) {
            root.getChildren().add(backgroundRight.getImageView());
        }
    }

    // Getter for Camera
    public Camera retrieveCamera() {
        return camera;
    }
    public StaticThing getBackgroundLeft() {
        return backgroundLeft;
    }
    public StaticThing getBackgroundRight() {
        return backgroundRight;
    }
}