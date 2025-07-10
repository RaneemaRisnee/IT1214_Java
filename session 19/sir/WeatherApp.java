//Build a Weather Monitoring System.

/*The System includes a central weather station that keeps track of temprature.
whenever the temprature changes, it should automatically notify all 
registered display devices.*/
//import java.util.List;
//import java.util.ArrayList;
import java.util.*;

interface Observer{
	public void update();
}

interface Subject{
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}

class DisplayDevice implements Observer{
	
	public void update(){
		System.out.println("Display Device: Got an Update");
	}
}

class WeatherStation implements Subject{
	
	List<Observer> devices = new ArrayList<>();
	
	public void addObserver(Observer o){
		devices.add(o);
	}
	
	public void removeObserver(Observer o){
		devices.remove(o);
	}
	
	public void notifyObservers(){
		for(Observer e:devices){
			e.update();
		}
	}
}

public class WeatherApp{
	public static void main(String[] args){
		DisplayDevice d1=new DisplayDevice();
		DisplayDevice d2=new DisplayDevice();
		d1.update();
		d2.update();
		
		WeatherStation ws1=new WeatherStation();
		ws1.addObserver(d1);
		ws1.notifyObservers();
		
		
		
	}
}

