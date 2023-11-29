package g.gk.detest.bt2;

import java.util.ArrayList;
import java.util.List;

public class DicList<T> implements ListInterface<T> {
    private List<T> dataList;

    public int indexOf(T a) {
        return dataList.indexOf(a);
    }

    public DicList() {
        dataList = new ArrayList<>();
    }

    @Override
    public void add(T data) {
        dataList.add(data);
    }

    @Override
    public T get(int i) {
        return dataList.get(i);
    }

    @Override
    public int size() {
        return dataList.size();
    }

    @Override
    public boolean isEmpty() {
        return dataList.isEmpty();
    }
}