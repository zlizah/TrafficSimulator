
import java.util.HashMap;

/**
 * An endpoint of the RoadNetwork.
 */
public class CityEndpoint implements RoadConnector {
    /* Fields */
    private Road north;
    private Road south;
    private Road west;
    private Road east;
    private Position position;
    private final int id; //Unique identifier
    
    /* Constructor */
    public CityEndpoint(int id, Position p) {
        this.id = id;
        position = p;
    }
    
    /* Returns the current position for this CityEndpoint */
    public Position getPosition() {
        return position;
    }
    
    /* Returns the unique id for this CityEndpoint */
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
    
    /* Set the connections for this CityEndpoint */
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
    
    /* Fetches the current conenctions for this CityEndpoint */
    public HashMap<String, Road> getConnections() {
        HashMap<String, Road> connections = new HashMap<String, Road>();
        connections.put("north", north);
        connections.put("south", south);
        connections.put("west", west);
        connections.put("east", east);
        return connections;
    }
}