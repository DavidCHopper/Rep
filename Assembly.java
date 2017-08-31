import java.util.*;

public class Assembly {
    private Double weight = 0.0;
    private Double price = 0.0;
    List <Shit> group  = new ArrayList<Shit>();

    Assembly (List<Shit> group){
        for (Shit el : group){
            this.weight += el.getWeight();
            this.price += el.getPrice();
            this.group.add(el);
        }
    }

    public String toString(){
        String s = "Assembly consists of:\n";
        for (Shit el : this.group)
            s += el.toString(); //
        s += "\nTotal weight is " + weight.toString();
        s += "\nTotal price is " + price.toString();
        return s;
    }

}
