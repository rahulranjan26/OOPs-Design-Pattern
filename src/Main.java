import iteratorpattern.BrowserHistory;
import iteratorpattern.Iterators;
import observerpattern.Chart;
import observerpattern.DataSource;
import observerpattern.SpreadSheet;
import statepattern.BrushTool;
import statepattern.SelectionTool;
import statepattern.Tool;
import statepattern.UIControls;
import strategypattern.CompressorJPEGClass;
import strategypattern.CompressorPNGClass;
import strategypattern.EditClass;
import strategypattern.FilterBAndWClass;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        StatePattern
        Tool brush = new BrushTool();
        Tool select = new SelectionTool();
        UIControls control = new UIControls(brush);
        control.mousedown();
        control.mouseup();
        */

        /*
         Strategy Pattern ==> Important

        EditClass edit = new EditClass(new CompressorPNGClass(),new FilterBAndWClass());
        EditClass edit2 = new EditClass(new CompressorJPEGClass(),new FilterBAndWClass());
        edit.store("a");
        edit2.store("b");
         */

        /*
        Iterator Pattern

        BrowserHistory history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterators iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
         */

        /*
         * Observer Pattern
         *
         *
         */
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();
        var chart = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.notifyObservers();


    }
}