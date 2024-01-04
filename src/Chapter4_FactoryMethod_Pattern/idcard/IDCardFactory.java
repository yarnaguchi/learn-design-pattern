package Chapter4_FactoryMethod_Pattern.idcard;

import Chapter4_FactoryMethod_Pattern.framework.Factory;
import Chapter4_FactoryMethod_Pattern.framework.Product;

public class IDCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "を登録しました。");
    }
}
