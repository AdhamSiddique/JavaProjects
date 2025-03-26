import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String,String> hashmap){
        for (String x: hashmap.keySet()){
            System.out.println(x);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
    for (String x: hashmap.keySet()){
        if(x.contains(text)){
            System.out.println(x);
        }
    }

    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (String x: hashmap.keySet()){
            if (x.contains(text)){
                System.out.println(hashmap.get(x));
            }
        }
    }


    public static void printValues(HashMap<String,Book> hashMap){
        for (String x: hashMap.keySet()){
            System.out.println(hashMap.get(x));
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (Book l: hashmap.values()){
            if (l.getName().contains(text)){
                System.out.println(l);
            }
        }
    }

}
