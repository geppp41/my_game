package player_scripts;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.*;
import org.json.simple.parser.*;

import items.Item;
@SuppressWarnings("unused")
public class inventory {
    public static void create_inventory(String player_name){
        File myObj = new File("json/data/player_data/inventory/" + player_name+"_inventory.json");
        System.out.println("created file: " + player_name + "_invintory.json" );
        System.out.println(myObj);
    }
    @SuppressWarnings("unchecked")
    public static void add_item_to_inventory(Item item, String player_name) {
        JSONObject jsonObject = new JSONObject();
        String value = String.format("""
                {
                    "quality": %o
                }
                """, item.quality);
        jsonObject.put(item.name, "");
    }
    public static void remove_item_from_inventory(Item item, String player_name){
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(String.format("json/data/player_data/inventory/%s.json", player_name)));
            JSONObject jsonObject = (JSONObject)obj;
            jsonObject.remove(item.name);
        } catch (IOException | ParseException e) {
            
            e.printStackTrace();
        }

    }
}
