package Chapter7_Builder_Pattern;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HTMLBuilder extends Builder {
    private String filename = "untitled.html";
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html lang=\"ja\">\n");
        sb.append("<head>\n");
        sb.append("    <meta charset=\"UTF-8\">\n");
        sb.append("    <title>");
        sb.append(title);
        sb.append("</title>\n");
        sb.append("</head>\n");
        sb.append("<body>\n");
        sb.append("<h1>");
        sb.append(title);
        sb.append("</h1>\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("<p>");
        sb.append(str);
        sb.append("</p>\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("<ul>\n");
        for (String s : items) {
            sb.append("    <li>");
            sb.append(s);
            sb.append("</li>\n");
        }
        sb.append("</ul>\n\n");
    }

    @Override
    public void close() {
        sb.append("</body>\n");
        sb.append("</html>\n");
        try {
            Writer writer = new FileWriter(filename);
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getHTMLResult() {
        return filename;
    }
}
