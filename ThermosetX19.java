package itec3030.assignments.a1.sensors.thermoset.ThermoSetX19;

import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Thermostat;

public class ThermosetX19 implements Thermostat {
	int number = 24;
	boolean status;
	String id;
	ControllerInterface c;
	
	public ThermosetX19(ControllerInterface c) {
		 //this.status = true;
		 FrontEnd f = new FrontEnd(this); 
	     f.pack(); 
	     f.setVisible(true);
	     
	}

	public int getReading() {
		return number;
	}

	public void disable() {
		this.status = false;
	}

	public void enable() {
		this.status = true;
	}

	public boolean enabled() {
		return this.status;
	}

	public ControllerInterface getController() {
		return this.c;
	}

	public String getID() {
		return id;
	}
	
	public void setController(ControllerInterface c2) {
		this.c = c2;
	}

	public void setID(String id2) {
		this.id = id2;
	}

	public void newTemperature(int newtemp) {
		this.number = newtemp;
	}

}
