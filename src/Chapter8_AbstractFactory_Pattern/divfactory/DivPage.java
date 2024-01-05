package Chapter8_AbstractFactory_Pattern.divfactory;

import Chapter8_AbstractFactory_Pattern.factory.Item;
import Chapter8_AbstractFactory_Pattern.factory.Page;

public class DivPage extends Page {
    public DivPage(String title, String author) {
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
        sb.append("</title><style>\n");
        sb.append("div.TRAY { " +
                "padding: 0.5em; " +
                "margin-left: 5em; " +
                "border: 1px solid black; " +
                "}\n");
        sb.append("div.LINK { " +
                "padding: 0.5em; " +
                "background-color: lightgray; " +
                "}\n");
        sb.append("</style></head><body>\n");
        sb.append("<h1>");
        sb.append(title);
        sb.append("</h1>\n");
        for (Item item : content) {
            sb.append(item.makeHTML());
        }
        sb.append("<hr><address>");
        sb.append(author);
        sb.append("</address>\n");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}
