package generics;

public class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Tom", "Grey", "Pet");
        Animal dog = new Animal("Buddy", "Brown", "Pet");
        Animal tiger = new Animal("Shera", "Orange", "Wild");

        System.out.println("Hash code for cat: " + cat.hashCode());
        System.out.println("Hash code for dog: " + dog.hashCode());
        System.out.println("Hash code for tiger: " + tiger.hashCode());
    }
}
