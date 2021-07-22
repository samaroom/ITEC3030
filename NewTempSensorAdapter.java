package itec3030.assignments.a2;



import newtemp.NewTempSensor.NewTempSensorDriver;
import newtemp.NewTempSensor.Observer;

public class NewTempSensorAdapter implements Observer, AbstractNewTempSensorAdapter  {
	NewTempSensorDriver d = new NewTempSensorDriver();
	protected int temp;
	String id;
	

	
	public NewTempSensorDriver getAdatptee() {
		
		return d;
	}

	public void setID(String o) {
		id = o;
		
	}
	public void newTemperature(int newTemp) {
		d.notifyObservers(newTemp);
		System.out.println("Sensor ("+ id +") receiving new temperature "  + getReading());
	}

	public  int getReading() {
		return temp;
	}

	@Override
	public void update(int newTemp) {
		this.temp = newTemp;
	}


	}

