import java.lang.Math;
/**
 * Automates the tower of hanoi game.
 * 
 * @author Gary Carlson 
 * @version V2
 */
public class automation
{
    static long start;
    static long end;
    static long elapsedTime;
    public static void main(int numOfDiscs){
        start = System.nanoTime();
        Tower tower1 = new Tower();
        Tower tower2 = new Tower();
        Tower tower3 = new Tower();
        for(int i = 0; i < numOfDiscs; i++){
            tower1.addDisc();
        }
        tower1.moveDisc(tower1 , tower3);
        tower1.moveDisc(tower1 , tower2);
        tower3.moveDisc(tower3 , tower2);
        tower1.moveDisc(tower1 , tower3);
        tower2.moveDisc(tower2 , tower1);
        tower2.moveDisc(tower2 , tower3);
        tower1.moveDisc(tower1 , tower3);
        end = System.nanoTime();
        elapsedTime = end - start;
        System.out.println(elapsedTime);

    }

   /* public boolean solvePuzzle(int numOfDiscs){
        Tower tower1 = new Tower();
        Tower tower2 = new Tower();
        Tower tower3 = new Tower();
        for(int i = 0; i < numOfDiscs; i++){
            tower1.addDisc();
        }
        
        if(tower3.getSize() = numOfDiscs){
            return true;
        }
        return true;
    }
    */
}
