/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageserviceproject;

import javax.swing.JOptionPane;

/**
 *
 * @author ALARKIN1
 */
public class GuiInputStrategy implements MessageInputStrategy{
    
    public String inputMessage(){
    return JOptionPane.showInputDialog(null, "Enter a message: ");
}
}
