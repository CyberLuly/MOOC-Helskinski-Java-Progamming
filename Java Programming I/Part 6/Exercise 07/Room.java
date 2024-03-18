import java.util.ArrayList;

public class Room {

    private ArrayList<Person> person;

    public Room() {
        this.person = new ArrayList<>();
    }

    public void add(Person person) {
        this.person.add(person);
    }

    public boolean isEmpty() {
        return this.person.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.person;
    }

    public Person shortest() {
        if (this.person.isEmpty()) {
            return null;
        }

        Person shortest = this.person.get(0);
        for (Person persons : this.person) {
            if (persons.getHeight() < shortest.getHeight()) {
                shortest = persons;
            }
        }
        return shortest;
    }

    public Person take() {
        Person shortest = this.shortest();
        this.person.remove(shortest);
        return shortest;
    }


}
