import java.util.HashMap;
import java.util.Map;

public class MapTask {
    private final Map<String, Integer> map = new HashMap();


    public  void addNumber(String key, int value) {
        if (!map.containsKey(key)){
            map.put(key,value);
        } else {
            int valueFromMap=map.get (key);
            if (valueFromMap==value){
                throw new IllegalArgumentException("Совпадают значения");
            }
            else{
                map.put(key,valueFromMap);
            }
        }
    }
}

