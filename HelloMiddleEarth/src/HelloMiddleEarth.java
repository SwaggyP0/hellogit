
public class HelloMiddleEarth {

    public static void main(String[] args) {
        
        String[] names = { "Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf"};
        
        //prints the names of the people from middle earth
        for(@SuppressWarnings("unused") String n : names) {
            System.out.println("Hello %s!\n" + names);
        }

    }

}
