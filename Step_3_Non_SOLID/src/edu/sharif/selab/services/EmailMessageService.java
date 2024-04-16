package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailMessageService implements MessageService{

    @Override
    public void sendMessage(Message obj) {
        EmailMessage emailMessage = EmailMessage.class.cast(obj);
        if(validateEmailAddress(emailMessage.getSourceEmailAddress()) && validateEmailAddress(emailMessage.getTargetEmailAddress())){
            System.out.println("Sending a Email from " + emailMessage.getSourceEmailAddress() + " to " + emailMessage.getTargetEmailAddress() + " with content : " + emailMessage.getContent());
        }else{
            throw new IllegalArgumentException("Email Address is Not Correct!");
        }
    }
    @Override
    public void handleMessage(Scanner scanner){
        String source;
        String target;
        String content;
        EmailMessage emailMessage = new EmailMessage();
        System.out.print("Enter source Email : ");
        source = scanner.next();
        emailMessage.setSourceEmailAddress(source);
        System.out.print("Enter target Email : ");
        target = scanner.next();
        emailMessage.setTargetEmailAddress(target);
        System.out.println("Write Your Message : ");
        content = scanner.next();
        emailMessage.setContent(content);
        sendMessage(emailMessage);
    }

    public boolean validateEmailAddress(String email) {
        // Regular expression pattern for validating email addresses
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(emailRegex);

        // Check if the email string matches the regex pattern
        return pattern.matcher(email).matches();
    }
}
