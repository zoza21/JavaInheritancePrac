public class Swimming extends Cardio {

    //Child class, Running inherits from Cardio
    //instance variables
    private String stroke, speed; 
    private int distance;

    //constructor
    Swimming(String name, int days, String sp, String st, int dist)
    {
        super(name, days);
        speed = sp;
        stroke = st;
        distance = dist;
    }

    //getter and setter methods
    public void setSpeed(String sp)
    {
        speed = sp;
    }

    public String getSpeed()
    {
        System.out.println("Speed of swim: " + speed);
        return speed;
    }

    public void setStroke(String str)
    {
        stroke = str;
    }

    public String getStroke()
    {
        System.out.println("Name of stroke: " + stroke);
        return stroke;
    }

    public void setDistance(int dist)
    {
        distance = dist;
    }

    public int getDistance()
    {
        System.out.println("Distance of run: " + distance);
        return distance;
    }

    //To string method to print swimming exercise information 
    @Override
    public String toString()
    {
        return (super.toString() + ", Speed: " + speed + ", Stroke: " + stroke + " , Distance: " + distance + "m.");
    }
}
