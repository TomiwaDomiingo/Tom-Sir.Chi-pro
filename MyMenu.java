import java.util.Scanner;

public class MyMenu {
public static void main(String[] args) {
Scanner tomInput = new Scanner(System.in);

        int click = 0; 
        String menu = """
        1-> phoneBook
        2-> messages
        3-> chat
        4-> callRegister
        5-> callSettings
        6-> phoneSettings
        7-> securitySettings
        8-> restore factory settings
        9-> callDivert
        10-> games
        11-> calculator
        12-> reminder
        13-> clock
        14-> simServices
        15-> Exit
        """;

 System.out.println("NOKIA MENU");
        System.out.println(menu); 
        
click = tomInput.nextInt();
if (click <= 15 && click > 0) {
switch (click) {
                case 1: phoneBook(); break;
                case 2: messages(); break;
                case 3: chat(); break;
                case 4: callRegister(); break;
                case 5: callSettings(); break;
                case 6: phoneSettings(); break;
                case 7: securitySettings(); break;
                case 8: restoreFactorySettings(); break;
                case 9: callDivert(); break;
                case 10: games(); break;
                case 11: calculator(); break;
                case 12: reminder(); break;
                case 13: clock(); break;
                case 14: simServices(); break;
                case 15: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Please try again.");


}
} else {
System.out.println("Invalid choice. Please try again.");
}

        tomInput.close();
}

    
    static void phoneBook() { 
    System.out.println("Phone Book selected."); }
    static void messages() { 
    System.out.println("Messages selected."); }
    static void chat() { 
    System.out.println("Chat selected."); }
    static void callRegister() { 
    System.out.println("Call Register selected."); }
    static void callSettings() { 
    System.out.println("Call Settings selected."); }
    static void phoneSettings() { 
    System.out.println("Phone Settings selected."); }
    static void securitySettings() { 
    System.out.println("Security Settings selected."); }
    static void restoreFactorySettings() { 
    System.out.println("Restore Factory Settings selected."); }
    static void callDivert() { System.out.println("Call Divert selected."); }
    static void games() { 
    System.out.println("Games selected."); }
    static void calculator() { 
    System.out.println("Calculator selected."); }
    static void reminder() { 
    System.out.println("Reminder selected."); }
    static void clock() { 
    System.out.println("Clock selected."); }
    static void simServices() {
    System.out.println("SIM Services selected."); }
}

        
        while (true){
        System.out.println(phoneBookMenu);
        String phoneBookMenu = """
        1. Search
        2. Service Nos
        3. Add Name
        4. Erase
        5. Edit
        6. Assign Tone
        7. Send BCard
        8. Options (Type of View, Memory Status)
        9. Speed Dials
        10. Voice Tags
        """;
        
        System.out.println(phoneBookMenu);
        System.out.println("Enter a number");
        click = tomInput.nextInt(); 
       
switch (click) {
              case 1: System.out.println("Your Phone Book....Null");break;
              case 2: System.out.println("My Service Nos...Null");break;
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




}

    
}


