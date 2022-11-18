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
public class Keyboard {
    
    private String function; //Attribute
    
    public Keyboard(){          //Constructor
        function = "unknown"; 
    }
    public String getFunction(){
        return function;
    }
    
    public void setFunction(String function){ //Mutator
        this.function = function;
    }
    
    public String LightUpKeyboard(){
        return "Keyboard lighting on!";
    }
    public String TurnOffKeyboard(){
        return "Keyboard lighting off!";
    }
    
}
