public class Camera {
    public double x;
    public double y;
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public Camera(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x +", "+ y ;
    }
}
