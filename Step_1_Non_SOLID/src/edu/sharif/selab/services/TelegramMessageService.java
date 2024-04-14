package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService{
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        //Empty Body!
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        //Empty Body!
    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        if(validateId(telegramMessage.getSourceId()) && validateId(telegramMessage.getTargetId())){
            System.out.println("Sending a Telegram Message from " + telegramMessage.getSourceId() + " to " + telegramMessage.getTargetId() + " with content : " + telegramMessage.getContent());
        }else{
            throw new IllegalArgumentException("Id is Not Correct!");
        }
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
