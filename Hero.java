public class Hero extends AnimatedThing{
    private static final double GRAVITY = 9.8;
    private static final double JUMP_ACCELERATION = -500.0;
    private static final double MIN_Y = 150.0;
    private double velocityY = 0.0;
    private static final double MAX_DOWNWARD_VELOCITY = 500.0; // Adjust as needed

    private boolean isJumping = false;
    public Hero(String fileName, double x, double y, int attitude, double index, double frames, double indexMax, double sizeWindowX, double sizeWindowY, double offset) throws InterruptedException {
        super(fileName, x, y, attitude, (int) index, (int) frames, (int) indexMax, (int) sizeWindowX, (int) sizeWindowY, (int) offset);
    }
    public void jump() {
        if (!isJumping) {
            imageView.setY(getY() + offset);
            velocityY = JUMP_ACCELERATION;
            isJumping = true;
        }
    }

    @Override
    public void update(long time) {
        super.update(time);

        // Simulate gravity with a maximum downward velocity
        double deltaTime = (time / 1_000_000_000.0)%5;

        velocityY = Math.min(velocityY + GRAVITY * deltaTime, MAX_DOWNWARD_VELOCITY);

        // Print or log the velocityY for debugging
        System.out.println("VelocityY: " + velocityY);

        // Update position
        imageView.setY(getY() + velocityY * deltaTime);

        // Ensure the Hero does not go below the road level
        if (getY() > MIN_Y) {
            imageView.setY(MIN_Y);
            velocityY = 0.0;  // Reset vertical velocity when grounded
            isJumping = false;
        }
    }



    private double getY() {
        return this.Y;
    }

}
