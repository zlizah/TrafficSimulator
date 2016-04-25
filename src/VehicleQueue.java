
import java.util.TreeSet;
import java.util.ArrayList;

/**
 * Stores a queue of vehicles travelling on a road.
 */
public class VehicleQueue {
    /* Fields */
    public ArrayList<Vehicle> queue;
    
    /* Constructor */
    public VehicleQueue() {
        queue = new ArrayList<Vehicle>();
    }
    
    /* Adds the given vehicle to the queue */
    public void add(Vehicle v) {
        queue.add(v);
    }
    
    /**
     * Returns an ordered representations of the vehicles in this queue based 
     * on how close they are to the given parameter. 
     */
    public TreeSet<Vehicle> getOrderedQueue(Position p) {
        //TODO
        return null;
    }
}