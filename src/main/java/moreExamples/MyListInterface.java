package moreExamples;


public interface MyListInterface<T> {
    public int size();
    public T get(int place);
    public void set(int place, T value);
    public void add( T value);
}
