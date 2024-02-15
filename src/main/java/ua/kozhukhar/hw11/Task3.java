package ua.kozhukhar.hw11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void addElementsToLists() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTimeArrayList = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long endTimeArrayList = System.nanoTime();
        System.out.println("Time taken to add 1000000 elements to ArrayList: " + (endTimeArrayList - startTimeArrayList) + " nanoseconds");

        LinkedList<Integer> linkedList = new LinkedList<>();
        long startTimeLinkedList = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        long endTimeLinkedList = System.nanoTime();
        System.out.println("Time taken to add 1000000 elements to LinkedList: " + (endTimeLinkedList - startTimeLinkedList) + " nanoseconds");
    }

    public static void selectRandomElements(List<Integer> list) {
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = random.nextInt(list.size());
            list.get(randomIndex);
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken to select 1000000 random elements: " + (endTime - startTime) + " nanoseconds");
    }

    public static void main(String[] args) {
        addElementsToLists();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        selectRandomElements(arrayList);
        selectRandomElements(linkedList);
    }
}
