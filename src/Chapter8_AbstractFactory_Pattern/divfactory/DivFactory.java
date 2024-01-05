package Chapter8_AbstractFactory_Pattern.divfactory;

import Chapter8_AbstractFactory_Pattern.factory.Factory;
import Chapter8_AbstractFactory_Pattern.factory.Link;
import Chapter8_AbstractFactory_Pattern.factory.Page;
import Chapter8_AbstractFactory_Pattern.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
