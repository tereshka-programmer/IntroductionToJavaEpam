package Tasks.Two;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteManager {
    private List<Note> notes;
    private static final String FILE_PATH = "notes.txt";

    public NoteManager() {
        notes = new ArrayList<>();
        loadNotesFromFile();
    }

    public void addNote(String topic, String date, String email, String message) {
        Note note = new Note(topic, date, email, message);
        notes.add(note);
    }

    public List<Note> searchNotesByKeyword(String keyword) {
        List<Note> searchResults = new ArrayList<>();
        for (Note note : notes) {
            if (note.getMessage().contains(keyword)) {
                searchResults.add(note);
            }
        }
        return searchResults;
    }

    public List<Note> searchNotesByParameters(String topic, String email) {
        List<Note> searchResults = new ArrayList<>();
        for (Note note : notes) {
            if (note.getTopic().equals(topic) && note.getEmail().equals(email)) {
                searchResults.add(note);
            }
        }
        return searchResults;
    }

    public List<Note> getSortedNotes() {
        List<Note> sortedNotes = new ArrayList<>(notes);
        sortedNotes.sort(Note::compareTo);
        return sortedNotes;
    }

    public void saveNotesToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Note note : notes) {
                writer.write(note.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadNotesFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Note note = parseNoteFromString(line);
                if (note != null) {
                    notes.add(note);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Note parseNoteFromString(String line) {
        Pattern pattern = Pattern.compile("Topic: (.+), Date: (.+), Email: (.+), Message: (.+)");
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            String topic = matcher.group(1);
            String date = matcher.group(2);
            String email = matcher.group(3);
            String message = matcher.group(4);
            return new Note(topic, date, email, message);
        }
        return null;
    }
}
