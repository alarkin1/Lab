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
public class MessageService {
    private MessageOutputStrategy message;
    private MessageInputStrategy inputMessage;

    public MessageService() {
    
    }
    public MessageService(MessageOutputStrategy s, MessageInputStrategy i){
        message = s;
        inputMessage = i;
    }
    
    public MessageOutputStrategy getMessage() {
        return message;
    }

    public void setMessage(MessageOutputStrategy message) {
        this.message = message;
    }
    
    public void displayMessage(){
        
        message.outputMessage(inputMessage.inputMessage());
    }

    public MessageInputStrategy getInputMessage() {
        return inputMessage;
    }

    public void setInputMessage(MessageInputStrategy inputMessage) {
        this.inputMessage = inputMessage;
    }
    
    
}
