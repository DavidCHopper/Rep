public class Soil extends Shit{
    private String solidness;

    Soil(String n, Double w, Double p, String s) {
        super(n, w, p);
        this.solidness = s;
    }

    public String toString() {
        return super.toString() + ". Its solidness is "+ solidness;
    }
}
