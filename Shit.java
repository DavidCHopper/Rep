public abstract class Shit {
    private String name;
    private Double weight;
    private Double price;

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    Shit(String n, Double w, Double p){
        this.name = n;
        this.weight = w;
        this.price = p;
    }

    public String toString(){
        return this.name + " weighs "+this.weight+" and it costs " + this.price;
    }
}
