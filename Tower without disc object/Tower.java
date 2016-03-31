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

    /**
     * Moves integer value between fromTower and toTower
     */
    public boolean moveDisc(Tower fromTower, Tower toTower){
        if(fromTower == toTower){
            System.out.println("Invalid movement, cannot move disc to its own tower.");
            return false;
        }
        else if(toTower.getDiscSize() < fromTower.getDiscSize() && toTower.getDiscSize() > 0){
            System.out.println("Invalid movement, disc on selected tower is smaller than disc being moved.");
            return false;
        }
        else{
            toTower.addMovedDisc(fromTower.removeDisc());
            return true;
        }
    }

    /**
     * Returns size of disc on top of tower
     */
    public int getDiscSize(){
        if(tower.size() == 0){
            return 0;
        }

        else{
            return tower.get(tower.size() - 1);
        }
    }

    public int removeDisc(){
        removedDisc = this.getDiscSize();
        if(tower.size() > 0){
            return removedDisc = tower.remove(0);
        }
        return removedDisc;
    }

    public int addMovedDisc( int removedDisc){
        tower.add(0 , removedDisc);
        return removedDisc;
    }

    /**
     * Creates discs represented as integers
     * Only used to create discs in the beginning
     */
    public int addDisc(){
        addedDiscSize = this.getDiscSize() + 1;
        tower.add(addedDiscSize);
        return addedDiscSize;
    }

    /**
     * All tX to tY methods are movements between specified towers
     * ex: t1tot2 is tower1 to tower2
     */
    public boolean t1tot2(){
        this.moveDisc(this, this);
        return true;
    }

    public boolean t1tot3(){

    }

    public boolean t2tot3(){

    }

    public boolean t3tot2(){

    }

    public boolean t2tot1(){

    }

    public boolean t3tot1(){

    }
}
