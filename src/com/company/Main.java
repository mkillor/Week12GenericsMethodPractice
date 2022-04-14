package com.company;

import java.util.ArrayList;
import java.util.List;





public class Main {
    public static void main(String[] agrs) {

        genericDisplay(5);
        genericDisplay("Software Dev");
        genericDisplay(true);


}
    static <E> void genericDisplay(E o){
        System.out.println(o);
        System.out.println(o.getClass().getSimpleName());
    }


}