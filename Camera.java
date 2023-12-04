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

    public void move(int X) {
        this.x = this.x + X;
    }

    public void update(long time) {
        /*
        double vitesse_x=0;
        double vitesse_y=0;
        double acceleration_y = (150-getX())+1.2*vitesse_y;
        double acceleration_x = (150-getX())+1.2*vitesse_x;
        vitesse_y = acceleration_y*time;
        vitesse_x = acceleration_x*time;
        this.y = vitesse_y*time;
        this.x = vitesse_x*time;
         */
    }
}
