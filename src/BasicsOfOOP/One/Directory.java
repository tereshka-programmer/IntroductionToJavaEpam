package BasicsOfOOP.One;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<File> files;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void createFile(String fileName) {
        files.add(new File(fileName));
    }

    public void renameFile(String fileName, String newFileName) {
        for (File file : files) {
            if (file.getName().equals(fileName)) {
                file = new File(newFileName);
                break;
            }
        }
    }

    public void printFiles() {
        for (File file : files) {
            System.out.println(file);
        }
    }

    public void appendContentToFile(String fileName, String additionalContent) {
        for (File file : files) {
            if (file.getName().equals(fileName) && file instanceof TextFile) {
                ((TextFile) file).appendContent(additionalContent);
                break;
            }
        }
    }

    public void deleteFile(String fileName) {
        files.removeIf(file -> file.getName().equals(fileName));
    }

    public static void main(String[] args) {
        Directory directory = new Directory("Documents");

        directory.createFile("file1.txt");
        directory.createFile("file2.txt");
        directory.createFile("file3.txt");

        directory.printFiles();

        directory.renameFile("file2.txt", "newFile2.txt");

        directory.appendContentToFile("newFile2.txt", "Hello, World!");

        directory.printFiles();

        directory.deleteFile("file1.txt");

        directory.printFiles();
    }
}