public class Cardio {
    
    //Cardio instance variables: Name of exercise, Number of training days
    private String exerciseName;
    private int trainingDays;

    //Constructor
    public Cardio(String name, int days)
    {
        exerciseName = name;
        trainingDays = days;
    }

    //Getter and setter methods
    public void setName(String name)
    {
        exerciseName = name;
    }

    public String getName()
    {
        return exerciseName;
    }

    public void setDays(int days)
    {
        trainingDays = days;
    }

    public int getDays()
    {
        return trainingDays;
    }

    //Method to increase number of training days.
    public void increaseDays(int extraDays)
    {
        if(trainingDays == 7)
        {
            System.out.println("Error: Cannot increase training days. Already set to 7 days a week.");
        }
        else if(trainingDays + extraDays >=7)
        {
            System.out.println("Error: Increasing days by " + extraDays + " exceeds 7 day limit.");
        }
        else 
        {
            trainingDays += extraDays;
            System.out.println(trainingDays);
        }
    }

    //Method to decrease number of training days 
    public void reduceDays(int reduceDays)
    {
       if(trainingDays == 0)
       {
        System.out.println("Error: There are currently 0 training days. Cannot reduce days.");
       }
       else if(trainingDays - reduceDays <=0)
       {
        System.out.println("Error: Decreasing days by " + reduceDays + " reduces days to less than 0. Cannot reduce days.");
       }
       else 
       {
        trainingDays -= reduceDays;
        System.out.println(trainingDays);
       }
    }

    //To string method to print cardio exercise information 
    public String toString()
    {
        return ("Cardio Exercise: " + exerciseName + ", Training Days: " + trainingDays + "days");
    }
    

}
