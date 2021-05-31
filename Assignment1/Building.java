/*
 *  Template Developed by Sotirios Liaskos for the needs of
 *   ITEC3030 Systems Architecture.
 *  @ All Rights Reserved
 */
package itec3030.assignments.a1;

import itec3030.smarthome.standards.NumericMeasurementInstrument;
import itec3030.smarthome.standards.OnOffAble;
import itec3030.smarthome.standards.SmartThing;
import java.util.ArrayList;

/**
 * A Room object for maintaining information about the entire building.
 * @author Sotirios
 */
public class Building {
    private ArrayList<Room> rooms = new ArrayList<Room>();
    private _________________ furnace = null;
    private NumericMeasurementInstrument thermostat = null;

    /**
     * Returns the temperature desired by the inhabitants of the building. 
     * @return The desired temperature.
     */
    public int getDesiredTemperature() {
        return thermostat._________________();
    }

    /**
     * Returns a reference to the furnace installed in the building. 
     * @return A reference to the furnace installed in the building. 
     */
    public _________________ getFurnace() {
        return furnace;
    }
    
    /**
     * "Installs" a furnace in the building. 
     * @param frn A reference to the furnace to be installed in the building. 
     */
    public void setFurnace(_________________ frn){
        furnace = frn;
    }
     
    /**
     * Returns a reference to the thermostat installed in the building. 
     * @return A reference to the thermostat installed in the building. 
     */
    public NumericMeasurementInstrument getThermostat() {
        return thermostat;
    }
    
    
    /**
     * "Installs" the thermostat in the building
     * @param sth Reference to a things that performs numeric measurements.
     */
    public void setThermostat(NumericMeasurementInstrument sth){
        this.thermostat = sth;
    }
    
    
    /**
     * Returns the average temperature in all rooms of the building.
     * @return Average temperature over all rooms of the building.
     */
    public float getAvergeTemperature(){
        float count = 0, sum = 0;
        for (Room r : rooms){
            sum += r.getAvergeTemperature();
            count++;
        }
        return(float) (sum/count);
    }
    
    /**
     * Locates and returns the room in which a SmartThing is installed.
     * @param s Reference to a SmartThing.
     * @return Reference to the Room in which the SmartThing is installed.
     */
    public Room findRoomOf(_________________ s){
        Room found = null;
        for (Room r : rooms){
            if (r.hasThing((_________________) s)) 
                found = r;
        }
        return(found);
    }
    
    //
    // Install Constituent Rooms
    //

    /**
     * Add a room to the building.
     * @param room Reference to a Room Object.
     */   
    public void add(Room room){
        rooms.add(room);
    }
}