package mk.p.builder;

/**
 * This class describes a person model.
 */
public class Person {

    private String firstName;
    private String lastName;
    private String birthYear;
    private String city;
    private String street;
    private String house;
    private String apartment;

    private Person(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        birthYear = builder.birthYear;
        city = builder.city;
        street = builder.street;
        house = builder.house;
        apartment = builder.apartment;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getApartment() {
        return apartment;
    }

    public static final class Builder {
        private String firstName;
        private String lastName;
        private String birthYear;
        private String city;
        private String street;
        private String house;
        private String apartment;

        private Builder() {
        }

        public Builder firstName(String val) {
            firstName = val;
            return this;
        }

        public Builder lastName(String val) {
            lastName = val;
            return this;
        }

        public Builder birthYear(String val) {
            birthYear = val;
            return this;
        }

        public Builder city(String val) {
            city = val;
            return this;
        }

        public Builder street(String val) {
            street = val;
            return this;
        }

        public Builder house(String val) {
            house = val;
            return this;
        }

        public Builder apartment(String val) {
            apartment = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        if (firstName != null) {
            sb.append("firstName='").append(firstName).append('\'');
        }

        if (lastName != null) {
            sb.append(", lastName='").append(lastName).append('\'');
        }

        if (birthYear != null) {
            sb.append(", birthYear='").append(birthYear).append('\'');
        }

        if (city != null) {
            sb.append(", city='").append(city).append('\'');
        }

        if (street != null) {
            sb.append(", street='").append(street).append('\'');
        }

        if (house != null) {
            sb.append(", house='").append(house).append('\'');
        }

        if (apartment != null) {
            sb.append(", apartment='").append(apartment).append('\'');
        }

        sb.append('}');
        return sb.toString();
    }
}