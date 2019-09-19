
package udacityspacechallenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Edmilson
 */
public class Simulation {
    
    public ArrayList<Item> loadItems(String fileName) throws FileNotFoundException{
        ArrayList<Item> itemList = new ArrayList<>();
        
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] itemAtributes = line.split("=");
            Item item = new Item(itemAtributes[0], Integer.parseInt(itemAtributes[1]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<Rocket> loadU1(ArrayList<Item> itemList) throws FileNotFoundException{
        
        int loadedItemsQtity = 0;
        ArrayList<Rocket> listOfU1Rockets = new ArrayList<>();
        
        while(loadedItemsQtity < itemList.size() ){
            U1 u1Rocket = new U1();
            
            while (loadedItemsQtity < itemList.size() && u1Rocket.canCarry(itemList.get(loadedItemsQtity))){
                u1Rocket.carry(itemList.get(loadedItemsQtity));
                loadedItemsQtity++;
            }
            listOfU1Rockets.add(u1Rocket);
//            System.out.print(listOfU1Rockets.size() + "º Rocket:  ");
//            System.out.println(u1Rocket);
        }
        return listOfU1Rockets;
    }
    
    public ArrayList<Rocket> loadU2(ArrayList<Item> itemList) throws FileNotFoundException{
        
        int loadedItemsQtity = 0;
        ArrayList<Rocket> listOfU2Rockets = new ArrayList<>();
        
        while(loadedItemsQtity < itemList.size() ){
            U2 u2Rocket = new U2();
            
            while (loadedItemsQtity < itemList.size() && u2Rocket.canCarry(itemList.get(loadedItemsQtity))){
                u2Rocket.carry(itemList.get(loadedItemsQtity));
                loadedItemsQtity++;
//                System.out.println("Quantity of loaded items = " + loadedItemsQtity);
            }
            listOfU2Rockets.add(u2Rocket);
//            System.out.print(listOfU2Rockets.size() + "º Rocket:  ");
//            System.out.println(u2Rocket);
        }
        return listOfU2Rockets;
    }
    
    public double runSimulation(ArrayList<Rocket> rocketsList){
        int budget = 0;
        for (Rocket rocket : rocketsList) {
            while(!rocket.launch() || !rocket.land()){
                budget += rocket.rocketCost;
                System.out.println("Total Budget: $" + budget + "Million");
            }
            budget += rocket.rocketCost;
            System.out.println("Rocket launched and landed successfully, total budget: $" + budget + " Million");
        }
        
        return budget;
    }
    
    
}
