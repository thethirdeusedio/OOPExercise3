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
public class LineNo {
    
    //Student owner of the lineNo
    private user owner;
    
    //  Number of Line rented
    private int LineBorrowCnt;
    
    //Constructor
    public LineNo(){
        owner = null;
        LineBorrowCnt = 0;
    }
    
    //Number of Line rented
    public void Rented(int NumberOfLine ){
        LineBorrowCnt = LineBorrowCnt + NumberOfLine;
    }
    
    //Total number of line rented by the user
    public int getNumberOfline(){
        return LineBorrowCnt;
    }
    
    //Returns the name of the owner of the LineNo
    public String getOwnerName(){
        return owner.getName();
    }
    
    //set owner of this Line number to the user
    public void setOwner(user User){
        owner = User;
    }
    
    //Return the string representation of this Line
    @Override
    public String toString(){
        return "Owner Name: " + owner.getName() + "\n"
                + "Address: " + owner.getAddress() + "\n"
                + "Number of Line rented: " + LineBorrowCnt;
    }  
    
}
