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
public class Laptop {
    
    private String color;
    private Keyboard keyboard;
    private Touchpad touchpad;
    
    public Laptop(String color){
        this.color = color;
        keyboard = new Keyboard();
        touchpad = new Touchpad();
    }
    public Laptop(String color, Keyboard keyboard, Touchpad touchpad){
        this.color = color;
        this.keyboard = keyboard;
        this.touchpad = touchpad;
        
    }        
    public String getColor(){
        return color; 
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String Switch(){
        return keyboard.LightUpKeyboard();
    }
    
    public String Warn(){
        return touchpad.cleanTouchpad();
    }
    
    
}
