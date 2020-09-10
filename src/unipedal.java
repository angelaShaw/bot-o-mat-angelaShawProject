import java.lang.*;
/*
Unipedal robot can handle basic task that take less than 10 seconds
 */
public class unipedal implements robot {

    public String name(){
        return "unipedal";
    }

    public boolean doDishes()
    {
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){

        }
        return true;
    }
    public boolean sweepHouse(){
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){

        }
        return true;
    }
    public boolean doLaudry(){
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){

        }
        return true;
    }
    public boolean recycle(){
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){

        }
        return true;
    }
    public boolean makeSammich(){
        try{
            Thread.sleep(7000);
        }
        catch(InterruptedException e){

        }
        return true;
    }
    public boolean mowLawn(){
//        try{
//            Thread.sleep(20000);
//        }
//        catch(InterruptedException e){
//
//        }
        return false;
    }
    public boolean rakeLeaves(){
//        try{
//            Thread.sleep(18000);
//        }
//        catch(InterruptedException e){
//
//        }
        return false;
    }
    public boolean giveDogBath(){
//        try{
//            Thread.sleep(14500);
//        }
//        catch(InterruptedException e){
//
//        }
        return false;
    }
    public boolean makeCookie(){
        try{
            Thread.sleep(8000);
        }
        catch(InterruptedException e){

        }
        return true;
    }
    public boolean washCar(){
//        try{
//            Thread.sleep(20000);
//        }
//        catch(InterruptedException e){
//
//        }
        return false;
    }
}
