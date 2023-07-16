package Tasks.Three;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ArchiveServer {
    private static final int PORT = 12345;
    private List<Case> cases;
    private String dataFilePath;

    public ArchiveServer(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        cases = new ArrayList<>();
        loadCasesFromFile();
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Archive Server started on port " + PORT);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress());
                Thread clientThread = new Thread(() -> handleClient(clientSocket));
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleClient(Socket clientSocket) {
        try (
                ObjectOutputStream outputStream = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream inputStream = new ObjectInputStream(clientSocket.getInputStream())
        ) {
            while (true) {
                Request request = (Request) inputStream.readObject();
                Response response = processRequest(request);
                outputStream.writeObject(response);
                if (response instanceof CloseConnectionResponse) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Client disconnected: " + clientSocket.getInetAddress());
    }

    private Response processRequest(Request request) {
        Response response;
        if (request instanceof ViewCaseRequest) {
            response = handleViewCaseRequest((ViewCaseRequest) request);
        } else if (request instanceof UpdateCaseRequest) {
            response = handleUpdateCaseRequest((UpdateCaseRequest) request);
        } else if (request instanceof CreateCaseRequest) {
            response = handleCreateCaseRequest((CreateCaseRequest) request);
        } else if (request instanceof CloseConnectionRequest) {
            response = new CloseConnectionResponse();
        } else {
            response = new ErrorResponse("Invalid request");
        }
        return response;
    }

    private ViewCaseResponse handleViewCaseRequest(ViewCaseRequest request) {
        int caseId = request.getCaseId();
        Case requestedCase = getCaseById(caseId);
        if (requestedCase != null) {
            return new ViewCaseResponse(requestedCase);
        } else {
            return new ErrorResponse("Case not found");
        }
    }

    private UpdateCaseResponse handleUpdateCaseRequest(UpdateCaseRequest request) {
        int caseId = request.getCaseId();
        Case updatedCase = request.getUpdatedCase();
        Case existingCase = getCaseById(caseId);
        if (existingCase != null) {
            updateCase(existingCase, updatedCase);
            saveCasesToFile();
            return new UpdateCaseResponse(true, "Case updated successfully");
        } else {
            return new UpdateCaseResponse(false, "Case not found");
        }
    }

    private CreateCaseResponse handleCreateCaseRequest(CreateCaseRequest request) {
        Case newCase = request.getNewCase();
        int nextCaseId = getNextCaseId();
        newCase.setId(nextCaseId);
        cases.add(newCase);
        saveCasesToFile();
        return new CreateCaseResponse(nextCaseId, "Case created successfully");
    }

    private Case getCaseById(int caseId) {
        for (Case aCase : cases) {
            if (aCase.getId() == caseId) {
                return aCase;
            }
        }
        return null;
    }

    private void updateCase(Case existingCase, Case updatedCase) {
        existingCase.setSubject(updatedCase.getSubject());
        existingCase.setDate(updatedCase.getDate());
        existingCase.setEmail(updatedCase.getEmail());
        existingCase.setMessage(updatedCase.getMessage());
    }

    private int getNextCaseId() {
        int maxId = 0;
        for (Case aCase : cases) {
            if (aCase.getId() > maxId) {

