import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

class GameScene extends Scene {
    private Camera camera;
    private StaticThing backgroundLeft;
    private StaticThing backgroundRight;
    private Hero hero;
    private int NumberOfLives = 3;
    public GameScene(Group root, double width, double height) throws InterruptedException {
        super(root, width, height);
        camera = new Camera(100, 100);
        backgroundLeft = new StaticThing("img/desert.png", width, height, -width/2, 0);
        root.getChildren().add(backgroundLeft.getImageView());
        backgroundRight = new StaticThing("img/desert.png", width, height, width/2, 0);
        root.getChildren().add(backgroundRight.getImageView());
        hero = new Hero("img/heros.png",150,430,1,0,0.02,6,75,100,0);
        root.getChildren().add(hero.getImageView());
        AnimationTimer timer = new AnimationTimer()
        {public void handle(long time){
            hero.update(time);
            camera.update(time);
            GameScene.update(time);
        }
        };
        timer.start();
        setOnMouseClicked((MouseEvent event) -> {
            System.out.println("Jump");
            hero.jump();
        });
    }

    private static void update(long time) {
        //System.out.println(time);
    }

    public Camera retrieveCamera() {
        return camera;
    }

    public StaticThing getBackgroundLeft() {
        return backgroundLeft;
    }

    public StaticThing getBackgroundRight() {
        return backgroundRight;
    }

    public void render() {
        backgroundLeft.getImageView().setX(backgroundLeft.getImageView().getX() - camera.getX());
        backgroundRight.getImageView().setX(backgroundRight.getImageView().getX() - camera.getX());
    }
}