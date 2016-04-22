
/**
 * Holds constant values for the program.
 */
public class Constants {
    /* Global fields */
    public static final int MAX_SPEED = 50;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final int WEST = 2;
    public static final int EAST = 3;
    
    /* Validate direction */
    public static boolean checkDirectionExists(int direction) {
        if (direction != NORTH && direction != SOUTH 
                && direction != WEST && direction != EAST) {
            return false;
        }
        return true;
    }
    
    /* Map direction number to text */
    public static String findDirection(int direction) {
        if (direction == NORTH) {
            return "north";
        }
        if (direction == SOUTH) {
            return "south";
        }
        if (direction == WEST) {
            return "west";
        }
        if (direction == EAST) {
            return "east";
        }
        return null;
    }
}