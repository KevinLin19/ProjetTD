public class Hero extends AnimatedThing{
    private static final double GRAVITY = 100;
    private static final double JUMP_ACCELERATION = -500.0;
    private static final double MIN_Y = 150.0;
    private double velocityY = 0.0;
    private static final double MAX_DOWNWARD_VELOCITY = 500.0;
    boolean isJumping = false;
    public Hero(String fileName, double x, double y, int attitude, double index, double frames, double indexMax, double sizeWindowX, double sizeWindowY, double offset) throws InterruptedException {
        super(fileName, x, y, attitude, (int) index, (int) frames, (int) indexMax, (int) sizeWindowX, (int) sizeWindowY, (int) offset);
    }
    public void jump() {
        if (!isJumping) {
            if(this.Y < 2*sizeWindowY/3){
                imageView.setY(this.Y + offset);
            }
            else{
                imageView.setY(this.Y - offset);
            }
            isJumping = false;
        }
    }

}
