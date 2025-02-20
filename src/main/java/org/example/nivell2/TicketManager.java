package org.example.nivell2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketManager {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a small number.");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a decimal number using a comma.");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid format. Please enter a decimal number using a comma.");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {

        while (true) {
            try {
                System.out.print(message + ": ");
                String input = scanner.next();
                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    throw new CustomException("Invalid format. Please enter one single character.");
                }
                return input.charAt(0);
            } catch (CustomException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.next();
            } catch (Exception e) {
                System.out.println("Unexpected error. Please enter a valid answer.");
                scanner.nextLine();
            }
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            try {
                System.out.print(message + " (y/n): ");
                String input = scanner.next().toLowerCase();
                if (input.equals("y")) {
                    return true;
                } else if (input.equals("n")) {
                    return false;
                } else {
                    throw new CustomException("Invalid input. Please enter 'y' for yes or 'n' for no.");                }
            } catch (CustomException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }
}