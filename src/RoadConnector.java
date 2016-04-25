
/**
 * A RoadConnector specified an endpoint for a road.
 */
public interface RoadConnector {
    /* Equals function */
    public boolean equals(RoadConnector other);
    
    /* Returns the Position object where this RoadConnector is located */
    public Position getPosition();
    
    /* Returns the unique id for this RoadConnector */
    public int getID();
}