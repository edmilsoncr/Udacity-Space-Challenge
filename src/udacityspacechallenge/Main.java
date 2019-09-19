
package udacityspacechallenge;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Edmilson
 */
public class Main {
    public static void main(String [] args) throws FileNotFoundException{
        
        Simulation simulation = new Simulation();
        
        ArrayList<Item> phase1ItemList = simulation.loadItems("phase-1.txt");
//        System.out.println(phase1ItemList);
        
        ArrayList<Item> phase2ItemList = simulation.loadItems("phase-2.txt");
//        System.out.println(phase2ItemList);
        
        //Phase 1 and 2 using Rocket U1
        System.out.println("TESTS USING U1 ROCKETS");
        ArrayList<Rocket> u1FleetForPhase1 = simulation.loadU1(phase1ItemList);
        ArrayList<Rocket> u1FleetForPhase2 = simulation.loadU1(phase2ItemList);
        
        System.out.println("Start of the Phase 1 tests:");
        double u1Phase1Budget = simulation.runSimulation(u1FleetForPhase1);
        System.out.println("\nStart of the Phase 2 tests:");
        double u1Phase2Budget = simulation.runSimulation(u1FleetForPhase2);
        System.out.println("\nTotal Budget using U1 Rockets Fleet:\nPhase 1 = $" + u1Phase1Budget + " Million\nPhase 2 = $" + u1Phase2Budget + " Million");
        
        
        //Phase 1 and 2 using Rocket U2
        System.out.println("\n\nTESTS USING U2 ROCKETS");
        ArrayList<Rocket> u2FleetForPhase1 = simulation.loadU2(phase1ItemList);
        ArrayList<Rocket> u2FleetForPhase2 = simulation.loadU2(phase2ItemList);
        
        System.out.println("Start of the Phase 1 tests:");
        double u2Phase1Budget = simulation.runSimulation(u2FleetForPhase1);
        System.out.println("\nStart of the Phase 2 tests:");
        double u2Phase2Budget = simulation.runSimulation(u2FleetForPhase2);
        System.out.println("\nTotal Budget using U2 Rockets Fleet:\nPhase 1 = $" + u2Phase1Budget + " Million\nPhase 2 = $" + u2Phase2Budget + " Million");
        
    }
}
