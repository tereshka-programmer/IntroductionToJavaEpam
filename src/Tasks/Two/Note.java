package Tasks.Two;

public class Note {
    private String topic;
    private String date;
    private String email;
    private String message;

    public Note(String topic, String date, String email, String message) {
        this.topic = topic;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public String getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Topic: " + topic + ", Date: " + date + ", Email: " + email + ", Message: " + message;
    }

    @Override
    public int compareTo(Note other) {
        return topic.compareTo(other.getTopic());
    }
}
