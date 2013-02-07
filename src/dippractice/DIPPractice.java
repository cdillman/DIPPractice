/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author Corbin
 */
public class DIPPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OutputStrategy outStrategy = new GuiOutput();
        
        MessageService msgService = new MessageService();
        
        InputStrategy inStrat = new GuiInput();
        
       
        
        msgService.outputMsg(outStrategy, inStrat);
    }
}
