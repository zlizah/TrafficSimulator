
/**
 * A road between RoadConenctors.
 */
public class Road {
    /* Fields */
    private RoadConnector left;
    private RoadConnector right;
    private VehicleQueue leftbound;
    private VehicleQueue rightbound;
    
    /* Constructor */
    public Road() {
        leftbound = new VehicleQueue();
        rightbound = new VehicleQueue();
        left = null;
        right = null;
    }
    
    /* Fetches the queue of vehicles heading for the given rc from this road. */
    public VehicleQueue getCarQueue(RoadConnector rc) {
        if (rc == null) {
            throw new IllegalArgumentException("Parameter was null in "
                + "getCarQueue of Road.java");
        }
        if (rc.equals(left)) {
            return leftbound;
        }
        if (rc.equals(right)) {
            return rightbound;
        }
        return null;
    }
    
    /* Add a vehicle */
    public void addVehicle(RoadConnector rc, Vehicle v) {
        if (rc.equals(left)) {
            rightbound.add(v);
        } else if (rc.equals(right)) {
            leftbound.add(v);
        } else {
            throw new IllegalArgumentException("Invalid RoadConnector in "
                + "addVehicle of Road.java.");
        }
    }
    
    /* Set the connections for this road */
    public void setConnections(RoadConnector[] connections) {
        if (connections[0] != null && connections[1] != null) {
            left = connections[0];
            right = connections[1];
        } else {
            throw new IllegalArgumentException("Connections were null in "
                + "setConnections of Road.java");
        }
    }
}