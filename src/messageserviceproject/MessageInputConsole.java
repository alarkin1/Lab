/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageserviceproject;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class MessageInputConsole implements MessageInputStrategy{
    public final String inputMessage() {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a message!:  ");
        return keyboardInput.nextLine();
    }
}
