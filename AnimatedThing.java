import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

abstract class AnimatedThing{
    double X;

    double temps0 = 1;
    double Y;
    ImageView imageView;
    int attitude;
    double index, frames, indexMax, sizeWindowX, sizeWindowY, offset;

    public AnimatedThing(String fileName, double x, double y, int attitude, int index, int frames, int indexMax, int sizeWindowX, int sizeWindowY, int offset) throws InterruptedException {
        X = x;
        Y = y;
        this.attitude = attitude;
        this.frames = frames;
        this.index = index;
        this.indexMax = indexMax;
        this.sizeWindowX = sizeWindowX;
        this.sizeWindowY = sizeWindowY;
        this.offset = offset;
        Image image = new Image("file:" + fileName);
        imageView = new ImageView(image);
        imageView.setViewport(new Rectangle2D(index*85, 0, sizeWindowX, sizeWindowY));
        imageView.setX(x);
        imageView.setY(y);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void ChangeViewPort(){
        if (index < indexMax) {
            getImageView().setViewport(new Rectangle2D(85*index, 0, 80, 100));
            index++;
        } else {
            index = 0;
        }
    }

    public void update(long time) {
        double temps = (double) (time/100000000)%10;
        //System.out.println(temps);
        if(temps == 1 & temps0 == 1){
            ChangeViewPort();
            temps0 ++;
        }
        if(temps == 2 & temps0 == 2){
            ChangeViewPort();
            temps0 ++;
        }
        if(temps == 3 & temps0 == 3){
            ChangeViewPort();
            temps0 ++;
        }
        if(temps == 4 & temps0 == 4){
            ChangeViewPort();
            temps0 ++;
        }
        if(temps == 5 & temps0 == 5){
            ChangeViewPort();
            temps0 ++;
        }
        if(temps == 6 & temps0 == 6){
            ChangeViewPort();
            temps0 ++;
        }
        if(temps == 7 & temps0 == 7){
            ChangeViewPort();
            temps0 ++;
        }
        if(temps == 8 & temps0 == 8){
            ChangeViewPort();
            temps0 ++;
        }
        if(temps == 9 & temps0 == 9){
            ChangeViewPort();
            temps0 =1;
        }
    }
}
