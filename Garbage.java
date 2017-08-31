public class Garbage extends Shit {
    private boolean recycable; //getter or not?

    Garbage(String n, Double w, Double p, boolean r) {
        super(n, w, p);
        this.recycable = r;
    }

    public String toString() {
        return super.toString() + ". It's "+ (recycable?"recycable":"not recycable");
    }
}