import java.util.LinkedList;

public class LinkedListCircle {
    public static void main(String[] args) {
        int N = 10000;

        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size();
            circle.remove(index);
        }

        System.out.println("Залишилась людина з номером: " + circle.get(0));
    }
}

