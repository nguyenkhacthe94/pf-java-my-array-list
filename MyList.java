import java.util.Arrays;

public class MyList<E>  {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    public void add(int index, E element) {
    }

    public E remove(int index) {
        for (int i = index; i < size-1; i++) {
            element[i] = element[i+1];
        }
        size--;
        return (E) element[index];
    }

    public int size() {
        size = element.length;
        return size;
    }

    public boolean contains(E o) {
        boolean isContain = false;
        for (int i = 0; i < size; i++) {
            if (element[i] == o) {
                isContain = true;
                break;
            }
        }
        return isContain;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (element[i] == o) {
                index = i;
            }
        }
        return index;
    }

    public boolean add(E e) {
        if (size == element.length) {
            ensureCapacity(10);
        }
        element[++size] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = element.length + minCapacity;
        element = Arrays.copyOf(element, newSize);
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            element[i] = null;
        }
        size = 0;
    }

}
