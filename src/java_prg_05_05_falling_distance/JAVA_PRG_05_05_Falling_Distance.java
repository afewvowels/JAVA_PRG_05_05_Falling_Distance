/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_05_05_falling_distance;

/**
 *
 * @author bluebackdev
 * When an object is falling because of gravity, the following formula can be
 * used to determine the distance the object falls in a specific time period:
 * 
 *      d = 1/2 * gt^2
 * 
 * The variables in the formula are as follows: d is the distance in meters,
 * g is 9.8, and t is the amount of time, in seconds, that the object has been
 * falling.
 * 
 * Write a method named fallingDistance that accepts an object's falling time
 * (in seconds) as an argument. The method should return the distance, in
 * meters, that the object has fallen during that time interval. Demonstrate
 * the method by calling it in a loop that passes the values 1 through 10 as
 * arguments, and displays the return value.
 */
public class JAVA_PRG_05_05_Falling_Distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int intTime;
        
        final int INT_TIME = 10;
        
        double dblDistance;
        
        for (int i = 0 ; i < INT_TIME ; i++)
        {
            intTime = (i + 1);
            
            dblDistance = calculateDistance(intTime);
            
            displayResult(intTime, dblDistance);
        }
    }
    
    public static double calculateDistance(int intTime)
    {
        double dblDistance;
        
        final double DBL_GRAVITY = 9.8;
        
        dblDistance = 0.5 * DBL_GRAVITY * (intTime * intTime);
        
        return dblDistance;
    }
    
    public static void displayResult(int intTime, double dblDistance)
    {
        System.out.println("At " + intTime + " seconds, the object has " +
                "traveled " + dblDistance + " units.");
    }
}
