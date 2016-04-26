
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Comparator;

/**
 * Stores a queue of vehicles travelling on a road.
 */
public class VehicleQueue {
    /* Inner class */
    public class VehicleComparator implements Comparator<Vehicle> {
        /* Fields */
        private Position p;
        
        /* Constructor */
        public VehicleComparator(Position p) {
            if (p == null) {
                throw new IllegalArgumentException("Position was null in "
                    + "VehicleComperator's constructor.");
            }
            this.p = p;
        }
        
        /* Compares the given vehicle and orders them by how close they are to 
         * this VehicleComperators position
         */
        public int compare(Vehicle v1, Vehicle v2) {
            double dist1 = p.distanceTo(v1.getPosition());
            double dist2 = p.distanceTo(v2.getPosition());
            if (dist1 < dist2) {
                return -1;
            } else if (dist2 > dist1) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    
    /* Fields */
    public LinkedList<Vehicle> queue;
    
    /* Constructor */
    public VehicleQueue() {
        queue = new LinkedList<Vehicle>();
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
        VehicleComparator comp = new VehicleComparator(p);
        TreeSet<Vehicle> orderedSet = new TreeSet<Vehicle>(comp);
        orderedSet.addAll(queue);
        return orderedSet;
    }
}