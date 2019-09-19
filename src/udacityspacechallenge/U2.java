
package udacityspacechallenge;

/**
 *
 * @author Edmilson
 */
public class U2 extends Rocket{
    
    public U2(){
        rocketCost = 120;//Million
        initialRocketWeight = 18000; //kg
        cargoLimit = 29000; //kg
        cargoCarried = initialRocketWeight;
    }
    
    @Override
    public boolean launch(){
        launchExplosionChance = 0.25 * ((double)cargoCarried / (double)cargoLimit);//0.04
        if(Math.random() <= launchExplosionChance){
            System.out.print("Rocket exploded in launch, ");
            return false;
        }
        return true;
    }
    
    @Override
    public boolean land(){
        landingCrashChance = 0.25 * ((double)cargoCarried / (double)cargoLimit);//0.08
        if(Math.random() <= landingCrashChance){
            System.out.print("Rocket crashed in land, ");
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString(){
        return ("Rocket U2, cargoCarried = " + this.cargoCarried);
    }
    
}
