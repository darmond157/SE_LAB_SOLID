package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

import java.util.Scanner;

public interface MessageService {
    public void sendMessage(Message obj);
    public void handleMessage(Scanner scanner);
    }
