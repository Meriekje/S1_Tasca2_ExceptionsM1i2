package org.example.nivell2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing TicketManager methods...");

        byte age = TicketManager.readByte("Enter your age");
        System.out.println("You entered: " + age);

        int number = TicketManager.readInt("Enter the amount of tickets you would like to buy?");
        System.out.println("You entered: " + number);

        float discount = TicketManager.readFloat("Enter your discount in decimals");
        System.out.println("You entered: " + discount);

        double price = TicketManager.readDouble("Enter the price of the ticket");
        System.out.println("You entered: " + price);

        char initial = TicketManager.readChar("Enter your first name initial");
        System.out.println("You entered: " + initial);

        String name = TicketManager.readString("Enter your name");
        System.out.println("You entered: " + name);

        boolean isStudent = TicketManager.readYesNo("Are you a student?");
        System.out.println("You entered: " + (isStudent ? "Yes" : "No"));
    }
}