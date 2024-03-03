package QueueImplementation;

public class Queue {
    int[] array;
    int front;
    int rear;
    int capacity;
    Queue(int size){
        array = new int[size];
        front = 0;
        rear = 0;
        capacity = 0;
    }
    public boolean is_Empty(){
        if (capacity < 0){
            return true;
        }
        return false;
    }
    public void push(int index){
        if (capacity == array.length + 1){
            throw new IllegalArgumentException("error");
        }
        array[front] = index;
        front = (front + 1) % array.length;
        capacity++;
    }
    public int first(){
        if (is_Empty()) {
            throw new IllegalArgumentException("error");
        } else {
            return array[rear];
        }
    }
    public int pop(){
        if (is_Empty()){
            throw new IllegalArgumentException("error");
        }
        capacity--;
        return array[rear++];
    }
    public int size(){
        return capacity;
    }
    public void clear(){
        rear = 0;
        front = 0;
        capacity = 0;
    }


}
