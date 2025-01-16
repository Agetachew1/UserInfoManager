import java.util.ArrayList;
import java.util.Scanner;

public class UserInfoManager {
    static ArrayList<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int choice;

        do{
            System.out.println("\n1. Add User");
            System.out.println("2. Display All Users");
            System.out.println("3. Search User by Name");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch(choice){
                case 1:
                    addUser();
                    break;
                case 2:
                    displayUsers();
                    break;
                case 3:
                    searchUser();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while(choice != 4);
    }
    public static void addUser(){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        users.add(new User(name, age, email));
        System.out.println("User added successfully.");
    }
    public static void displayUsers(){
        if(users.isEmpty()){
            System.out.println("No users to display.");
        } else{
            for(User user: users){
                System.out.println(user);
            }
        }
    }
    public static void searchUser(){
        System.out.println("Enter name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        for(User user: users){
            if(user.name.equalsIgnoreCase(searchName)){
                System.out.println("User found: "+user);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("User not found.");
        }

    }
}
