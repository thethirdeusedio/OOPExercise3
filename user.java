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
public class user {
    
    private String name;
    private String address;
    
    public user(){
        name = "unassigned";
        address = "unassigned"; 
    }
    public String getAddress(){
        return address;
    }
    public String getName(){
        return name;
    }
    
    public void setAddress(String place){
        address = place;
    }
    public void setName(String userName){
        name = userName;
    }
    
      
}
