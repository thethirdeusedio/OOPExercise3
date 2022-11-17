/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPExercise3;

/**
 *
 * @author _thethirdeusedio
 */
public class ComputerShop {
    
    public static void main(String[] args){
        
        user User;
        LineNo Line1, Line2;
        
        User = new user();
        User.setName("Pablo Saturo");
        User.setAddress("Agas Avenue");
        
        Line1 = new LineNo();
        Line1.setOwner(User);
        Line1.Rented(2);
        
        Line2 = new LineNo();
        Line2.setOwner(User); //The same owner rented Line 0;
        Line2.Rented(2);
        
        System.out.print("Line 1 Info: ");
        System.out.println(Line1.toString() + ("\n"));
        
        System.out.print("line 2 Info: ");
        System.out.println(Line2.toString() + ("\n"));
                                    
    }
    
}
