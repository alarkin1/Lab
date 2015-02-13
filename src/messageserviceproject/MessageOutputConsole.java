/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageserviceproject;

/**
 *
 * @author ALARKIN1
 */
public class MessageOutputConsole implements MessageOutputStrategy {

    @Override
    public final void outputMessage(String message) {
        System.out.println(message);
    }

}
