package collection;

import java.util.Arrays;
import java.util.Iterator;

class MyArrayList<E> implements Iterable<E>{
    private Object[] all;
    private int total;

    public MyArrayList(){
        all = new Object[5];
    }

    public void add(E e) {
        ensureCapacityEnough();
        all[total++] = e;
    }

    private void ensureCapacityEnough() {
        if(total >= all.length){
            all = Arrays.copyOf(all, all.length*2);
        }
    }

    //...省略其他代码

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E>{
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor<=total;
        }

        @SuppressWarnings("unchecked")
        @Override
        public E next() {
            return (E) all[cursor++];
        }

    }
}


public class foreach_iterable {
    public static void main(String[] args) {
        MyArrayList<String> my = new MyArrayList<String>();
        my.add("hello");
        my.add("java");
        my.add("world");
        my.add("atguigu");
        my.add("list");
        my.add("data");

        for (String string : my) {
            System.out.println(string);
        }

    }





}
