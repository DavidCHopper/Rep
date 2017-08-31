import java.util.*;

public class Testc3 {

    public static void main (String args []) {
        List<Shit> toas = new ArrayList<>();

        toas.add(new Garbage("junk1",4.0,0.5,false));
        toas.add(new Garbage("junk2",5.0,1.5,true));
        toas.add(new RottenFood("beef",4.0,6.0,7));
        toas.add(new RottenFood("fish",2.0,5.0,13));
        toas.add(new Soil("mud",8.0,1.0,"pretty solid"));
        Assembly as = new Assembly(toas);
        System.out.println(as);
    }
}
