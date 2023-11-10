/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author Денис
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

class Student{
    private int id;
    public String name;
    private double score;
    
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public int setId(){
        return id;
    }
    public String setName(){
        return name;
    }
    public double setScore(){
        return score;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }
    
    public class StreamApiExample {
         public static void main(String[] args) {
             List<Student> students = new ArrayList<>();
             students.add(new Student(1,"Artemiy Akhtariev",98.5));
             students.add(new Student(2,"Chichassov Denis", 95.8));
             students.add(new Student(3, "Tokeshov Emil",94.7));
             students.add(new Student(4, "Altayev Temirlan",90.4));
             students.add(new Student(5,"Shingaryov Yaroslav", 94.4));
             students.add(new Student(6, "Rakhimberdieva Alina",99.5));
             students.add(new Student(7,"Nysanov Ernar",89.9));
             students.add(new Student(8,"Sabit Aruzhan",99.3));
             students.add(new Student(9, "Shaukhamanov Dinmukhamed", 88.9));
             students.add(new Student(10,"Tsay Valeriy",95.0));
             double averageScore = students.stream()
                .mapToDouble(Student::getScore)
                .average()
                .orElse(0.0);
        System.out.println("Средняя оценка: " + averageScore);
        Optional<Student> highestScoreStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getScore));
        highestScoreStudent.ifPresent(student -> System.out.println("Студент с высокой оценкой(самой лучшей): " + student.getName()));
         Optional<Student> lowestScoreStudent = students.stream()
                .min(Comparator.comparingDouble(Student::getScore));
        lowestScoreStudent.ifPresent(student -> System.out.println("Студент с низкой оценкой: " + student.getName()));
           List<Student> highScorers = students.stream()
                .filter(student -> student.getScore() > 95)
                .collect(Collectors.toList());
        System.out.println("Студент, у котрого балл > 95: " + highScorers);
        
        List<Student> sortedByScoreDescending = students.stream()
                .sorted(Comparator.comparingDouble(Student::getScore).reversed())
                .collect(Collectors.toList());
        System.out.println("Сортировочка студентов(по оценкам): " + sortedByScoreDescending);
        
        Map<Double, List<Student>> studentsByScore = students.stream()
                .collect(Collectors.groupingBy(Student::getScore));
        System.out.println("Группировочка студентов по баллам(оценкам): " + studentsByScore);
    }
    }
}

//ИСпользовал теоретические знания, материалы из лекции, а также интернет ресурсы: www.javarush.ru и книга автора Васильева.А.Н. "Программирование на Java" Российский компьютерный бестселлер!!! Могу полностью объяснить свой код!!! 