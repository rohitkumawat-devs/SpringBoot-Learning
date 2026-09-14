package in.coderarmy;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CartService {
    HashMap<Integer,String> mp ;
    public CartService(){
        mp = new HashMap<>();
        System.out.println("CartService Constructor Called");
    }

    public void addToCart(){
        System.out.println("Added to Cart");
    }
}
