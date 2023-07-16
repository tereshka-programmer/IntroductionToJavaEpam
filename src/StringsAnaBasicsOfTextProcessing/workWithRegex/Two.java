package StringsAnaBasicsOfTextProcessing.workWithRegex;

import java.util.ArrayList;
import java.util.List;

class XmlAnalyzer {
    public static void main(String[] args) {
        String xml = "<notes>\n" +
                " <note id = \"1\">\n" +
                " <to>Вася</to>\n" +
                " <from>Света</from>\n" +
                " <heading>Напоминание</heading>\n" +
                " <body>Позвони мне завтра!</body>\n" +
                " </note>\n" +
                " <note id = \"2\">\n" +
                " <to>Петя</to>\n" +
                " <from>Маша</from>\n" +
                " <heading>Важное напоминание</heading>\n" +
                " <body/>\n" +
                " </note>\n" +
                "</notes>";

        analyzeXml(xml);
    }

    public static void analyzeXml(String xml) {
        List<String> tags = new ArrayList<>();
        int startIndex = 0;

        while (startIndex < xml.length()) {
            int startTagIndex = xml.indexOf("<", startIndex);
            int endTagIndex = xml.indexOf(">", startTagIndex);
            if (startTagIndex != -1 && endTagIndex != -1) {
                String tag = xml.substring(startTagIndex + 1, endTagIndex);
                if (tag.startsWith("/")) {
                    System.out.println("Тип: закрывающий тег");
                } else if (tag.endsWith("/")) {
                    System.out.println("Тип: тег без тела");
                } else {
                    System.out.println("Тип: открывающий тег");
                }
                System.out.println("Содержимое: " + xml.substring(endTagIndex + 1, startTagIndex).trim());
                System.out.println("Тег: " + tag);
                System.out.println();

                startIndex = endTagIndex + 1;
                tags.add(tag);
            } else {
                break;
            }
        }
    }
}
