package oops.appliances;

import lombok.Data;
import lombok.Getter;

/* In a home, there are multiple appliances.
Each appliance consumes a certain amount of power
when C"b,ESwitch onC"b,B.
eg: OOPS.appliances.Home can have FAN, OOPS.appliances.Light, OOPS.appliances.TV,
OOPS.appliances.Laptop, etc. when "Switch on" they consume
FAN-1 unit, OOPS.appliances.Light -
2 units, OOPS.appliances.TV-3 units etc power.
Create a method to calculate the
amount of power consumption at any given point (current load).
Sort the devices in an apartment by one of (any) the parameters. */
@Data
class Demo {
    private int totalPower;
}




