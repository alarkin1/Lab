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

    private MessageOutputStrategy outputType;
    private MessageInputStrategy inputType;

    public MessageService(MessageOutputStrategy output, MessageInputStrategy input) {
        this.outputType = output;
        this.inputType = input;
    }

    public final MessageOutputStrategy getMessage() {
        return outputType;
    }

    public final void setMessage(MessageOutputStrategy message) {
        this.outputType = outputType;
    }

    public final void displayMessage() {
        outputType.outputMessage(inputType.inputMessage());
    }

    public final MessageInputStrategy getInputMessage() {
        return inputType;
    }

    public final void setInputMessage(MessageInputStrategy inputMessage) {
        this.inputType = inputMessage;
    }

}
