package read_and_write_files;

import java.io.Serializable;

public class Person implements Serializable {


    private static final long serialVersionUID = -8124335881216848253L;

    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(){

    }

    public Person(String name, String lastName) {
        setName(name);
        setLastName(lastName);
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
