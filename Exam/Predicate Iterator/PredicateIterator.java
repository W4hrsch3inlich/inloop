import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class PredicateIterator<T> implements Iterator<T>{
    private Iterator<T> iter;
    private Predicate<T> predicate;

    public PredicateIterator(Iterator<T> iter, Predicate<T> predicate) {
        if(iter == null || predicate == null) throw new NullPointerException();
        this.iter = iter;
        this.predicate = predicate;
    }

    public boolean hasNext() {
        boolean r = false;
        ArrayList<T> array = new ArrayList<T>();
        T current;
        while(iter.hasNext()) {
            current = iter.next();
            array.add(current);
            if(predicate.test(current)) r = true;
        }
        iter = array.iterator();
        return r;
    }

    public T next() {
        T current;
        while(iter.hasNext()) {
            current = iter.next();
            if(predicate.test(current)) return current;
        }
        throw new NoSuchElementException();
    }
}
