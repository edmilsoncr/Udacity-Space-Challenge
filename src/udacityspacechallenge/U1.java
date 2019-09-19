
package udacityspacechallenge;

/**
 *
 * @author Edmilson
 */
public class U1 extends Rocket{
    
    public U1(){
        rocketCost = 100;//Million
        initialRocketWeight = 10000; //kg
        cargoLimit = 18000; //kg
        cargoCarried = initialRocketWeight;
    }
    
    @Override
    public boolean launch(){
        launchExplosionChance = 0.25 * ((double)cargoCarried / (double)cargoLimit);//0.05
        if(Math.random() <= launchExplosionChance){//quer dizer que explodiu
            System.out.print("Rocket exploded in launch, ");
            return false;
        }
        return true;
    }
    
    @Override
    public boolean land(){
        landingCrashChance = 0.25 * ((double)cargoCarried / (double)cargoLimit);//0.01
        if(Math.random() <= landingCrashChance){
            System.out.print("Rocket crashed in land, ");
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return ("Rocket U1, cargoCarried = " + this.cargoCarried);
    }
    
}
