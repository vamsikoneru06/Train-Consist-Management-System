package main;

package main;

/**
 * Author: vamsikoneru06
 */
public class usecase15 {

    public static void assign(String shape, String cargo){
        if(shape.equals("Rectangular") && cargo.equals("Petroleum")){
            throw new CargoSafetyException("Unsafe Cargo!");
        }
    }

    public static void main(String[] args){
        try{
            assign("Rectangular","Petroleum");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Operation Completed");
        }
    }
}