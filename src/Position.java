
/**
 * Holds a 2D position for an object.
 */
public class Position {
    /* Fields */
    private int x;
    private int y;
    
    /* Constructor by coordinates */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /* Constructor by another Position object */
    public Position(Position p) {
        int[] coordinates = p.getCoordinates();
        x = coordinates[0];
        y = coordinates[1];
    }
    
    /* Returns array{distance x, distance y}*/
    public double distanceTo(Position p) {
        int[] coordinates = p.getCoordinates();
        return Math.sqrt(
            (double)((coordinates[0] - x) * (coordinates[0] - x)) +
            (double)((coordinates[1] - y) * (coordinates[1] - y))
        );
    }
    
    /* Updates this position based on current velocity */
    public void updatePosition(Velocity v) {
        int[] vec = v.getSpeedVector();
        x += vec[0];
        y += vec[1];
    }
    
    /* Returns array{position x, position y} */
    public int[] getCoordinates() {
        return new int[]{x, y};
    }
    
    /* Creates a deep clone of this Postion object */
    public Position copy() {
        return new Position(x, y);
    }
}



