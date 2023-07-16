package Tasks.Three;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ArchiveClient {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
             ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                showMainMenu();
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 0) {
                    break;
                }
                Request request = processUserChoice(choice, scanner);
                outputStream.writeObject(request);
                Response response = (Response) inputStream.readObject();
                processResponse(response);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void showMainMenu() {
        System.out.println("\n--- Archive Client ---");
        System.out.println("1. View Case");
        System.out.println("2. Update Case");
        System.out.println("3. Create Case");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static Request processUserChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                return createViewCaseRequest(scanner);
            case 2:
                return createUpdateCaseRequest(scanner);
            case 3:
                return createCreateCaseRequest(scanner);
            default:
                return new CloseConnectionRequest();
        }
    }

    private static ViewCaseRequest createViewCaseRequest(Scanner scanner) {
        System.out.print("Enter Case ID: ");
        int caseId = Integer.parseInt(scanner.nextLine());
        return new ViewCaseRequest(caseId);
    }

    private static UpdateCaseRequest createUpdateCaseRequest(Scanner scanner) {
        System.out.print("Enter Case ID: ");
        int caseId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Updated Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter Updated Date: ");
        String date = scanner.nextLine();
        System.out.print("Enter Updated Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Updated Message: ");
        String message = scanner.nextLine();
        Case updatedCase = new Case(caseId, subject, date, email, message);
        return new UpdateCaseRequest(caseId, updatedCase);
    }

    private static CreateCaseRequest createCreateCaseRequest(Scanner scanner) {
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter Date: ");
        String date = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Message: ");
        String message = scanner.nextLine();
        Case newCase = new Case(0, subject, date, email, message);
        return new CreateCaseRequest(newCase);
    }

    private static void processResponse(Response response) {
        if (response instanceof ViewCaseResponse) {
            ViewCaseResponse viewCaseResponse = (ViewCaseResponse) response;
            Case requestedCase = viewCaseResponse.getRequestedCase();
            if (requestedCase != null) {
                System.out.println("View Case Response:");
                printCase(requestedCase);
            } else {
                System.out.println("Case not found");
            }
        } else if (response instanceof UpdateCaseResponse) {
            UpdateCaseResponse updateCaseResponse = (UpdateCaseResponse) response;
            if (updateCaseResponse.isSuccess()) {
                System.out.println("Case updated successfully");
            } else {
                System.out.println("Case not found");
            }
        } else if (response instanceof CreateCaseResponse) {
            CreateCaseResponse createCaseResponse = (CreateCaseResponse) response;
            System.out.println("New Case created with ID: " + createCaseResponse.getNewCaseId());
        } else if (response instanceof ErrorResponse) {
            ErrorResponse errorResponse = (ErrorResponse) response;
            System.out.println("Error: " + errorResponse.getErrorMessage());
        }
    }

    private static void printCase(Case aCase) {
        System.out.println("Case ID: " + aCase.getId());
        System.out.println("Subject: " + aCase.getSubject());
        System.out.println("Date: " + aCase.getDate());
        System.out.println("Email: " + aCase.getEmail());
        System.out.println("Message: " + aCase.getMessage());
    }
}
