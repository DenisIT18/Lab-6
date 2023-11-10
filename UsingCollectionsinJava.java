/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usingcollectionsinjava;

/**
 *
 * @author Денис
 */


import java.util.*; // Звёздочка означает, что из библиотеки Java импортируются полностью пакеты (packages) и классы 
class UsingCollectionsinJava {
    public static void main(String[] args) {     //Здесь прописываются те коллекции Java, которы будут отображены в коде! По сути, по теории и лекции, сначала прописываю все эти виды данных! 
        testArrayList();
        testLinkedList();
        testHashSet();
        testVector(); 
        testHashMap();
        testTree();
    }
    public static void testArrayList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("x");
        arrayList.add("y");
        System.out.println("ArrayList: " + arrayList);
    }
    public static void testLinkedList() {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Элемент 1");
        linkedList.add("Элемент 2");
        System.out.println("LinkedList: " + linkedList);
    }
   public  static void testHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Element1");
        hashSet.add("Element2");
        System.out.println("HashSet: " + hashSet);
    }

    public static void testVector() {
        List<String> vector = new Vector<>(); // Помимо String, можно использовать другие классы! 
        vector.add("Первый элемент"); 
        vector.add("Второй элемент");
        System.out.println("Vector: " + vector); //Из первого курса, мы использовали тип vector для создания динимамических массивов (а также двумерных) для создания матриц и решения задач по линейной алгебре! 
    }

    public static void testHashMap() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Key1", 1); //Здесь могут быть любые значения, необяазтельно 1 и 2 
        hashMap.put("Key2", 2); //Здесь могут быть любые значения, необяазтельно 1 и 2 
        System.out.println("HashMap: " + hashMap);
    }

    public static void testTree() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Element1");
        treeSet.add("Element2");
        System.out.println("TreeSet: " + treeSet); //древо данных (дерево данных, в теории графов присменяется данное описчание данных) 
    }
}

//В этом коде я прменял теоретические знания,конспкты лекций, сами лекции и интернет ресурсы. От этого кода можно сделать вывод оразных коллекциях в языке программирования Java, их методы. и суть работы. Стоит отметить об иерархии! Анализ всех методов выполнил в виде word файла для того, ятобы вниматлеьно изучить коллекции! 