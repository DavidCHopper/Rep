public class RottenFood extends Shit{
    private Integer number_of_maggots;

    RottenFood(String n, Double w, Double p, int nom) {
        super(n, w, p);
        this.number_of_maggots = nom;
    }

    public String toString() {
        return super.toString() + ". It has " + number_of_maggots.toString() + " here!";
    }
}
