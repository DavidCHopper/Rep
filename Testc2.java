
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

class Testc2 {

    public static void main (String args []) {
        int[] sarray = {4,7,3};
        System. out. println ("Which one?");
        Scanner sc = new Scanner(System.in);
        String c ="";
        c = sc.next();
        while (c.equals("q")== false){
            if (c.equals("1")){
                task1(sarray);
            }
            else if (c.equals("2")){
                task2(sarray);
            }
            else if (c.equals("3")){
                task3(sarray);
            }
            else
                System. out. println ("Wrong");
            c = sc.next();
        }
    }

    public static int[] modify (int[] ar,int j) {
        int[] rar = new int[ar.length];
        int k = 0;
        for (int i = 0; i <= j; i++) {
            if (ar[j] > ar[i]) {
                rar[i] = ar[j];
                k--;
            } else {
                rar[i] = ar[i + k];
            }
        }
        for (int i = j + 1; i < ar.length; i++) {
            rar[i] = ar[i];}
        return rar;////
    }

    public static void task1(int[] ar){ // let's say it's a verb
        for (int i = 1; i<ar.length;i++){
            if (ar[i]>ar[i-1])
                System.arraycopy(modify(ar,i),0,ar,0,ar.length);

        }
        System.out.println(Arrays.toString(ar));
        String s = "";
        for (int i = 0; i<ar.length;i++){
            s+=Integer.toString(ar[i]);
            s+=" ";
        }
        System.out.println(s);
    }

    public static void task2(int[] ar){
        int maxx = ar[0];
        int minn = ar[0];
        for (int i = 1; i<ar.length;i++)
            if (ar[i]> maxx)
                maxx = ar[i];
        for (int i = 1; i<ar.length;i++)
            if (ar[i]< minn)
                minn = ar[i];
        System.out.println(maxx+minn);
    }

    public static void task3(int[] ar){
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i<ar.length;i++){
            Integer frequency = hashMap.get(ar[i]);
            hashMap.put(ar[i], frequency == null ? 1 : frequency + 1);
        }
        int maxx = 0;
        int key =0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet())
            if (entry.getValue()>maxx) {
                maxx = entry.getValue();
                key = entry.getKey();
            }
        System.out.println(key);
    }
}