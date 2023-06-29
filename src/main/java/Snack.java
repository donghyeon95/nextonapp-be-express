public class Snack {
    private String name;
    private int price;
    public Snack(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addPrice(int price){
        this.price += price;
    }
}
