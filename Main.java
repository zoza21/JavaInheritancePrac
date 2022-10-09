//Main class to test class inheritance and methods 
class Main {
    public static void main(String[] args) {
        Running sprints = new Running("Running", 7, "Sprint", 30);
        System.out.println(sprints.toString());
        sprints.increaseDays(1); 

        Running middleDistance = new Running("Running", 2, "Slow", 1.5);
        System.out.println(middleDistance.toString());
        middleDistance.reduceDays(3); 

        Swimming freestyle = new Swimming("Swimming", 2, "Slow", "Freestyle", 400);
        System.out.println(freestyle.toString());

        Cardio cycling = new Cardio("Cycling", 1);
        System.out.println(cycling.toString());
    }
}
