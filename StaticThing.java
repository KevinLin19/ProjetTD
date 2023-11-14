import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    static double SizeX;
    static double SizeY;
    static ImageView imageView;
    public StaticThing(String fileName, double SizeX, double SizeY, double X, double Y) {
        StaticThing.SizeX = SizeX;
        StaticThing.SizeY = SizeY;
        Image background = new Image("file:" + fileName);
        imageView = new ImageView(background);
        imageView.setX(X);
        imageView.setY(Y);
        imageView.setFitWidth(SizeX);
        imageView.setFitHeight(SizeY);
    }
    public static ImageView getImageView() {
        return imageView;
    }

}
