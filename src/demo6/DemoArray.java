package demo6;

import java.util.AbstractList;
import java.util.Objects;
import java.util.RandomAccess;

/**
 * User: van
 * Date: 2020-07-08
 * Time: 13:41
 */
public class DemoArray<E> extends AbstractList<E>
        implements RandomAccess, java.io.Serializable{

    private final E[] a;

    DemoArray(E[] array) {
        a = Objects.requireNonNull(array);
    }



    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
