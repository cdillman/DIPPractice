/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;
import java.util.Scanner;
/**
 *
 * @author Corbin
 */
public class KeyboardInput implements InputStrategy{
      
    Scanner keyboard = new Scanner(System.in);
        
    @Override
    public String getInputMsg() {
        return keyboard.nextLine();
        
    }
    
}
