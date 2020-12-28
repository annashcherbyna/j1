package l5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Store{" +
                "products=" + products +
                '}';
    }

    public boolean checkProduct(Product product) {
        Double price = product.getPrice();
        Double quantity = product.getQuantity();
        String name = product.getName();
        String type = product.getType();
        Double unit = product.getUnit();

        if(price == null || quantity == null || name == null || type == null || unit == null){
            return false;
        }

        if(price<=0 || quantity<=0 || unit<=0){
            return false;
        }

        Pattern p = Pattern.compile(".*[0-9]+.*");
        Matcher m = p.matcher(name);
        if(m.find()){
            return false;
        }

        return true;
    }

    public void addProduct(Product product){
        if(checkProduct(product)){
            this.products.add(product);
        }
    }

    public void removeProduct(String s){
        for (Product p: this.products
             ) {
            if(p.getName()==s){
                this.products.remove(p);
            }
        }
    }

    public void doublePrice(String type){
        for (Product p: this.products
        ) {
            if(p.getType()==type){
                p.setPrice(2*p.getPrice());
            }
        }
    }

    public List<Product> premiumSet(Double price){
        List<Product> pSet = new ArrayList<>();
        for (Product p: this.products
        ) {
            if(p.getPrice()>price){
                pSet.add(p);
            }
        }
        return  pSet;
    }

    public Double sumPrice(String type){
        Double sumPrice = 0.0;
        for (Product p: this.products
        ) {
            if(p.getType()==type){
                sumPrice += p.getPrice();
            }
        }
        return sumPrice;
    }

    public Double avgPrice(String type){
        Double sumPrice = 0.0;
        Double avgPrice = 0.0;
        int cnt = 0;
        for (Product p: this.products
        ) {
            if(p.getType()==type){
                sumPrice += p.getPrice();
                cnt++;
            }
        }
        if (cnt>0){
            avgPrice = sumPrice/cnt;
        }
        return avgPrice;
    }


}
