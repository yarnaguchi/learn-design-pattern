package Chapter8_AbstractFactory_Pattern.listfactory;

import Chapter8_AbstractFactory_Pattern.factory.Factory;
import Chapter8_AbstractFactory_Pattern.factory.Link;
import Chapter8_AbstractFactory_Pattern.factory.Page;
import Chapter8_AbstractFactory_Pattern.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
