/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author Corbin
 */
public class MessageService {
    
//    private void inputMsg(InputStrategy in){
//        
//    }
    
    public void outputMsg(OutputStrategy out, InputStrategy in) {
        String msg = in.getInputMsg();
        out.outputMsg(msg);
    }
    
}
