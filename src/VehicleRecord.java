
import java.util.Stack;

/**
 * Holds the travel record for a vehicle.
 */
public class VehicleRecord {
    /* Inner class to represent a Record object */
    public class Record {
        //Inner Fields 
        public Position p;
        public Velocity v;
        public int time;
        
        //Inner Constructor
        public Record(Position p, Velocity v, int time) {
            this.p = p;
            this.v = v;
            this.time = time;
        }
    }
    
    /* Fields */
    public Stack<Record> records;
    
    /* Constructor */
    public VehicleRecord() {
        records = new Stack<Record>();
    }
    
    /* Adds a new record to the history */
    public void addRecord(Position p, Velocity v, int time) {
        records.push(new Record(p, v, time));
    }
    
    /* Returns a string representation of this VehicleRecord */
    public String getRecords() {
        String ret = "";
        while(!records.empty()) {
            Record r = records.pop();
            int[] pos = r.p.getCoordinates();
            int[] speed = r.v.getSpeedStatus();
            ret += "Time " + r.time + " was at: (" + pos[0] + ", " + pos[1] + ")"
                + " at speed: " + speed[0] + ", " 
                + Constants.findDirection(speed[1]) + "bound.\n";
        }
        return ret;
    }
}