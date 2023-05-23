package ua.Hillel.hometask0902;

import java.util.HashMap;
import java.util.Map;

public class ShopList {
    public static void main(String[] args) {
        Map<String, Integer> shop_list = new HashMap<>();

        shop_list.put("Melon" , 3);
        shop_list.put("Apple", 5);
        shop_list.put("Banana" , 10);
        shop_list.put("Cherry", 50);



        Integer sum = shop_list.get("Melon")+shop_list.get("Apple")+ shop_list.get("Banana") + shop_list.get("Cherry");

        System.out.println("The number of goods purchased is "+ sum + ".");


    }
}
