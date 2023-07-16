package Tasks.Three;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public class Case {
    private int id;
    private String subject;
    private String date;
    private String email;
    private String message;

    public Case(int id, String subject, String date, String email, String message) {
        this.id = id;
        this.subject = subject;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toXmlString() {
        return "<Case>\n" +
                "  <Id>" + id + "</Id>\n" +
                "  <Subject>" + subject + "</Subject>\n" +
                "  <Date>" + date + "</Date>\n" +
                "  <Email>" + email + "</Email>\n" +
                "  <Message>" + message + "</Message>\n" +
                "</Case>";
    }

    public static Case fromXmlString(String xmlString) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource inputSource = new InputSource(new StringReader(xmlString));
            Document document = builder.parse(inputSource);
            Element caseElement = document.getDocumentElement();
            int id = Integer.parseInt(getElementTextContent(caseElement, "Id"));
            String subject = getElementTextContent(caseElement, "Subject");
            String date = getElementTextContent(caseElement, "Date");
            String email = getElementTextContent(caseElement, "Email");
            String message = getElementTextContent(caseElement, "Message");
            return new Case(id, subject, date, email, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getElementTextContent(Element element, String tagName) {
        NodeList nodeList = element.getElementsByTagName(tagName);
        if (nodeList.getLength() > 0) {
            Node node = nodeList.item(0);
            return node.getTextContent();
        }
        return null;
    }
}
