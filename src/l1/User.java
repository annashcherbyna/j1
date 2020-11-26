package l1;

public class User {
    private long id;
    private int age;
    private String name ; //null
    private double weight;
    private boolean status;  //false

    //8 version java need

    public User(){

    }

    public User(long id, int age, String name, double weight, boolean status) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "l1.User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", status=" + status +
                '}';
    }
}
