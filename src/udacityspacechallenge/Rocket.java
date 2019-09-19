
package udacityspacechallenge;

/**
 *
 * @author Edmilson
 */
public class Rocket implements SpaceShip{
    int rocketCost;
    int initialRocketWeight;
    int cargoLimit;
    int cargoCarried;
    double launchExplosionChance;
    double landingCrashChance;
    
    
    @Override
    public boolean launch(){
        return true;
    }
    
    @Override
    public boolean land(){
        return true;
    }
    
    @Override
    public boolean canCarry(Item item){
        return (this.cargoCarried + item.weight) <= this.cargoLimit;
    }
    
    @Override
    public void carry(Item item){
        this.cargoCarried += item.weight;
        //System.out.println("initialRocketWeight = " + this.initialRocketWeight + ",  cargoCarried = " + this.cargoCarried + ",  cargoLimit = " + this.cargoLimit);
    }
    
    
    
    
}
