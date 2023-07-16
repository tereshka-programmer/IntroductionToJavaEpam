package Tasks.Three;

import java.io.Serializable;

abstract class Request implements Serializable {
    // Base class for requests
}

import java.io.Serializable;

abstract class Response implements Serializable {
    // Base class for responses
}

class ViewCaseRequest extends Request {
    private int caseId;

    public ViewCaseRequest(int caseId) {
        this.caseId = caseId;
    }

    public int getCaseId() {
        return caseId;
    }
}

class ViewCaseResponse extends Response {
    private Case requestedCase;

    public ViewCaseResponse(Case requestedCase) {
        this.requestedCase = requestedCase;
    }

    public Case getRequestedCase() {
        return requestedCase;
    }
}

class UpdateCaseRequest extends Request {
    private int caseId;
    private Case updatedCase;

    public UpdateCaseRequest(int caseId, Case updatedCase) {
        this.caseId = caseId;
        this.updatedCase = updatedCase;
    }

    public int getCaseId() {
        return caseId;
    }

    public Case getUpdatedCase() {
        return updatedCase;
    }
}

class UpdateCaseResponse extends Response {
    private boolean success;
    private String message;

    public UpdateCaseResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}

class CreateCaseRequest extends Request {
    private Case newCase;

    public CreateCaseRequest(Case newCase) {
        this.newCase = newCase;
    }

    public Case getNewCase() {
        return newCase;
    }
}

class CreateCaseResponse extends Response {
    private int newCaseId;
    private String message;

    public CreateCaseResponse(int newCaseId, String message) {
        this.newCaseId = newCaseId;
        this.message = message;
    }

    public int getNewCaseId() {
        return newCaseId;
    }

    public String getMessage() {
        return message;
    }
}

class CloseConnectionRequest extends Request {
    // Request to close the connection
}

class CloseConnectionResponse extends Response {
    // Response to close the connection
}

class ErrorResponse extends Response {
    private String errorMessage;

    public ErrorResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
