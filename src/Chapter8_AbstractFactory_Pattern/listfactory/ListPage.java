package Chapter8_AbstractFactory_Pattern.listfactory;

import Chapter8_AbstractFactory_Pattern.factory.Item;
import Chapter8_AbstractFactory_Pattern.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html lang=\"ja\">\n");
        sb.append("<head>\n");
        sb.append("<meta charset=\"UTF-8\">\n");
        sb.append("<title>");
        sb.append(title);
        sb.append("</title>\n");
        sb.append("</head>\n");
        sb.append("<body>\n");
        sb.append("<h1>");
        sb.append(title);
        sb.append("</h1>\n");
        sb.append("<ul>\n");
        for (Item item : content) {
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("<hr><address>");
        sb.append(author);
        sb.append("</address>\n");
        sb.append("</body></html>\n");
        sb.append("\n");
        return sb.toString();
    }
}
