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
public class GuiOutput implements OutputStrategy {
    @Override
    public void outputMsg(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
