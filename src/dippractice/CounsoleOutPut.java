/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author Corbin
 */
public class CounsoleOutPut implements OutputStrategy {
    @Override
    public void outputMsg(String msg){
        System.out.println(msg);
    }
}
