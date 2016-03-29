import java.util.ArrayList;
/**
 * Creates towers that contain integer values representing discs in the Tower of Hanoi puzzle.
 * 
 * @author Gary Carlson
 * @version V2
 */
public class Tower
{
    private int removedDisc;
    private int addedDiscSize;

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
        else if(toTower.getSize() < fromTower.getSize() && toTower.getSize() > 0){
            System.out.println("Invalid movement, disc on selected tower is smaller than disc being moved.");
            return false;
        }
        else{
            toTower.addMovedDisc(fromTower.removeDisc());
            return true;
        }
    }

    public int getSize(){
        if(tower.size() == 0){
            return 0;
        }

        else{
            return tower.get(tower.size() - 1);
        }
    }

    public int removeDisc(){
        removedDisc = this.getSize();
        if(tower.size() > 0){
            return removedDisc = tower.remove(0);
        }
        return removedDisc;
    }

    public int addMovedDisc( int removedDisc){
        tower.add(removedDisc);
        return removedDisc;
    }

    public int addDisc(){
        addedDiscSize = this.getSize() + 1;
        tower.add(addedDiscSize);
        return addedDiscSize;
    }
}
