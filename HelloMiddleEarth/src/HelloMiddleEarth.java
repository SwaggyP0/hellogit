
public class HelloMiddleEarth {

    public static void main(String[] args) {
        
        String[] names = { "Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf", "Talpamir", "Branimir"};
        
        //prints the names of the people from middle earth
        for(int i = 0; i < names.length; i++) {
            System.out.println("Hello %s!\n" + names);
            System.out.println("How are you doing?");
        }

    }

}
