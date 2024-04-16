import edu.sharif.selab.services.EmailMessageService;
import edu.sharif.selab.services.SmsMessageService;
import edu.sharif.selab.services.TelegramMessageService;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello and Welcome to SE Lab Messenger.");
        int userAnswer=0;
        do{
            System.out.println("In order to send Sms message enter 1");
            System.out.println("In order to send Email message enter 2");
            System.out.println("In order to send Telegram message enter 3");
            System.out.println("In order to Exit, Enter 0");

            userAnswer= scanner.nextInt();

            if(userAnswer==0){
                break;
            }

            switch (userAnswer){
                case 1:
                    (new SmsMessageService()).handleMessage(scanner);
                    break;
                case 2:
                    (new EmailMessageService()).handleMessage(scanner);
                    break;
                case 3:
                    (new TelegramMessageService()).handleMessage(scanner);
                    break;
            }
        }while (true);
    }
}