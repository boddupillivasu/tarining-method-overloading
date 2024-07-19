package com.training.java;

public class MethodOverLoading {

    public void student(String name) {

        System.out.println("the student name:" + name);

    }

    public void student(String name, int id) {
        System.out.println("the student name:" + name + "student id :" + id);

    }

    public void student(String name, int id, String branch) {
        System.out.println("the student name:" + name + " student id:" + id + " student branch:" + branch);

    }

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading;
        methodOverLoading = new MethodOverLoading();
        methodOverLoading.student("vasu");
        methodOverLoading.student("rami reddy", 14);
        methodOverLoading.student("bharath", 13, "ece");

    }
}
