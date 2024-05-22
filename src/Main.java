public class Main {
    public static void main(String[] args) {

        LinkedList newLinked = new LinkedList(0);
        newLinked.get(1);
        newLinked.get(2);
        newLinked.get(3);
        newLinked.Prepend(4);
        newLinked.removeFirst(2);
         newLinked.set(1,4);

        System.out.println(newLinked);
    }
}