package org.itstep.model;

import java.util.*;

public class CollectionRunner {
    public static void main(String[] args) {
        String str0 = "abc0";
        String str1 = "abc1";
        String str2 = "abc2";
        String str3 = str0;

        List<String> stringList = new ArrayList<>();
        stringList.add(str0);
        stringList.add(str1);
        stringList.add(str2);
        stringList.add(str3);

        System.out.println("List has size " + stringList.size());

        Set<String> stringSet = new HashSet<>(stringList);

        System.out.println("Set has size " + stringSet.size());

        Queue<String> stringQueue = new PriorityQueue<>(stringList);

        System.out.println("Queue has size " + stringQueue.size());

        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(i + " box has value " + element + " and Type " + element.getClass().getSimpleName());
        }

        int i = 0;
        while (i < stringList.size()) {
            String element = stringList.get(i);
            System.out.println(i + " box has value " + element + " and Type " + element.getClass().getSimpleName());
            i++;
        }

        i = 0;
        do{
            String element = stringList.get(i);
            System.out.println(i + " box has value " + element + " and Type " + element.getClass().getSimpleName());
            i++;
        } while (i < stringList.size());
    }
    }
