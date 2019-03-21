/*
아래와 같이 출력되도록 printAll 메소드를 구현하라.
먼저 반복문으로 printAll 메소드를 구현해 보고,
그 다음 재귀 호출로 다시 구현하라.
출력 : 10 9 8 7 6 5 4 3 2 1
구현한 메소드의 시간 복잡도는?
 */
package Algorithm_01_recursive;

public class recursive_printAll {

    static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public void printAll() {
            System.out.printf("%d ", this.value);
            if (next != null) next.printAll();
        }
    }

    public static void main(String[] args) {
        Node root = null;
        for (int i = 1; i <= 10; ++i)
            root = new Node(i, root);
        root.printAll();
    }
}

