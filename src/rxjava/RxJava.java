/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rxjava;
 
import java.util.Arrays;
import java.util.List;
import rx.Observable;
import rx.functions.Action1;

/**
 *
 * @author Maruf
 */
public class RxJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> elements = Arrays.asList("One", "Two", "Three", "Four");
        Observable<String> observable = Observable.from(elements);

        observable.subscribe(new Action1<String>() {  
            @Override
            public void call(String element) {
                System.out.println(element); 
            }
        });

    }

}
