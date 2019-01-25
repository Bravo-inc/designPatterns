package mk.p.builder;

public class Test {

    public static void main(String [] args){
        Person myPerson = Person.newBuilder()
                .firstName("MR")
                .lastName("Anderson")
                .city(" The Matrix")
                .build();
        System.out.println(myPerson);
    }
}