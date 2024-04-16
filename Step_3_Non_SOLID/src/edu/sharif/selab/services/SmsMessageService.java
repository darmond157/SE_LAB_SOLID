package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

import java.util.Scanner;

public class SmsMessageService implements MessageService{
    @Override
    public void sendMessage(Message obj) {
        SmsMessage smsMessage = SmsMessage.class.cast(obj);
        if(validatePhoneNumber(smsMessage.getSourcePhoneNumber()) && validatePhoneNumber(smsMessage.getTargetPhoneNumber())){
            System.out.println("Sending a SMS from " + smsMessage.getSourcePhoneNumber() + " to " + smsMessage.getTargetPhoneNumber() + " with content : " + smsMessage.getContent());
        }else{
            throw new IllegalArgumentException("Phone Number is Not Correct!");
        }
    }

    @Override
    public void handleMessage(Scanner scanner){
        String source;
        String target;
        String content;
        SmsMessage smsMessage = new SmsMessage();
        System.out.print("Enter source phone : ");
        source = scanner.next();
        smsMessage.setSourcePhoneNumber(source);
        System.out.print("Enter target phone : ");
        target = scanner.next();
        smsMessage.setTargetPhoneNumber(target);
        System.out.println("Write Your Message : ");
        content = scanner.next(".*$");
        smsMessage.setContent(content);
        sendMessage(smsMessage);
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        // Check if the phone number is exactly 11 characters long
        if (phoneNumber.length() != 11) {
            return false; // Phone number length is not valid
        }

        // Check if the phone number contains only numeric digits
        for (char digit : phoneNumber.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false; // Phone number contains non-numeric characters
            }
        }

        // If all checks pass, return true (valid phone number)
        return true;
    }
}
