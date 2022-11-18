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
public class Touchpad {
    
    private String inventor;
    
    public Touchpad(){
        inventor = "unkown";
    }
    public String getInventor(){
        return inventor;
    }
    public void setInventor(String inventor){
        this.inventor = inventor;
    }
    public String cleanTouchpad(){
        return "Touch pad is clean!";
    }
    public String DirtyTouchpad(){
        return "Touch pad is dirty!";
    }
}
