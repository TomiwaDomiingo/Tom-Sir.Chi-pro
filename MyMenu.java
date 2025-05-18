import java.util.Scanner;

public class MyMenu{
public static void main(String[] args){
Scanner userClick = new Scanner(System.in);
int mainChoice;
int back;

while (true){
System.out.println("\n Main Menu ");
System.out.println("1.Phone book");
System.out.println("2.Messages");
System.out.println("3.Chat");
System.out.println("4.Call register");
System.out.println("5. Tones");
System.out.println("6.Settings");
System.out.println("7.Call divert");
System.out.println("8.Games");
System.out.println("9.Calculator");
System.out.println("10.Reminders");
System.out.println("11.Clock");
System.out.println("12.Profiles");
System.out.println("13.SIM services");
System.out.println("14.Exit");
System.out.print("Select an option: ");
mainChoice = userClick.nextInt();

switch (mainChoice){
		case 1: 
                    System.out.println("\n Phone book ");
                    System.out.println("1.Search");
                    System.out.println("2.Service Nos.");
                    System.out.println("3.Add name");
                    System.out.println("4.Erase");
                    System.out.println("5.Edit");
                    System.out.println("6.Assign tone");
                    System.out.println("7.Send b'card");
                    System.out.println("8.Options");
                    System.out.println("1.Type of view");
                    System.out.println("   2. Memory status");
                    System.out.println("9.Speed dials");
                    System.out.println("10.Voice tags");
		    System.out.println("Press 0 to go back");
                    System.out.print("Select an option: ");
		    int back1 = userClick.nextInt();
                    if (back1 == 0) break;
                    break;

                case 2: 
                    System.out.println("\n Messages ");
                    System.out.println("1.Write messages");
                    System.out.println("2.Inbox");
                    System.out.println("3.Outbox");
                    System.out.println("4.Picture messages");
                    System.out.println("5.Templates");
                    System.out.println("6.Smiley's");
                    System.out.println("7.Message settings");
                    System.out.println(" 1. Set 12");
                    System.out.println(" 1. Message centre number");
                    System.out.println("2. Messages sent as");
                    System.out.println("3. Message validity");
                    System.out.println(" 2. Common");
                    System.out.println("1. Delivery reports");
                    System.out.println("2. Reply via same centre");
                    System.out.println("3. Character support");
		    System.out.println("Enter 0 to go back");
                    System.out.print("Select an option: ");
		    int back2 = userClick.nextInt();
                    if (back2 == 0) break;
                    break;

                case 3: 
                    System.out.println("\n Chat ");
                    System.out.println("Chat selected.");
                    System.out.print("Press 0 to go back: ");
                    int back3 = userClick.nextInt();
                    if (back3 == 0) break;
                    break;

                case 4:  
                    System.out.println("\n Call register ");
                    System.out.println("1.Missed calls");
                    System.out.println("2.Received calls");
                    System.out.println("3.Dialled numbers");
                    System.out.println("4.Erase recent call lists");
                    System.out.println("5.Show call duration");
                    System.out.println("   1. Last call duration");
                    System.out.println("   2. All calls' duration");
                    System.out.println("   3. Received calls' duration");
                    System.out.println("   4. Dialled calls' duration");
                    System.out.println("   5. Clear timers");
                    System.out.println("6.Show call costs");
                    System.out.println("   1. Last call cost");
                    System.out.println("   2. All calls' cost");
                    System.out.println("   3. Clear counters");
                    System.out.println("7.Call cost settings");
                    System.out.println("   1. Call cost limit");
                    System.out.println("   2. Show costs in");
                    System.out.println("8.Prepaid credit");
		    System.out.println("0 to go back");
                    System.out.print("Select an option: ");
		    int back4 = userClick.nextInt();
                    if (back4 == 0) break;
                    break;

                case 5: 
                    System.out.println("\n Tones ");
                    System.out.println("1.Ringing tone");
                    System.out.println("2.Ringing volume");
                    System.out.println("3.Incoming call alert");
                    System.out.println("4.Composer");
                    System.out.println("5.Message alert tone");
                    System.out.println("6.Keypad tones");
                    System.out.println("7.Warning and game tones");
                    System.out.println("8.Vibrating alert");
                    System.out.println("9.Screen saver");
		    System.out.println("0 to go back");
                    System.out.print("Select an option: ");
	            int back5 = userClick.nextInt();
                    if (back5 == 0) break;
                    break;

                case 6: 
                    System.out.println("\n Settings ");
                    System.out.println("1. Call settings");
                    System.out.println("   1. Automatic redial");
                    System.out.println("   2. Speed dialling");
                    System.out.println("   3. Call waiting options");
                    System.out.println("   4. Own number sending");
                    System.out.println("   5. Phone line in use");
                    System.out.println("   6. Automatic answer");
                    System.out.println("2.Phone settings");
                    System.out.println("   1. Language");
                    System.out.println("   2. Cell info display");
                    System.out.println("   3. Welcome note");
                    System.out.println("   4. Network selection");
                    System.out.println("   5. Lights");
                    System.out.println("   6. Confirm SIM service actions");
                    System.out.println("3.Security settings");
                    System.out.println("   1. PIN code request");
                    System.out.println("   2. Call barring service");
                    System.out.println("   3. Fixed dialling");
                    System.out.println("   4. Closed user group");
                    System.out.println("   5. Phone security");
                    System.out.println("   6. Change access codes");
                    System.out.println("4.Restore factory settings");
		    System.out.println("0 to go back");
                    System.out.print("Select an option: ");
	    	    int back6 = userClick.nextInt();
                    if (back6 == 0) break;
                    break;

                case 7: 
                    System.out.println("\n Call divert ");
                    System.out.println("Empty");
                    System.out.print("Enter 0 to go back: ");
                    int back7 = userClick.nextInt();
                    if (back7 == 0) break;
                    break;

                case 8: 
                    System.out.println("\n Games ");
                    System.out.println("Snake");
                    System.out.println("Bounce");
		    System.out.println("Space buster");
		    System.out.println("Soccer");
		    System.out.println("0 to go back");
                    System.out.print("Select an option: ");
 		    int back8 = userClick.nextInt();
                    if (back8 == 0) break;
                    break;

                case 9: 
                    System.out.println("\n Calculator ");
                    System.out.println("Edit calculator settings");
                    System.out.print("0 to go back: ");
                    int back9 = userClick.nextInt();
                    if (back9 == 0) break;
                    break;

                case 10:
                    System.out.println("\n Reminders ");
                    System.out.println("set reminder.");
                    System.out.print("0 to go back: ");
                    int back10 = userClick.nextInt();
                    if (back10 == 0) break;
                    break;

                case 11: 
                    System.out.println("\n Clock ");
                    System.out.println("1. Alarm clock");
                    System.out.println("2. Clock settings");
                    System.out.println("  1. Date setting");
                    System.out.println("  2. Stopwatch");
                    System.out.println("  3. Countdown timer");
                    System.out.println("  4. Auto update of date and time");
		    System.out.println("0 to go back");
                    System.out.print("Select an option: ");
		    int back11 = userClick.nextInt();
                    if (back11 == 0) break;
                    break;

                case 12: 
                    System.out.println("\n Profiles ");
                    System.out.println("Edit profile.");
                    System.out.print("0 to go back: ");
                    int back12 = userClick.nextInt();
                    if (back12 == 0) break;
                    break;

                case 13: 
                    System.out.println("\n SIM services ");
                    System.out.println("SIM services selected.");
                    System.out.print("0 to go back: ");
                    int back13 = userClick.nextInt();
                    if (back13 == 0) break;
                    break;

                case 14: 
                    System.out.println("IRE O!");
                    userClick.close();
                    

                default:
                    System.out.println("Invalid choice.");
                    break;
}
}
}
}