import java.util.*;

/**
 * This class ask user to input as many robots as they want
 * Randomly assigns task to each robot
 * And at the end shows which task each robot completed and how long it took them
 * In each robot class I have assigned what tasks they can or cannot complete
 */
public class runRobots {
    public static void main(String[] args){
        Scanner myReader = new Scanner(System.in);

        //asking user for number of robots they want
        System.out.println("Type how many robots you want to create");
        int numRobots;
        try{
            numRobots= Integer.parseInt(myReader.nextLine());
        }
        catch(NumberFormatException e){
            System.out.println("You did not enter a number---we will asume you meant 0");
            numRobots = 0;
        }

        ArrayList<robot> allRobots = new ArrayList<>();
        int counter = 0;

        //in a while loop asking for type of each robot
        while(counter < numRobots){
            System.out.println("What type is robot " + (counter+1) + "?" );
            String robot = myReader.nextLine();
            switch(robot.toLowerCase()){
                case "unipedal":
                    allRobots.add(new unipedal());
                    break;
                case "bipedal":
                    allRobots.add(new bipedal());
                    break;
                case "quadrupedal":
                    allRobots.add(new quadrupedal());
                    break;
                case "arachnid":
                    allRobots.add(new arachnid());
                    break;
                case "radial":
                    allRobots.add(new radial());
                    break;
                case "aeronautical":
                    allRobots.add(new aeronautical());
                    break;
            }
            counter++;

        }


        ArrayList<String> results = new ArrayList<String>(); //contains all the resulting strings for each robot
        for(int i = 0; i < allRobots.size(); i++ ){
            robot tempRobot = allRobots.get(i);
            String res = "ROBOT NUMBER: " + (i+1) +  "\t" + tempRobot.name().toUpperCase() +"\n"; //contains resulting string for that robot
            long startTime = System.nanoTime(); //start time of tasks
            int completedTask = 0; //contains how many task robot has finished
            ArrayList<Integer> allTask = genRandomArray(); //contains random numbers (no duplicates) that are associated with a task

            for(int j = 0; j < 5; j++){

                int taskNum =allTask.get(j);
                switch(taskNum){
                    case 0:

                        if(tempRobot.sweepHouse()) {
                            res += "TASK " + (j+1) + ": DO DISHES \n";
                            completedTask++;
                        }
                        else
                            res+="TASK " + (j+1) + ": DO DISHES---COULD NOT BE COMPLETED \n";
                        break;

                    case 1:
                        if(tempRobot.sweepHouse()) {
                            res += "TASK " + (j + 1) + ": SWEEP HOUSE \n";
                            completedTask++;
                        }
                        else
                            res+="TASK " + (j+1) + ": SWEEP HOUSE---COULD NOT BE COMPLETED \n";
                        break;
                    case 2:
                        if(tempRobot.doLaudry()){
                            res += "TASK " + (j+1) + ": DO LAUNDRY \n";
                            completedTask++;
                        }
                        else{
                            res += "TASK " + (j+1) + ": DO LAUNDRY---COULD NOT BE COMPLETED \n";
                        }
                        break;
                    case 3:
                        if(tempRobot.recycle()){
                            res += "TASK " + (j+1) + ": RECYCLE \n";
                            completedTask++;
                        }
                        else{
                            res += "TASK " + (j+1) + ": RECYCLE---COULD NOT BE COMPLETED\n";
                        }
                        break;
                    case 4:
                        if(tempRobot.makeSammich()){
                            res += "TASK " + (j+1) + ": MAKE SAMMICH \n";
                            completedTask++;
                        }
                        else{
                            res += "TASK " + (j+1) + ": MAKE SAMMICH---COULD NOT BE COMPLETED \n";
                        }
                        break;
                    case 5:
                        if(tempRobot.mowLawn()){
                            res += "TASK " + (j+1) + ": MOW LAWN \n";
                            completedTask++;
                        }
                        else{
                            res += "TASK " + (j+1) + ": MOW LAWN---COULD NOT BE COMPLETED \n";
                        }
                        break;
                    case 6:
                        if(tempRobot.rakeLeaves()){
                            res += "TASK " + (j+1) + ": RAKE LEAVES \n";
                            completedTask++;
                        }
                        else{
                            res += "TASK " + (j+1) + ": RAKE LEAVES---COULD NOT BE COMPLETED \n";
                        }
                        break;
                    case 7:
                        if(tempRobot.giveDogBath()){
                            res += "TASK " + (j+1) + ": GIVE DOG BATH \n";
                            completedTask++;
                        }
                        else{
                            res += "TASK " + (j+1) + ": GIVE DOG BATH---COULD NOT BE COMPLETED \n";
                        }
                        break;
                    case 8:
                        if(tempRobot.makeCookie()){
                            res += "TASK " + (j+1) + ": MAKE COOKIES \n";
                            completedTask++;
                        }
                        else{
                            res += "TASK " + (j+1) + ": MAKE COOKIES---COULD NOT COMPLETE TASK \n";
                        }
                        break;
                    case 9:
                        if(tempRobot.washCar()){
                            res += "TASK" + (j+1) + ": WASH CAR \n";
                            completedTask++;
                        }
                        else{
                            res += "TASK" + (j+1) + ": WASH CAR---COULD NOT COMPLETE TASK \n";
                        }

                        break;

                }
            }

            long endTime = System.nanoTime(); //contains finish time
            long timeElapsed = (endTime - startTime)/1000000000; //finding total time and divinding it by 10^9 to make it in seconds
            res += "COMPLETED TASK: " + completedTask + "\n";
            res += "TOTAL TIME: " + timeElapsed + " SECONDS";
            results.add(res);
        }

        for(int i = 0; i < results.size(); i++){
            System.out.println(results.get(i));
            System.out.println("_______________________________");
        }

    }

    /*
    Returns an arraylist of 5 intergers (no diplicates) from 0 to 9
     */
    public static ArrayList<Integer> genRandomArray(){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            int val =(int) (Math.random()*10);
            while(arr.contains(val))
                val = (int) (Math.random()*10);
            arr.add(val);
        }
        return arr;
    }


}
