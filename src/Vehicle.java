
/**
 * Represents a vehicle traveling the simulated roads.
 */
public class Vehicle {
    /* Fields */
    private Velocity velocity;
    private Position currentPosition;
    private Position origin;
    private Position destination;
    private VehicleRecord record;
    
    /* Constructor */
    public Vehicle(Position origin, Position destination, int direction) {
        this.origin = origin;
        this.destination = destination;
        velocity = new Velocity(Constants.MAX_SPEED, direction);
        currentPosition = origin.copy();
        record = new VehicleRecord();
    }
    
    /* Update the car by passing one unit of time */
    public void tick(int time) {
        //Update car position
        currentPosition.updatePosition(velocity);
        
        //Save travel status in history
        record.addRecord(currentPosition, velocity, time);
    }
    
    /* Returns the current position for this Vehicle */
    public Position getPosition() {
        return currentPosition;
    }
}