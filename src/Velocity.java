
/**
 * Holds the velocity for an object.
 *
 * Velocity x/y vector is defined as
 *        y
 *        ^
 *        |
 *        |
 * -x<--------- > x
 *        |
 *        |
 *       \/
 *       -y
 */
public class Velocity {
    /* Fields */
    private int speed;
    private int direction;
    
    /* Constructor */
    public Velocity(int speed, int direction) {
        changeSpeed(speed);
        changeDirection(direction);
    }
    
    /* Fetch this velocity object as a speed/direction vector */
    public int[] getSpeedStatus() {
        return new int[]{speed, direction};
    }
    
    /* Fetches this velocity object as a x/y vector */
    public int[] getSpeedVector() {
        if (direction == Constants.NORTH) {
            return new int[]{0, speed};
        }
        if (direction == Constants.SOUTH) {
            return new int[]{0, speed * -1};
        }
        if (direction == Constants.WEST) {
            return new int[]{speed * -1, 0};
        }
        if (direction == Constants.EAST) {
            return new int[]{speed, 0};
        }
        
        //We should not get here
        throw new RuntimeException(
            "Invalid direction encountered in Velocity."
        );
    }
    
    /* Change speed to the given value */
    public void changeSpeed(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException(
                "Negative speed passed on to Velocity."
            );
        }
        this.speed = speed;
    }
    
    /* Change direction to the given value */
    public void changeDirection(int direction) {
        if (Constants.checkDirectionExists(direction)) {
            throw new IllegalArgumentException(
                "Illegal direction received in Velocity constructor."
            );
        }
        this.direction = direction;
    }
}



