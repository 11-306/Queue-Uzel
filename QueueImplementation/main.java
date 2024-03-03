package QueueImplementation;

public class main {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.push(10);
        q.push(2);
        q.push(321);

        System.out.println("Удаленный элемент: " + q.pop());

        q.push(123123);
        q.push(4444);
        q.pop();
        q.pop();

        System.out.println("Первый элемент: " + q.first());

        q.push(999);
        q.push(230);

        System.out.println("Размер: " + q.size());

        q.clear();

        System.out.println("размер: " + q.size());;
    }
}
