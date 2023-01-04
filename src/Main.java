

public class Main {
    public static void main(String[] args) {
        List list = new List();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20));
        }

        list.revert();
    }
}