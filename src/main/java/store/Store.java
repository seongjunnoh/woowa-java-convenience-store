package store;

public class Store {

    private Counter counter;
    private ProductManager productManager;

    private Store(Counter counter, ProductManager productManager) {
        this.counter = counter;
        this.productManager = productManager;

    }

    public static Store create(Counter counter, ProductManager productManager) {
        return new Store(counter, productManager);
    }

}
