package OOPS.appliances;/*In a home, there are multiple appliances.
Each appliance consumes a certain amount of power when C"b,ESwitch onC"b,B.
eg: OOPS.appliances.Home can have FAN, OOPS.appliances.Light, OOPS.appliances.TV, OOPS.appliances.Laptop, etc. when "Switch on" they consume
FAN-1 unit, OOPS.appliances.Light - 2 units, OOPS.appliances.TV-3 units etc power. Create a method to calculate the
amount of power consumption at any given point (current load).
Sort the devices in an apartment by one of (any) the parameters.*/

import java.util.*;

public class Home extends TopClass {
	private int totalPower=0;
	public static ArrayList<Machine> arrayListOfEquipments = new ArrayList<>();

	public int switchOn(ArrayList<Machine> machine) {
		for(Machine j:machine) {
			totalPower=totalPower+j.getPowerConsumption();
		}
		return totalPower;
	}
	public static void main(String args[]) {
		TopClass home = new Home();
		Machine fan = new Fan(1);
		Machine light = new Light(2);
		Machine tv= new TV(3);
		arrayListOfEquipments.add(fan);
		arrayListOfEquipments.add(light);
		arrayListOfEquipments.add(tv);
		System.out.println("The Total Power consumption is "+ " "+home.switchOn(arrayListOfEquipments));

	}
}

class Fan extends Machine {
	private int totalPower;
	public Fan(int totalPower) {
		this.totalPower=totalPower;
	}

	public int getPowerConsumption() {
		return totalPower;
	}
}

class Light extends Machine {
	private int totalPower;
	public Light(int totalPower) {
		this.totalPower=totalPower;
	}

	public int getPowerConsumption() {
		return totalPower;
	}
}

class TV extends Machine {
	private int totalPower;
	public TV(int totalPower) {
		this.totalPower=totalPower;
	}

	public int getPowerConsumption() {
		return totalPower;
	}
}

class Laptop extends Machine {
	private int totalPower;
	public Laptop(int totalPower) {
		this.totalPower=totalPower;
	}

	public int getPowerConsumption() {
		return totalPower;
	}
}




