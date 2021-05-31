/*
 *  Template Developed by Sotirios Liaskos for the needs of
 *   ITEC3030 Systems Architecture.
 *  @ All Rights Reserved
 */
package itec3030.assignments.a1;
import java.util.ArrayList;

import itec3030.smarthome.standards._________________;
import itec3030.smarthome.standards._________________;

/**
 * A Room object for maintaining room information.
 * @author Sotirios
 */
public class Room {
    private String name = "default";
    private ArrayList<_________________> tempSensors = new ArrayList<>();
    
    /**
     * The name of the Room (e.g. Living Room)
     * @return The name of the room
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the Room (e.g. Living Room)
     * @param name The name of the room.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
    //
    // ROOM SETUP
    //

    /**
     * Use this function to "add" a temperature sensor to the room.
     * @param t Reference to an object that implements TemperatureSensor.
     */
    public void install(_________________ t){
        tempSensors.add(t);
    }
   
    // 
    // OFFER ROOM INFORMATION
    //

    /**
     * Returns the average temperature readings of the sensors installed in the room.
     * @return The average temperature of the room according to the sensors installed in it.
     */
    
    public float getAvergeTemperature(){
        float count = 0;
        float sum = 0;
        for (_________________ s : tempSensors){
            sum += s.getReading();
            count++;
        }
        return(float) (sum/count);
    }
    
    /**
     * Returns true if an object implementing a SmartThing interface is found in the room. 
     * @param s Reference to an objects that implements SmartThing.
     * @return True if the Thing is installed in the room. Currently checks only the collection of temperature sensors.
     */
    public boolean hasThing(_________________ s) {
        boolean found = false;
        for (_________________ t :  tempSensors) {
            if (t.equals(s)) found = true;
        }
        // Collection of other types can be added here.
        return (found);
    }    
}