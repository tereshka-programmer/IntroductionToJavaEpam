package Tasks.Two;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final NoteManager noteManager = new NoteManager();

    public static void main(String[] args) {
        showMainMenu();
        scanner.close();
    }

    private static void showMainMenu() {
        while (true) {
            System.out.println("\n--- Note Manager ---");
            System.out.println("1. Add a Note");
            System.out.println("2. Search Notes by Keyword");
            System.out.println("3. Search Notes by Parameters");
            System.out.println("4. Show Sorted Notes");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNote();
                    break;
                case 2:
                    searchNotesByKeyword();
                    break;
                case 3:
                    searchNotesByParameters();
                    break;
                case 4:
                    showSortedNotes();
                    break;
                case 0:
                    noteManager.saveNotesToFile();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addNote() {
        System.out.println("\n--- Add a Note ---");
        System.out.print("Enter Topic: ");
        String topic = scanner.nextLine();
        System.out.print("Enter Date: ");
        String date = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Message: ");
        String message = scanner.nextLine();
        noteManager.addNote(topic, date, email, message);
        System.out.println("Note added successfully.");
    }

    private static void searchNotesByKeyword() {
        System.out.println("\n--- Search Notes by Keyword ---");
        System.out.print("Enter Keyword: ");
        String keyword = scanner.nextLine();
        List<Note> searchResults = noteManager.searchNotesByKeyword(keyword);
        printNotes(searchResults);
    }

    private static void searchNotesByParameters() {
        System.out.println("\n--- Search Notes by Parameters ---");
        System.out.print("Enter Topic: ");
        String topic = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        List<Note> searchResults = noteManager.searchNotesByParameters(topic, email);
        printNotes(searchResults);
    }

    private static
