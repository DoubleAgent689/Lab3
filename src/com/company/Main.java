package com.company;

import java.util.*;


public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static LinkedList<GetSet> collections = new LinkedList<GetSet>();
    private static String name = "";
    private static int intrParphCount = 0;
    private static ArrayList<Integer> paragraphCount = new ArrayList<Integer>();
    private static ArrayList<Integer> paragraphCount2 = new ArrayList<Integer>();
    private static ArrayList<Integer> paragraphCount3 = new ArrayList<Integer>();
    private static ArrayList<Integer> paragraphCount4 = new ArrayList<Integer>();

    public static void main(String[] args){


        var Book1 = new List2();
        var Book2 = new List2();
        var StudyBook1 = new List1();
        var StudyBook2 = new List1();

        try {
            Book1.setParagraphСount(paragraphCount);
            paragraphCount.add(10);
            Book1.setName("Book#1");
            Book1.setIntrParphCount(1);
            collections.add(Book1);


            Book2.setParagraphСount(paragraphCount2);
            paragraphCount2.add(15);
            Book2.setName("Book#2");
            Book2.setIntrParphCount(3);
            collections.add(Book2);

            StudyBook1.setParagraphСount(paragraphCount3);
            paragraphCount3.add(25);
            StudyBook1.setName("StudyBook#1");
            StudyBook1.setIntrParphCount(2);
            collections.add(StudyBook1);

            StudyBook2.setParagraphСount(paragraphCount4);
            paragraphCount4.add(12);
            StudyBook2.setName("StudyBook#2");
            StudyBook2.setIntrParphCount(4);
            collections.add(StudyBook2);
        }

        catch (WrongParException ex)
        {
            System.err.println(ex.getMessage());
        }

        System.out.println(collections.get(0).paragraphCountWithoutIntr(0));

        var map = new HashMap<Integer, LinkedList<GetSet>>();
        int key;
        for (GetSet col : collections) {
            key = col.paragraphCountWithoutIntr(0);
            if (map.containsKey(key)) {
                map.get(key).add(col);
            } else {
                var list = new LinkedList<GetSet>();
                list.add(col);
                map.put(key, list);
            }
        }

        System.out.println("map");
        System.out.println(map);

        var sbornikCitat = new LinkedList<List2>();
        var sbornikAnekdotov = new LinkedList<List1>();
        for (GetSet col : collections) {
            if (col instanceof List2) {
                sbornikCitat.add((List2) col);
            }

            else if (col instanceof List1) {
                sbornikAnekdotov.add((List1) col);
            }
        }

        System.out.println("List1");
        System.out.println(sbornikCitat);
        System.out.println("List2");
        System.out.println(sbornikAnekdotov);
    }
}