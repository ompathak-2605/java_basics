
import java.util.ArrayList;
import java.util.Scanner;



public class split {
    static void welcome() {
        
    }
    public static void main(String[] args) {
        ArrayList<String> members = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.err.println("Welcome to the split group.....");
        System.out.println("Are you new to this group? (yes/no)");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Welcome to the split group!");
        System.out.println("Please introduce yourself:");
        String name = sc.nextLine();
        System.out.println("Welcome abord " + name + "!");
        members.add(name);
        } else {
            System.out.println("Welcome back!");
            if (members.isEmpty()) {
                System.out.println("No members found. Please introduce yourself:");
                String name = sc.nextLine();
                System.out.println("Welcome abord " + name + "!");
                members.add(name);
            } else {
                System.out.println("Current members in the split group:");
                for (String member : members) {
                    System.out.println("- " + member);
                }
            }
        }
    }
}
