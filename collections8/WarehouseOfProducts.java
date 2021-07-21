package oop.tasks.collections8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WarehouseOfProducts {
    private HashMap<String, Product> productHashMap = new HashMap<>();

    public WarehouseOfProducts(Product... products) {
        for (Product p : products) {
            this.productHashMap.put(p.getName(), p);
        }
    }

    public HashMap<String, Product> getProductHashMap() {
        return this.productHashMap;
    }

    public String printFullList () {
        String result = "";

        Set<Map.Entry<String, Product>> setOfProducts = this.getProductHashMap().entrySet();
        result = result.concat(setOfProducts + "\n");

        return result;
    }

    public String printNamesList () {
        String result = "";

        Set<String> setOfNames = this.getProductHashMap().keySet();
        result = result.concat(setOfNames + "\n");

        return result;
    }

    public String printProductsList () {
        String result = "";

        Collection<Product> productCollection = this.getProductHashMap().values();
        result = result.concat(productCollection + "\n");

        return result;
    }
}
