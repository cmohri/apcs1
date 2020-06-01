public class Greet {
    public static void main (String [] args){

        BigSib richard = new BigSib();
        richard.setHelloMsg("Sup");

        String greeting = richard.greet("mom");
        System.out.println(greeting);
    
    }
}