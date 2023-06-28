package OOP.equalsHash_4_4;

public class EqHasMain {
    public static void main(String[] args) {
        Address address1 = new Address("Moscow", "Green", 1);
        Address address2 = new Address("Moscow", "Green", 1);
        //        Address address2 = address1;

        if (address1.equals(address2)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }

        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());

    }
}
