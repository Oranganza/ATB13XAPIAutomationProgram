package ex_07_Payload_Management.Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class APITesting_Lab27_complex_JSONTPMAP {

    public static void main(String[] args) {

        Map<String, Object> payload = new LinkedHashMap<>();
        List<LinkedHashMap<String, Object>> fruits = new ArrayList<>();

        LinkedHashMap<String, Object> apple = new LinkedHashMap<>();
        apple.put("name", "Apple");
        apple.put("color", "#FF0000");

        LinkedHashMap<String, Object> appleDetails = new LinkedHashMap<>();
        appleDetails.put("type", "Pome");
        appleDetails.put("season", "Fall");
        apple.put("details", appleDetails);

        LinkedHashMap<String, Object> appleNutrients = new LinkedHashMap<>();
        appleNutrients.put("calories", 52);
        appleNutrients.put("fiber", "2.4g");
        appleNutrients.put("vitaminC", "4.6mg");
        apple.put("nutrients", appleNutrients);

        fruits.add(apple);

        LinkedHashMap<String, Object> banana = new LinkedHashMap<>();
        banana.put("name", "Banana");
        banana.put("color", "#FFFF00");

        LinkedHashMap<String, Object> bananaDetails = new LinkedHashMap<>();
        bananaDetails.put("type", "Berry");
        bananaDetails.put("season", "Year-round");
        banana.put("details", bananaDetails);

        LinkedHashMap<String, Object> bananaNutrients = new LinkedHashMap<>();
        bananaNutrients.put("calories", 89);
        bananaNutrients.put("fiber", "2.6g");
        bananaNutrients.put("potassium", "358mg");
        banana.put("nutrients", bananaNutrients);

        fruits.add(banana);


       /* LinkedHashMap<String, Object> orange = new LinkedHashMap<>();
        LinkedHashMap<String, Object> orangeDetails = new LinkedHashMap<>();
        LinkedHashMap<String, Object> orangeNutrients = new LinkedHashMap<>(); */

        payload.put("fruits",fruits);
        System.out.println(payload);

    }

}
