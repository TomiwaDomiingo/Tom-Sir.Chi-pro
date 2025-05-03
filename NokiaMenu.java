import java.util.Scanner;

public class NokiaMenu {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int userinput = input.nextInt(); 
int menuChoice;
int phoneBookChoice;
int messagesChoice;
int chatChoice;
int callRegisterChoice;
int tonesChoice;
int settingsChoice;
int callDivertChoice
int gamesChoice;
int calculatorChoice;
int remindersChoice;
int clockChoice;
int profilesChoice;
int simServicesChoice;




String menu = """
            WELCOME UZER   
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
menuChoice = input.nextInt();
System.out.print(menu);




String phoneBook = """
Select an Option
1-> Search
2-> Service Nos
3-> Add name
4-> Erase
5-> Edit
6-> Assign tone
7-> Send bcard
8-> Options (Type of view, Memory Status)
9-> Speed dials
10-> Voice tags
""";


  phoneBookChoice = input.nextInt();
        switch (phoneBookChoice) {
            case 1: {
                 System.out.println("Your PhoneBook");
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
                System.out.println("Send bcard");
                break;
            case 8:{
		case 1:{
		 System.out.println(options);
                 case 1-> System.out.println("Type of view");
                 case 2-> System.out.println("Memory Status");
                 optionsChoice = input.nextInt();
            case 9:
                System.out.println("Speed dials");        
                break;
            case 10:
                System.out.println("Voice tags");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 10.");
System.out.print(phoneBook);
}
}
}
}

String messages = """
1-> Write Messages
2-> inbox
3-> outbox
4-> Picture Messages
5-> Templates
6-> Smileys
7-> Messages settings,Set1: 
8-> Message centre number
9-> Mesage sent as
10-> Message validity
11-> Common:
12-> Delivery
13-> Reply via same centre
14-> Character support
15-> Info Service
16-> Voice mailbox number
17-> Service command editor
""";

int messagesChoice = input.nextInt();
switch(messagesChoice){
            case 2: {
                System.out.println("Write New Message");
                break;
            case 1:
                System.out.println("Inbox");
                break;
            case 2:
                System.out.println("Outbox");
                break;
            case 3:
                System.out.println("Picture Messages");
                break;
            case 4:
                System.out.println("Templates");
                break;
            case 5:
                System.out.println("Smileys");
                break;
            case 6:
                System.out.println("Message Settings");
                break;
             case 7:
                System.out.println("Message Centre Number");
                break;
            case 8:
                System.out.println("Message Sent As");
                break;
            case 9:
                System.out.println("Message Validity");
                break;
            case 10:
                System.out.println("Common");
                break;
            case 11:
                System.out.println("Delivery");
                break;
            case 12:
                System.out.println("Reply via Same Centre");
                break;
            case 13:
                System.out.println("Character Support");
                break;
            case 14:
                System.out.println("Info Service");
                break;
            case 15:
                System.out.println("Voice Mailbox Number");
                break;
            case 16:
                System.out.println("Service Command Editor");
                break;
            default:
                System.out.println("Invalid click, please try again");
                break;
System.out.print(messages);
}
}



String chat = """
1-> Start a chat!
""";

int chatChoice = input.nextInt(); 
         
            switch (chatChoice) {
            case 1:
                   System.out.println("Start a conversation!");            
                   break;
            default:
                   System.out.println("Invalid click. Please try again.");
                   break;
System.out.print(chat);
}


String callRegister = """
1-> Missed calls
2-> Received calls
3-> Dialed numbers
4-> Erase recent call list
5-> Show call duration
6-> Last call duration
7-> All calls duration
8-> Received calls duration
9-> Dialed calls duration
10-> Clear timers
11-> Show call costs:
12-> Last call cost
13-> All call cost
14-> Clear counters
15-> Call cost settings
16-> Call cost limit
17-> Show cost in
18-> Prepaid credit
""";


int callRegisterChoice = input.nextInt();
	    switch (callRegisterChoice) {
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
System.out.print(tones);
}


String tones = """
1-> Ringing tone
2-> Ringing volume
3-> Incoming call alert
4-> Composer
5-> Message alert tone
6-> Keypad tones
7-> Alarm and games tones
8-> Vibrating alerts
9-> Screen saver
""";


int tonesChoice = input.nextInt();
              switch (tonesChoice) {
              case 1: 
		System.out.println("Empty list");
		break;
              case 2: 
		System.out.println("Min-Max");
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
System.out.print(tones);		
}



String settings = """
1-> call setings
2-> phone settings
3-> Security settings
4-> restore factory settings
""";
int settingsChoice = input.nextInt();
            switch (settingsChoice) {
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
System.out.print(callSettings);
}

               case
		String phoneSettings = """
		1. Language
		2. Cell info display
		3. Welcome note
		4. Network selection
		5. Lights
		6. Confirm SIM service actions
		""";
            
	    int phoneSettingsChoice = input.nextInt();
            
            switch (phoneSettingsChoice) {
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
System.out.print(phoneSettings);
}



String securitySettings = """
1-> Pin code request
2-> Call barring srvice
3-> Fixed dailing
4-> Closed user group
5-> Phone security
6-> Change access codes
""";

securitySettingsChoice = input.nextInt(); 
            switch (securitySettingsChoice) {
            case 1: {
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
System.out.print(securitySettings);
}
String restoreFactorySettings = """
1-> Setting reset
""";

restoreFactorySettingsChoice = input.nextInt();
                  switch (restoreFactorySettingsChoice) {
                  case 1:{
                  System.out.println("Resetting phone to default settings");
                  break;
                  default: System.out.println("invalid click.please try again");break;
System.out.print(restoreFactorySettings);
}


String callDivert = """
1-> Setting reset
""";

callDivertChoice = input.nextInt();
                switch (callDivertChoice) {
                case 1:
                System.out.println("Set up call diverting");
                break;
                default: System.out.println("invalid click.please try again");
		break;
System.out.print(callDivert);
}


String games = """
1-> Snake
2-> Space impact
3-> Bumper
""";


gamesChoice = input.nextInt();
                  switch (gamesChoice) {
  		  case 1: System.out.println("----SNAKE----"); 
                  break;
   		  case 2: System.out.println("----SPACE IMPACT----"); 
                  break;
    		  case 3: System.out.println("----BUMPER----"); 
                  break;
                  default: System.out.println("invalid click.please try again");
                  break;
System.out.print(games);
}




String calculator = """
1-> calculator
""";

calculatorChoice = input.nextInt();
		switch (calculatorChoice) {
                case 1:
                System.out.println("Select an operation (+, -, *, /):");
                String operation = input.next();
                break;
                default: System.out.println("invalid click.please try again");
                break;
System.out.print(calculator);
}


String reminders = """
1-> reminders
""";

remindersChoice = input.nextInt();
                switch (remindersChoice) {
                case 1:
                System.out.println("NO REMINDERS");
                break;
                default: System.out.println("invalid click.please try again");
                break;
System.out.println(reminders);
}



String clock = """
1-> Alarm clcok
2-> Clock Settings
3-> Stopwatch
4-> Date settings
5-> Countdown timer
6-> Auto update date and time
""";


clockChoice = input.nextInt();
		switch (clockChoice) {
               case 11-> String "Edit clock"
               case 1:
               System.out.println("Set alarm");
                break;
               case 2:
                System.out.println("Change settings");
                break;
               case 3:
                System.out.println("Stopwatch: 00:00:00"); 
                break; 
               case 4:
                System.out.println("Change Date settings");
                break;
               case 5:
                System.out.println("Set Timer");
                break;
               case 6:
                System.out.println("Network time, set up manually");
                break;
               default: System.out.println("invalid click.please try again");
               break;
System.out.print(clock);
}
}

String profiles = """
1-> Edit Profile
""";

profilesChoice = input.nextInt();   
	       switch (profilesChoice) {
               case-> 12{
               case-> 1 String "Your profiles"
               System.out.println("Create new profile");
               break;
               default: System.out.println("invalid click.please try again");
               break;
System.out.print(profiles);
}
}


String simServices = """
1-> Change SIM Pin
2-> Block SIM
""";

simServicesChoice = input.nextInt();
             switch (simServicesChoice) 
             case 13-> 
             case 1->
             System.out.println("Your sim services");
             case 2->
             System.out.println("Enter old sim pin"); 
             break; 
             default: System.out.println("invalid click.please try again");
             break;
System.out.print(simServices);

}
}
}
