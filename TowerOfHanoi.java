
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class TowerOfHanoi {
    public static void move(int diskNo, char startTower, char finishTower){
        System.out.println("Moving diskno "+ diskNo + " from tower "+ startTower +" tower"+ finishTower);
    }
    public static void towerHanoi(int disk, char startTower, char finishTower, char extraTower){
        // base case
        /*
         * only one disk , so move it directly to the target disk
         */
        if(disk== 1){
            move(disk,startTower, finishTower);
        }
        else{
            // move the top n-1 disks to tower 3 (the temporary tower)
            towerHanoi(disk-1, startTower, extraTower, finishTower);
            // move the biggest disk from tower a to the final tower
            move(disk, startTower, finishTower);
            
            /// remove the n-1 tower placed on tower 3 on top of largest disk placed on tower b
            towerHanoi(disk-1,extraTower, finishTower,startTower);
        }
    }
    public static void main(String [] args){
        Scanner myscanner = new Scanner(System.in);
        int numdisks = myscanner.nextInt();
        towerHanoi(numdisks,'A','B','C');
    }
    
}
