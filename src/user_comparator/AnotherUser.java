package user_comparator;


public class AnotherUser{
    private int age;
    private String name;
    private int height;
    private int weight;

    public AnotherUser(int age, String name, int height, int weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("comparator.AnotherUser{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}

