package Chapter8_AbstractFactory_Pattern.listfactory;

import Chapter8_AbstractFactory_Pattern.factory.Item;
import Chapter8_AbstractFactory_Pattern.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n");
        sb.append(caption);
        sb.append("\n<ul>\n");
        for (Item item : tray) {
            sb.append("");
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
