/**
 * Created by Lenovo on 3/6/2022.
 */
public class LAB6QH<E> {

    SingleyLinkedList<E> queue=new SingleyLinkedList<E>();


    public int size(){
        return this.queue.size();
    }
    public E frist(){
        return this.queue.first();
    }

    public void enqueue (E element){
        this.queue.addlast(element);
    }
    public  E dequeue(){
        return this.queue.removefirst();
    }

    public LAB6QH(SingleyLinkedList<E> queue) {
        this.queue = queue;
    }

    public SingleyLinkedList<E> getQueue() {
        return queue;
    }

    public void setQueue(SingleyLinkedList<E> queue) {
        this.queue = queue;
    }

    public class  SingleyLinkedList{
        public void isEmpty() {
            boolean empty;
        }

        public int size() {
            return 0;
        }

        public E first() {
        }

        public void addlast(E element) {
        }

        public E removefirst() {
        }
    }
    public boolean isEmpty(){
        return this.queue.isEmpty();
    }
    }
}
