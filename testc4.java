import java.util.*;

public class testc4 {
    private static List<String>keys = new ArrayList<>();
    private static List<Integer>values = new ArrayList<>();
    private static Integer rcounter =0;

    public static void main (String args []) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("wasd", 3);
        //hashMap.put("qwerty", 2);
        hashMap.put("ghu", 8);
        //hashMap.put("ghj", 1);

        rate(hashMap);
        System.out.println("_______________________________");
        rate2(hashMap);
        System.out.println("_______________________________");
        rate3(hashMap,hashMap.size());
        /*for(int i = 0;i<keys.size();i++){
            System.out.print(keys.get(i));
            System.out.println(values.get(i));
        }*/

    }

    /*private static void xrate (Map<String,Integer> hashMap,int i){
        Map<String, Integer> hashmap = new HashMap<>(hashMap);
        switch (i){
            case 1 :
                rate(hashmap);
                break;
            case 2:
                rate2(hashmap);
                break;
            case 3:
                rate3(hashmap);
                break;
        }

    }*/

    private static void rate (Map<String,Integer> hashMap){
        Map<String, Integer> hashmap = new HashMap<>(hashMap);
        int minn;
        try {
            minn = Collections.max(hashmap.values());
        }catch (NoSuchElementException e){return;}
        String key = "";
        List<String> cont = new ArrayList<String>();
        List<Integer> cont2 = new ArrayList<Integer>();
        //int val=0;
        for (Map.Entry<String, Integer> entry : hashmap.entrySet())
            if (entry.getValue() <= minn) {
                minn = entry.getValue();
                key = entry.getKey();
            }
        cont.add(key);
        cont2.add(hashmap.get(key));

        //if (key.equals("") == false) {
            hashmap.remove(key);
            rate(hashmap);
            for (int el : cont2) {
                System.out.println(el);
            }
        //}

    }

    private static void rate2 (Map<String,Integer> hashMap){ //it's better to have one method for sorting with parameter for showing names as well
        Map<String, Integer> hashmap = new HashMap<>(hashMap);
        int minn;
        try {
            minn = Collections.max(hashmap.values());
        }catch (NoSuchElementException e){return;}
        String key = "";
        List<String> cont = new ArrayList<String>();
        List<Integer> cont2 = new ArrayList<Integer>();
        //int val=0;
        for (Map.Entry<String, Integer> entry : hashmap.entrySet())
            if (entry.getValue()<=minn) {
                minn = entry.getValue();
                key = entry.getKey();
            }
        cont.add(key);
        cont2.add(hashmap.get(key));
        //if (key.equals("")==false) {
            hashmap.remove(key);
            rate2 (hashmap);
            for (int i=0; i< cont.size(); i++){
                System.out.print(cont.get(i)+" ");
                System.out.println(cont2.get(i));
            }
        //}
    }

    private static void rate3 (Map<String,Integer> hashMap, int hsize){
        Map<String, Integer> hashmap = new HashMap<>(hashMap);
        int top=3;
        int maxx =0;
        String key = "";
        List<String> cont = new ArrayList<String>();
        List<Integer> cont2 = new ArrayList<Integer>();
        //int val=0;
        for (Map.Entry<String, Integer> entry : hashmap.entrySet())
            if (entry.getValue()>maxx) {
                maxx = entry.getValue();
                key = entry.getKey();
                //System.out.println(hashmap.get(key));
            }
        /*cont.add(key);
        cont2.add(hashmap.get(key));*/
        if (key.equals("")==false) {
            cont.add(key);
            cont2.add(hashmap.get(key));
            rcounter++;
            hashmap.remove(key);
            rate3(hashmap,hsize);

            try {
                for (int i = 0; i < 1; i++) {
                    keys.add(cont.get(i));
                    values.add(cont2.get(i));
                    //System.out.print(cont.get(i) + " ");
                    //System.out.println(cont2.get(i));
                }
            } catch (ArrayIndexOutOfBoundsException exception) {}
        }
        if (keys.size() == hsize)
        {

            for(int i = 0; i < top; i++){

                System.out.print(keys.get(keys.size()-1-i));
                System.out.println(values.get(values.size()-1-i));
            }
        }
    }
}
