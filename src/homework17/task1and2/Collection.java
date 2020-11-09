package homework17.task1and2;

public class Collection {
    private Object[] ar;

    Collection(Object[] ar) {
        this.ar = ar;
    }

    public static void main(String[] args) {
        Object[] ar = {6, 4, 2, 16, 43, 12};
        Collection collection = new Collection(ar);
        Iterator forwardIterator = collection.runForwardIterator();
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }
        System.out.println("==============================");
        Iterator backwardIterator = collection.runBackwardIterator();
        while (backwardIterator.hasNext()) {
            System.out.println(backwardIterator.next());
        }
    }

    class Forward implements Iterator {

        int i = 0;

        @Override
        public boolean hasNext() {
            return i < ar.length;
        }

        @Override
        public Object next() {
            return ar[i++];
        }
    }

    class Backward implements Iterator {

        int i = ar.length - 1;

        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public Object next() {
            return ar[i -= 1];
        }
    }

    public Iterator runForwardIterator() {
        return new Forward();
    }

    public Iterator runBackwardIterator() {
        return new Backward();
    }

    public void someMethod() {
        class LocalClass {

        }

    }

}
