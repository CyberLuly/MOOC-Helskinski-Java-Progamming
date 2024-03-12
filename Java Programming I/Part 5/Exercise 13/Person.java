
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person comparedObj = (Person) obj;
        if (this.name.equals(comparedObj.name) &&
                this.birthday.equals(comparedObj.birthday) &&
                this.height == comparedObj.height &&
                this.weight == comparedObj.weight) {
            return true;
        }
        return false;

    }
}
