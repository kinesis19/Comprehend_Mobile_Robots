public class Customer {
    // class field (data)
    public String name;
    public String level;
    public String[] fav;
    public int points;

    public Customer(){ }

    public Customer(String name, String level, String[] fav, int points) {
        this.name = name;
        this.level = level;
        this.fav = fav;
        this.points = points;
    }

    public void displayCustomerInfo(){
        System.out.println(name + "level" + points + "points");
        System.out.print("Favorites: ");
        for (String f: fav) {
            System.out.print(f + " | ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Customer person1 = new Customer();
        person1.name = "John";
        person1.level = "1";
        person1.fav = new String[]{"latte", "americano"};
        person1.points = 100;

        Customer person2 = new Customer("Hee", "2", new String[]{"latte", "americano"}, 100);

        // printing person1 and person2's data
        for(int i = 0; i < 4; i++) {
            System.out.println(person1.name + " " + person1.level + " " + person1.fav[i] + " " + person1.points);

        }
    }
}
