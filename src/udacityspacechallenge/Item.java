
package udacityspacechallenge;

/**
 *
 * @author Edmilson
 */
public class Item {       //represent an item to be carried by the rockets
    String name;
    int weight;
    
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return ("name = " + this.name + ", weight = "+ this.weight + "\n");
    }
}
