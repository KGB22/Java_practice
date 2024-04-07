package com.ja.stm.dto;

public class StudentDto {
    private String name;
    private int age;
    private int score;

    public StudentDto(){} // 기본 생성자
    public StudentDto(String name, int age, int score) { // 매개변수를 받는 생성자
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
