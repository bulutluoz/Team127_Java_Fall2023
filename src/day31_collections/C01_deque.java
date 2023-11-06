package day31_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_deque {

    public static void main(String[] args) {

        Deque<String> harfler = new LinkedList<>();
        harfler.add("g");
        harfler.add("K");
        harfler.add("A");
        System.out.println(harfler); // [g, K, A]

        System.out.println(harfler.add("e")); // true
        harfler.addLast("K");
        harfler.addFirst("A");

        System.out.println(harfler); // [A, g, K, A, e, K]

        System.out.println(harfler.removeLastOccurrence("A")); // true
        System.out.println(harfler); // [A, g, K, e, K]

        System.out.println(harfler.removeLastOccurrence("X")); // false

        // harfler.remove(); ilk elementi siler
        // harfler.remove("A"); A'nin ilk kullanimini siler
        // harfler.removeFirst(); ilk elementi siler
        // harfler.removeFirstOccurrence("A"); // A'nin ilk kullanimini siler

        //System.out.println(harfler.poll()); // A
        System.out.println(harfler.pollFirst()); // A
        System.out.println(harfler); // [g, K, e, K]


        Deque<String> bosDeque = new LinkedList<>();
        // bosDeque.remove(); // NoSuchElementException
        // bosDeque.removeFirst(); // NoSuchElementException
        System.out.println(bosDeque.poll()); // null
        System.out.println(bosDeque.pollFirst()); // null


        // System.out.println(harfler.removeLast()); // K
        // System.out.println(harfler.removeLastOccurrence("K")); // true
        System.out.println(harfler.pollLast()); // K

        System.out.println(harfler); // [g, K, e]

        System.out.println(harfler.element()); // g
        System.out.println(harfler); // [g, K, e]
        // System.out.println(bosDeque.element()); // NoSuchElementException
        // ilk elemanini silmeden bize getirir.bulamazsa exception firlatir

        System.out.println(harfler.peek()); // g
        System.out.println(bosDeque.peek()); // null

        System.out.println(harfler.pop()); // g
        // removeFirst() ile aynidir
        System.out.println(harfler); // [K, e]

        harfler.push("A");
        // basa element ekler
        // addFirst()'den farkli olarak
        // eger deque icin bir eleman sinirlamasi varsa
        // ve o sinir asiliyirsa IllegalStateException  verir

        System.out.println(harfler); // [A, K, e]
        System.out.println(harfler.offer("R")); // true
        System.out.println(harfler); // [A, K, e, R]
        // add ile ayni islemi yapar
        // ama kapasite sinirlamasi olan durumlarda
        // kapasite asilirsa, eklemek yerine exception firlatir



    }
}
