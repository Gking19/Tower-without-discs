import java.util.ArrayList;
/**
 * Creates towers that contain integer values representing discs in the Tower of Hanoi puzzle.
 * 
 * @author Gary Carlson
 * @version V1
 */
public class Tower
{
    ArrayList<Integer> tower;
    public Tower(int Size){
        tower = new ArrayList<Integer>(Size);
        
    }

    public Tower(){
        this(3);
    }

    public boolean moveDisc(Tower fromTower, Tower toTower){
        if(fromTower == toTower){
            System.out.println("Invalid movement, cannot move disc to its own tower.");
            return false;
        }
        else if(toTower.getSize() < fromTower.getSize()){
            System.out.println("Invalid movement, disc on selected tower is smaller than disc being moved.");
            return false;
        }
        return false;

    }
    
    public int getSize(){
        if(tower.size() == 0){
            return 0;
        }
        
        else{
            return tower.get(0);
        }
    }
}
