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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MessageService service = new MessageService(new MessageOutputGUI(), new MessageInputConsole());

        service.displayMessage();

        service.setMessage(new MessageOutputConsole());
        service.displayMessage();
//        

    }

}
