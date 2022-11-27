import java.util.*;

public class MapTask2 {
    private final Map<String, List<Integer>> mapList = new HashMap<>();

    public MapTask2() {
        for (int i = 0; i < 5; i++) {
            mapList.put(String.valueOf(i),generateList());
        }
    }
    public Set<Map.Entry<String,List<Integer>>> getOrgiginalMapEntries(){
        return mapList.entrySet();

    }
    public Map <String,Integer> getTransformedCollection(){
        Map<String,Integer> result =new HashMap<>();
        for (Map.Entry <String,List <Integer>> entry:mapList.entrySet()){
            int sum=0;
            for (Integer numbers:
                 entry.getValue()) {
                sum +=numbers;
            }
            result.put(entry.getKey(), sum);
        }
        return result;
    }

    private List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add((int) (Math.random() * 1001));
        }
        return list;
    }
}
