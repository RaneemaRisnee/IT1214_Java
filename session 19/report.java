/*
Build a Weather Monitoring System

The system includes a central weather station that keeps track of temprature.
whenever the temprature changes, it should automatically notify all registered display devices.

*/
import java.util.*;

class Report{
	String originator;
	String alertType;
	boolean isEmergency;
	byte temperature;
	
}

interface Observer{
	public void update(Report s);
		
}

interface Subject{
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
		
}

class DisplayDevice implements Observer{
	String name;
	DisplayDevice(String name){
		this.name= name;
	}
	
	//@override
	public void update(String m){
		System.out.println("Display Device: Got an update message \n"+m);
	}
}

class WeatherStation implements Subject{
	String name;
	int temp =30;
	
	Report r;
	
	WeatherStation(String name){
		this.name = name;
	}
	
	List <Observer> devices = new ArrayList <>(); 
	// import util pack for List and ArrayList

	//@override
	public void addObserver(Observer o){
		devices.add(o);
	}
	public void removeObserver(Observer o){
		devices.remove(o);
	}
	public void notifyObserver(){
		String message ="From "+name+": Temperature is "+temp+" Degree Celcius";

		for(Observer e: devices){
			e.update(r);
			
		}
	}
}

public class WeatherApp{
	public static void main(String [] Args){
		Observer d1 = new DisplayDevice("Nokia");
		DisplayDevice  d2 = new DisplayDevice("Sony");
		 d1.update("Test 1");
		 d2.update("Test 2");
		 
		WeatherStation ws1 = new WeatherStation("Vavuniya"); 
		ws1.addObserver(d1);
		ws1.addObserver(d2);
		ws1.notifyObserver();
		
		 
		WeatherStation ws2 = new WeatherStation("Colombo"); 
		//ws2.addObserver(d1);
		ws2.addObserver(d2);
		ws2.notifyObserver();
		
		
	}
}