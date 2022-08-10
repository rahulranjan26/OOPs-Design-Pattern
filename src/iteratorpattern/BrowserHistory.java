package iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BrowserHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String s) {
        urls.add(s);
    }

    public String pop() {
        var index = urls.size() - 1;
        var ans = urls.get(index);
        urls.remove(index);
        return ans;
    }

    public ListIterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterators {

        private final BrowserHistory history;
        private int count = 0;

        public ListIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (count < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(count);
        }

        @Override
        public void next() {
            count++;
        }
    }


}
