
import java.util.HashMap;

/**
 * An intersection of up to 4 different roads.
 */
public class Intersection implements RoadConnector {
    /* Fields */
    private Road north;
    private Road south;
    private Road west;
    private Road east;
    private Position position;
    private final int id; //Unique identifier
    
    /* Constructor. Parameter id is used as a unique identifier. */
    public Intersection(int id, Position p) {
        this.id = id;
        position = p;
    }
    
    /* Returns the current position for this Intersection */
    public Position getPosition() {
        return position;
    }
    
    /* Returns the unique id for this Intersection */
    public int getID() {
        return id;
    }
    
    /* Equals function to compare with another RoadConnector */
    public boolean equals(RoadConnector other) {
        if (other.getID() == id) {
            return true;
        }
        return false;
    }
    
    /* Set the connections for this intersection */
    public void setConnections(HashMap<String, Road> connections) {
        String[] directions = new String[]{"north", "south", "west", "east"};
        if (connections.get("north") != null) {
            north = connections.get("north");
        }
        if (connections.get("south") != null) {
            south = connections.get("south");
        }
        if (connections.get("west") != null) {
            west = connections.get("west");
        }
        if (connections.get("east") != null) {
            east = connections.get("east");
        }
    }
    
    /* Fetches the current conenctions for this intersection */
    public HashMap<String, Road> getConnections() {
        HashMap<String, Road> connections = new HashMap<String, Road>();
        connections.put("north", north);
        connections.put("south", south);
        connections.put("west", west);
        connections.put("east", east);
        return connections;
    }
}