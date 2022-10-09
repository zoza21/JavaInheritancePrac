public class Running extends Cardio {

    //Child class, Running inherits from Cardio
    //instance variables
    private String speed;
    private double distance;
    
    //Constructor
    Running(String name, int days, String sp, double dist)
    {
        super(name, days);
        speed = sp;
        distance = dist;
    }

    //Get and set methods
    public void setSpeed(String sp)
    {
        speed = sp;
    }

    public String getSpeed()
    {
        System.out.println("Speed of run: " + speed);
        return speed;
    }

    public void setDistance(int dist)
    {
        distance = dist;
    }

    public double getDistance()
    {
        System.out.println("Distance of run: " + distance);
        return distance;
    }

    //Method to determine units metres or kilometres based on run speed 
    public String determineUnits()
    {
        if(speed.equalsIgnoreCase("sprint"))
        {
            return "metres";
        }
        else
        {
            return "kilometres";
        }

    }

    //To string method to print running exercise information 
    @Override
    public String toString()
    {
        return (super.toString() + ", Speed: " + speed + ", Distance: " + distance + " " + determineUnits() + ".");
    }
}
