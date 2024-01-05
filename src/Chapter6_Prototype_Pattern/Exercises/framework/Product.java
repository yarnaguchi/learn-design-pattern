package Chapter6_Prototype_Pattern.Exercises.framework;

public interface Product {
    public abstract void use(String s);
    public abstract Product createCopy();
}
