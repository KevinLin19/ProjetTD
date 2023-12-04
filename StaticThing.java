import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    private double sizeX;
    private double sizeY;
    private ImageView imageView;

    public StaticThing(String fileName, double sizeX, double sizeY, double x, double y) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        Image image = new Image("file:" + fileName);
        imageView = new ImageView(image);
        imageView.setX(x);
        imageView.setY(y);
        imageView.setFitWidth(sizeX);
        imageView.setFitHeight(sizeY);
    }

    public ImageView getImageView() {
        return imageView;
    }
}
