/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.and.chip;
import java.util.Scanner;
public class IdAndChip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            String str=in.next();
            if(str.charAt(0)=='B' || str.charAt(0)=='b')
            {
                System.out.println("Battleship");
            }
            else if(str.charAt(0)=='C' || str.charAt(0)=='c')
            {
                System.out.println("Cruiser");
            }
            else if(str.charAt(0)=='D' || str.charAt(0)=='d')
            {
                System.out.println("Destroyer");
            }
            else if(str.charAt(0)=='F' || str.charAt(0)=='f')
            {
               System.out.println("Frigate"); 
            }
            
        }
      t--;
    
    }
}
