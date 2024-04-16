package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService{


    @Override
    public void sendMessage(Message obj) {
        TelegramMessage telegramMessage = TelegramMessage.class.cast(obj);
        if(validateId(telegramMessage.getSourceId()) && validateId(telegramMessage.getTargetId())){
            System.out.println("Sending a Telegram Message from " + telegramMessage.getSourceId() + " to " + telegramMessage.getTargetId() + " with content : " + telegramMessage.getContent());
        }else{
            throw new IllegalArgumentException("Id is Not Correct!");
        }
    }
    @Override
    public void handleMessage(Scanner scanner){
        String source;
        String target;
        String content;
        TelegramMessage telegramMessage = new TelegramMessage();
        System.out.print("Enter source id : ");
        source = scanner.next();
        telegramMessage.setSourceId(source);
        System.out.print("Enter target id : ");
        target = scanner.next();
        telegramMessage.setTargetId(target);
        System.out.println("Write Your Message : ");
        content = scanner.next();
        telegramMessage.setContent(content);
        sendMessage(telegramMessage);
    }
    public boolean validateId(String id) {
        // Regular expression pattern for validating id
        String idRegex = "^[a-zA-Z0-9_-](?!.*::)[^%+\\\\/#'\"]+$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(idRegex);

        // Check if the id string matches the regex pattern
        return pattern.matcher(id).matches();
    }
}
