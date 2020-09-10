import java.lang.*;
/*
Arachnid can handle complex task but cannot do basic function under 5 seconds
 */
public class radial implements robot {
    public String name(){
        return "radial";
    }
    public boolean doDishes()
    {
//        try{
//            Thread.sleep(1000);
//        }
//        catch(InterruptedException e){
//
//        }
        return false;
    }
    public boolean sweepHouse(){
//        try{
//            Thread.sleep(3000);
//        }
//        catch(InterruptedException e){
//
//        }
        return false;
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
//        try{
//            Thread.sleep(4000);
//        }
//        catch(InterruptedException e){
//
//        }
        return false;
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
        try{
            Thread.sleep(20000);
        }
        catch(InterruptedException e){

        }
        return true;
    }
    public boolean rakeLeaves(){
        try{
            Thread.sleep(18000);
        }
        catch(InterruptedException e){

        }
        return true;
    }
    public boolean giveDogBath(){
        try{
            Thread.sleep(14500);
        }
        catch(InterruptedException e){

        }
        return true;
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
        try{
            Thread.sleep(20000);
        }
        catch(InterruptedException e){

        }
        return true;
    }
}
