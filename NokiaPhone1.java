import java.util.Scanner;

public class NokiaPhoneMenu1{
public static void main(String[] args){
Scanner tomInput = new Scanner(System.in);

int click;
String menu = """
1-> phoneBook
2-> messages
3-> chat
4-> callRegister
5-> ones 
6-> callSettings
7-> phoneSetting
8-> security setting
9-> restore factory setting
10-> calLDivert
11-> games
12-> calculator
13 -> reminder
14-> clock
15-> simServices
""";

System.out.println("Start a conversation!");
System.out.println(phoneBoo);
while (click <= 15) {
System.out.println();
click = tomInput.nextInt();
}

switch (click) {
               case 1: phoneBook();break;
               case 2: messages();break;
               case 3: chat();break;
               case 4: callRegister();break;
               case 5: callSettings();break;
               case 6: phoneSettings();break;
               case 7: securitySettings();break;
               case 8: restoreFactorySettings();break;
               case 9: callDivert();break;
               case 10: games();break;
               case 11: calculator();break;
               case 12: reminder();break;
               case 13: clock();break;
               case 14: simServices();break;
               case 15: System.out.println("Exiting...");break;
               default: System.out.println("Invalid choice. Please try again.");
}
}
tomInput.close();
}






public static void PhoneBook(){
int click;

String phoneBook = """
1. Search
2. Service Nos
3. Add name
4. Erase
5. Edit
6. Assign tone
7. Send bcard
8. Options (Type of view, Memory Status)
9. Speed dials
10. Voice tags
""";
System.out.println("Enter a number");
System.out.println(phoneBook);

 while (click <= 10) {
System.out.println();
}
click = tomInput.nextInt();

switch (click) {
              case 1: System.out.println("Your Phone Book");break;
              case 2: System.out.println("My Service Nos");break;
              case 3: System.out.println("Empty list");break;
              case 4: System.out.println("reset all setting?");break;
              case 5: System.out.println("Edit settings");break;
              case 6: System.out.println("choose a tone");break;
              case 7: System.out.println("Add a card");break;
              case 8: System.out.println("Options selected(Default view, Empty Storage)");break;
              case 9: System.out.println("0 speed dials");break;
              case 10: System.out.println("No voice tags");break;
              default: System.out.println("invalid click. please try again");break;
}
tomInput.close();
}






public static void Messages(){

int click;
String messages = """
1. Write Messages
2. inbox
3. outbox
4. Picture Messages
5. Templates
6. Smileys
7. Messages settings, Set1: 
8. Message centre number
9. Mesage sent as
10. Message validity
11. Common:
12. Delivery
13. Reply via same centre
14. Character support
15. Info Service
16. Voice mailbox number
17. Service command editor

""";
System.out.println("Enter a number");
System.out.println(messages);

while (click <= 17) {
System.out.println();
click = tomInput.nextInt();
}
click = tomInput.nextInt();

switch (click) {
              case 1: System.out.println("Write New Message");break;
              case 2: System.out.println("Empty List");break;
              case 3: System.out.println("Empty list");break;
              case 4: System.out.println("Nothing here");break;
              case 5: System.out.println("I will call you later, See you soon, Can i go back in time.");break;
              case 6: System.out.println(":),:(");break;
              case 7: System.out.println("Edit Messages");break;
              case 8: System.out.println("09011224359");break;
              case 9: System.out.println("No messages");break;
              case 10: System.out.println("Nul");break;
              case 11: System.out.println("Null");break;
              case 12: System.out.println("Empty list!");break;
              case 13: System.out.println("Write message with new number?");break;
              case 14: System.out.println("contact support");break;
              case 15: System.out.println("Null");break;
              case 16: System.out.println("Null");break;
              case 17: System.out.println("Null");break; 
              default: System.out.println("invalid click. please try again");break;
}
tomInput.close();
}







public static void Chat(){
int click;

String chat = """
1. Start a chat!
""";
System.out.println("Start a conversation!");
System.out.println(chat);
while (click <= 1) {
System.out.println();
click = tomInput.nextInt();
}
click = tomInput...nextInt();
switch (chat) {
             case 1: System.out.println("No existing chat");break;
             default: System.out.println("invalid click. please try again");break;
}
tomInput.close();
}



public static void CallRegister(){
int click;


String callRegister = """
1. Missed calls
2. Received calls
3. Dialed numbers
4. Erase recent call list
5. Show call duration:
6. Last call duration
7. All calls duration
8. Received calls duration
9. Dialed calls duration
10. Clear timers
11. Show call costs:
12. Last call cost
13. All call cost
14. Clear counters
15. Call cost settings
16. Call cost limit
17. Show cost in
18. Prepaid credit

""";

System.out.println("Enter a number");
System.out.println(callRegister);

while (click <= 19) {
System.out.println();
click = tomInput.nextInt();
}
click = tomInput.nextInt();

switch (click) {
              case 1: System.out.println("0 missed calls");break;
              case 2: System.out.println("0 received calls");break;
              case 3: System.out.println("Empty list");break;
              case 4: System.out.println("Delete history");break;
              case 5: System.out.println("Call Duration");break;
              case 6: System.out.println("00:00:00");break;
              case 7: System.out.println("00:00:00");break;
              case 8: System.out.println("00:00:00");break;
              case 9: System.out.println("00:00:00");break;
              case 10: System.out.println("No alarms");break;
              case 11: System.out.println("No alarms");break;
              case 12: System.out.println("Call costs");break;
              case 13: System.out.println("#0.00");break;
              case 14: System.out.println("#0.00");break;
              case 15: System.out.println("0 calls made");break;
              case 16: System.out.println("Edit setting");break;
              case 17: System.out.println("Edit call costs");break;
              case 18: System.out.println("local, international");break;
              case 19: System.out.println("Change plan?");break;
              default: System.out.println("invalid click. please try again");break;
}
tomInput.close();
}








public static void Tones(){
int click;

String tones = """
1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Composer
5. Message alert tone
6. Keypad tones
7. Alarm and games tones
8. Vibrating alerts
9. Screen saver

""";

System.out.println("Enter a number");
System.out.println(tones);

click = tomInput.nextInt();
while (click <= 10) {
System.out.println();
click = tomInput.nextInt();
}
switch (click) {
              case 1: System.out.println("Empty list");break;
              case 2: System.out.println("0\\\\\\\100");break;
              case 3: System.out.println("Vibrate,Loud");break;
              case 4: System.out.println("compose a tone");break;
              case 5: System.out.println("Sunrise,bubble,ding");break;
              case 6: System.out.println("Silent/loud");break;
              case 7: System.out.println("customize tones");break;
              case 8: System.out.println("sos,heartbeat,siren");break;
              case 9: System.out.println("no screen savers available");break;
              default: System.out.println("invalid click. please try again");break;
}
 
tomInput.close();
}







public static void CallSettings(){
int click;

String callSettings = """
1. Automatic redial
2. Speed dialing
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer
""";

System.out.println("Enter a number");
System.out.println(callSettings);
while (click <= 6) {
System.out.println();
click = tomInput.nextInt();
}
click = tomInput.nextInt();

switch (click) {
              case 1: System.out.println("no redials");break;
              case 2: System.out.println("no speed dial");break;
              case 3: System.out.println("Accept incoming calls,Decline incoming calls,confiure call settings");break;
              case 4: System.out.println("Send my number, add new number");break;
              case 5: System.out.println("none");break;
              case 6: System.out.println("Accesibility");break;
              default: System.out.println("invalid click. please try again");break;

}
tomInput.close();
}






public static void PhoneSettings(Scanner tomInput){
int click;

String phoneSettings = """
1. Language
2. Cell info display
3. Welcome note
4. Network selection
5. Lights
6. Confirm SIM service actions
""";

System.out.println("Enter a number");
System.out.println(phoneSettings);
while (click <= 6) {
System.out.println();
}
click = tomInput.nextInt();

switch (click) {
              case 1: System.out.println("1.English,2.yoruba,3.Hausa,4.igbo");break;
              case 2: System.out.println("carrier name,cell id");break;
              case 3: System.out.println("Default:Hello nokia,Edit welcome note");break;
              case 4: System.out.println("Automatic,manual");break;
              case 5: System.out.println("Torch,Backlight");break;
              case 6: System.out.println("contact mobile carrier");break;              
              default: System.out.println("invalid click.please try again");break;
}
tomInput.close();
}








public static void SecuritySetting(){
int click;

String securitySettings = """
1. Pin code request
2. Call barring srvice
3. Fixed dailing
4. Closed user group
5. Phone security
6. Change access codes
""";

System.out.println("Enter a number");
System.out.println(securitySettings);
while (click <= 6) {
System.out.println();
}
click = tomInput.nextInt();

switch (click) {
              case 1: System.out.println("set up access code");break;
              case 2: System.out.println("select a number");break;
              case 3: System.out.println("null");break;
              case 4: System.out.println("null");break;
              case 5: System.out.println("set up phone security");break;
              case 6: System.out.println("reset access code");break;              
              default: System.out.println("invalid click.please try again");break;
}
tomInput.close();
}





public static void RestoreFactorySetting(){
int click;

String restoreFactorySettings = """
1. Setting reset
""";

System.out.println("Enter a number");
System.out.println(restoreFactorySettings);

click = tomInput.nextInt();


switch (click) {
              case 1: System.out.println("reset phone to default");break;
              default: System.out.println("invalid click.please try again");break;
}
while ( click <= 1) {
System.out.println();
}
tomInput.close();
}






public static void CallDivert(){
int click;

String callDivert = """
1. Setting reset
""";

System.out.println("Enter a number");
System.out.println(callDivert);

click = tomInput.nextInt();


switch (click) {
              case 1: System.out.println("Set up call Diverting");break;
              default: System.out.println("invalid click.please try again");break;
}
while ( click <= 1) {
System.out.println();
}
tomInput.close();
}


public static void Games(){
int click;

String games = """
1. Snake
2. Space impact
3. Bumper
""";

System.out.println("Enter a number");
System.out.println(games);

while ( click <= 3) {
System.out.println();
click = tomInput.nextInt();
}

switch (click) {
              case 1: System.out.println("----SNAKE----");break;
              case 2: System.out.println("----SPACE IMPACT----");break;
              case 3: System.out.println("----BUMPER----");break;
              default: System.out.println("invalid click.please try again");break;
}
tomInput.close();
}
}





public static void Calculator(){
int click;

String calculator = """
1. calculator
""";

System.out.println("Enter a number");
System.out.println(calculator);

while ( click <= 1) {
System.out.println();
click = tomInput.nextInt();
}

switch (click) {
              case 1: System.out.println("+,*,-,/");break;
              default: System.out.println("invalid click.please try again");break;
}
tomInput.close();
}






public static void Reminder(){
int click;

String reminders = """
1. reminders
""";

System.out.println("Enter a number");
System.out.println(reminders);

while ( click <= 1) {
System.out.println();
click = tomInput.nextInt();
}

switch (click) {
              case 1: System.out.println("NO REMINDERS");break;
              default: System.out.println("invalid click.please try again");break;
}
tomInput.close();
}






public static void Clock(){
int click;

String clock = """
1. Alarm clcok
2. Clock Settings
3. Stopwatch
4. Date settings
5. Countdown timer
6. Auto update date and time
""";

System.out.println("Enter a number");
System.out.println(clock);

while ( click <= 6) {
System.out.println();
click = tomInput.nextInt();
}

switch (click) {
              case 1: System.out.println("Set alarm");break;
              case 2: System.out.println("Change settings");break;
              case 3: System.out.println("0:00:00 -- START");break;
              case 4: System.out.println("Change Date settings");break;
              case 5: System.out.println("set timer");break;
              case 6: System.out.println("network time,set up manually");break;
              default: System.out.println("invalid click.please try again");break;
}
tomInput.close();
}





public static void Profiles(){
int click;

String profiles = """
1. Edit Profile
""";

System.out.println("Enter a number");
System.out.println(profiles);

while ( click <= 1) {
System.out.println();
click = tomInput.nextInt();
}

switch (click) {
              case 1: System.out.println("Create new profile");break;
              default: System.out.println("invalid click.please try again");break;
}
tomInput.close();
}




public void SimServices(){
int click;

String simServices = """
1. Change SIM Pin
2. Block SIM
""";

System.out.println("Enter a number");
System.out.println(simServices);

while ( click <= 2) {
System.out.println();
click = tomInput.nextInt();
}

switch (click) {
              case 1: System.out.println("Enter old sim pin");break;
              case 2: System.out.println("Are you sure?");break;
              default: System.out.println("invalid click.please try again");break;
}
tomInput.close();
}