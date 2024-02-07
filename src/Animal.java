public class Animal {
    public int id;
    public String name;

    public Animal(){}

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void eat(){
        System.out.println("Animal is eating...");
    }
    public void run(){
        System.out.println("Animal is running...");
    }
}
