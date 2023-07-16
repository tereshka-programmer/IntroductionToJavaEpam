package BasicsOfOOP.One;

public class TextFile {
    private String name;
    private String content;

    public TextFile(String name) {
        this.name = name;
        this.content = "";
    }

    public TextFile(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void rename(String newName) {
        this.name = newName;
    }

    public void appendContent(String additionalContent) {
        this.content += additionalContent;
    }

    public void delete() {
        this.content = "";
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}