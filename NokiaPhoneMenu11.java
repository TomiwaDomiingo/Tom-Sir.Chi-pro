import java.util.Scanner;

public class NokiaPhoneMenu11 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int userinput = input.nextInt(); 

String menu = """
                1-> phoneBook
                2-> messages
                3-> chat
                4-> callRegister
                5-> tones
                6-> settings
                7-> callDivert
                8-> games
                9-> calculator
                10-> reminder
                11-> clock
                12-> profiles
                13-> simServices
                """;
System.out.println("Welcome to Nokia!");
System.out.print(menu)
if(userinput <= 0){
System.out.println("invalid number"); 
}


 int phoneBookChoice = input.nextInt(); 
        switch (phoneBookChoice) {
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos");  
                break;
            case 3:
                System.out.println("Add name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign tone");
                break;
            case 7:
                System.out.println("Send bcard"
                break;
            case 8:
                System.out.println("Options");
                break;
            case 9:
                System.out.println("Speed dials")         
                break;
            case 10:
                System.out.println("Voice tags");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 10.");
System.out.print(phoneBook);
}





int messages = input.nextInt();
switch (messages) {
            case 1:
                System.out.println("Write New Message");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture Messages");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smileys");
                break;
            case 7:
                System.out.println("Message Settings");
                break;
             case 8:
                System.out.println("Message Centre Number");
                break;
            case 9:
                System.out.println("Message Sent As");
                break;
            case 10:
                System.out.println("Message Validity");
                break;
            case 11:
                System.out.println("Common");
                break;
            case 12:
                System.out.println("Delivery");
                break;
            case 13:
                System.out.println("Reply via Same Centre");
                break;
            case 14:
                System.out.println("Character Support");
                break;
            case 15:
                System.out.println("Info Service");
                break;
            case 16:
                System.out.println("Voice Mailbox Number");
                break;
            case 17:
                System.out.println("Service Command Editor");
                break;
            default:
                System.out.println("Invalid click, please try again");
                break;
System.out.print(messages);
}





int chat = input.nextInt();
input.nextLine(); 

            switch (chat) {
            case 1:
                   System.out.println("Start a conversation!");
                
                break;
            default:
                   System.out.println("Invalid click. Please try again.");
                   break;

}


int callRegister = input.nextInt();
            switch (callRegister) {
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialed numbers");
                break;
            case 4:
                System.out.println("Erase recent call list");
                break;
            case 5:
                System.out.println("Show call duration");
                break;
             case 6:
                System.out.println("Last call duration: 00:00:00");
                break;
            case 7:
                System.out.println("All calls duration: 00:00:00");
                break;
            case 8:
                System.out.println("Received calls duration: 00:00:00");
                break;
            case 9:
                System.out.println("Dialed calls duration: 00:00:00");
                break;
            case 10:
                System.out.println("Clear timers");
                break;
            case 11:
                System.out.println("Show call costs");
                break;
            case 12:
                System.out.println("Last call cost: #0.00");
                break;
            case 13:
                System.out.println("All call cost: #0.00");
                break;
            case 14:
                System.out.println("Clear counters");
                break;
            case 15:
                System.out.println("Call cost settings");
                break;
            case 16:
                System.out.println("Call cost limit");
                break;
            case 17:
                System.out.println("Show cost in");
                break;
            case 18:
                System.out.println("Prepaid credit");
                break;
            default:
                System.out.println("Invalid choice, please try again");

}



int tones = input.nextInt();
System.out.println(tones);

switch (tones) {
              case 1: 
		System.out.println("Empty list");
		break;
              case 2: 
		System.out.println("\\\\\\\\\\\\\\\\\\\\");
		break;
              case 3: 
                System.out.println("Vibrate, Loud");
		break;
              case 4:
                System.out.println("Compose a tone");
		break;
              case 5: 
		 System.out.println("Sunrise, bubble, ding");
		break;
              case 6: 
		 System.out.println("Silent/loud");
		break;
              case 7: 
		System.out.println("Customize tones");
		break;
              case 8: 
		 System.out.println("SOS, heartbeat, siren");
		break;
              case 9: 
		 System.out.println("No screen savers available");
		break;
              default: System.out.println("invalid click. please try again");
		break;
}









int callSettings = input.nextInt();
System.out.println("Enter your choice");
switch (callSettings) {
              case 1:
                System.out.println("Automatic redial enabled/disabled");
                break;
            case 2:
                System.out.println("Set speed dial numbers");
                break;
            case 3:
                System.out.println("Call waiting options: enable/disable");
                break;
            case 4:
                System.out.println("Show/hide your number");
                break;
            case 5:
                System.out.println("Check phone line status");
                break;
            case 6:
                System.out.println("Automatic answer settings");
                break;
              default: System.out.println("invalid click. please try again");break;
}



            int phoneSettings = input.nextInt();
            switch (phoneSettings) {
            case 1:
                System.out.println("1. English, 2. Yoruba, 3. Hausa, 4. Igbo");
                break;
            case 2:
                System.out.println("Carrier name, cell ID");
                break;
            case 3:
                System.out.println("Default: Hello Nokia, Edit welcome note");
                break;
            case 4:
                System.out.println("Automatic, Manual");
                break;
            case 5:
                System.out.println("Torch, Backlight");
                break;
            case 6:
                System.out.println("Contact mobile carrier");
                break;
              
              default: System.out.println("invalid click.please try again");break;
}








int securitySettings = input.nextInt();
switch (securitySettings) {
                case 1:
                System.out.println("set up access code");
                break;
            case 2:
                System.out.println("select a number");
                break;
            case 3:
                System.out.println("null");
                break;
            case 4:
                System.out.println("null");
                break;
            case 5:
                System.out.println("set up phone security");
                break;
            case 6:
                System.out.println("reset access code");
                break;         
            default: System.out.println("invalid click.please try again");break;
}






int restoreFactorySettings = input.nextInt();
                  switch (restoreFactorySettings) {
                  case 1:
                  System.out.println("Resetting phone to default settings");
                  break;
                  default: System.out.println("invalid click.please try again");break;
}



int callDivert = input.nextInt();
                switch (callDivert) {
                case 1:
                System.out.println("Set up call diverting");
                break;
                default: System.out.println("invalid click.please try again");
		break;
}


int games = input.nextInt();
System.out.println("Select");
		switch (games) {
  		  case 1: System.out.println("----SNAKE----"); break;
   		  case 2: System.out.println("----SPACE IMPACT----"); break;
    		  case 3: System.out.println("----BUMPER----"); break;
                  default: System.out.println("invalid click.please try again");break;
}





int calculator = input.nextInt();
System.out.println("select");
		switch (calculator) {
                case 1:
                System.out.println("Select an operation (+, -, *, /):");
                String operation = input.next();
                break;
                default: System.out.println("invalid click.please try again");break;
}



int reminders = input.nextInt();
System.out.println("edit");

               switch (reminders) {
                case 1:
                System.out.println("NO REMINDERS");
                break;
                default: System.out.println("invalid click.please try again");break;
}




int clock = input.nextInt();
System.out.println("Edit");
		switch (clock) {
               case 1:
                System.out.println("Set alarm");
                break;
               case 2:
                System.out.println("Change settings");
                break;
               case 3:
                System.out.println("Stopwatch: 00:00:00"); //Improved for clarity
                break; // Added break statement
               case 4:
                System.out.println("Change Date settings");
                break;
               case 5:
                System.out.println("Set Timer");
                break;
               case 6:
                System.out.println("Network time, set up manually");
                break;
               default: System.out.println("invalid click.please try again");break;
}



int profiles = input.nextInt();
System.out.println("Enter a select");
System.out.print(profiles);
		
              switch (profiles) {
              case 1:
                System.out.println("Create new profile");
                break;
              default: System.out.println("invalid click.please try again");break;
}





int simServices = input.nextInt();
System.out.println("configure");

             switch (simServices) {
             case 1: 
             System.out.println("Enter old sim pin"); 
             break; // Added break statement
             default: System.out.println("invalid click.please try again");break;
}
}
}
