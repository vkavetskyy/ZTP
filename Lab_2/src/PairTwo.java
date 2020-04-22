public class PairTwo<T>  implements Cloneable {
    private T first;
    private T second;

    public PairTwo() {
    }

    public PairTwo(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void print() {
        System.out.println(getFirst() + " " + getSecond());
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
