package org.prototypes;

/**
 * Created by Robert Szczygielski on 17.11.16.
 */
public class CustomerPrototype {
    private String name;
    private boolean hasName;
    private Integer age;
    private boolean hasAge;

    public CustomerPrototype useName(String name) {
        this.name = name;
        this.hasName = true;
        return this;
    }

    public CustomerPrototype useAge(Integer age) {
        this.age = age;
        this.hasAge = true;
        return this;
    }

    public String getName() {
        return name;
    }

    public boolean ifHasName() {
        return hasName;
    }

    public Integer getAge() {
        return age;
    }

    public boolean ifHasAge() {
        return hasAge;
    }
}
