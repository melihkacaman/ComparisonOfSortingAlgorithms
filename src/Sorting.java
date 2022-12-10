public interface Sorting<T extends Comparable<T>> {
    void run(T[] list, int size);
}
