package messageserviceproject;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ALARKIN1
 */
public class MessageOutputGUI implements MessageOutputStrategy {

    @Override
    public final void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
