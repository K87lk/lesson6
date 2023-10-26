package user_comparable;

public class User implements Comparable<User>{
    private int age;
    private String name;
    private int height;
    private int weight;

    public User(int age, String name, int height, int weight) {
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
        final StringBuilder sb = new StringBuilder("comparator.User{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(User user) {
        if (this.getHeight() != user.getHeight()) {
            return Integer.compare(this.getHeight(), user.getHeight());
        } else if (this.getWeight() != user.getWeight()) {
            return Integer.compare(this.getWeight(), user.getWeight());
        } else if (!this.getName().equals(user.getName())) {
            return this.getName().compareTo(user.getName());
        } else {
            return Integer.compare(this.getAge(), user.getAge());
        }
    }

}
