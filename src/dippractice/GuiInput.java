/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author Corbin
 */
public class GuiInput implements InputStrategy{

    @Override
    public String getInputMsg() {
       return JOptionPane.showInputDialog("Input message");
    }
    
}
