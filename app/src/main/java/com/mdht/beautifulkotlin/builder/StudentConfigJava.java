package com.mdht.beautifulkotlin.builder;

public class StudentConfigJava {
    private int id;
    private String name;
    private int grade;
    private int age;
    private String address;
    private String favoriteColor;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    private StudentConfigJava() {
    }

    public static class Builder {
        private int id;
        private String name;
        private int grade;
        private int age;
        private String address;
        private String favoriteColor;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGrade(int grade) {
            this.grade = grade;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setFavoriteColor(String favoriteColor) {
            this.favoriteColor = favoriteColor;
            return this;
        }

        private void apply(StudentConfigJava studentConfigJava) {
            studentConfigJava.address = this.address;
            studentConfigJava.age = this.age;
            studentConfigJava.favoriteColor = this.favoriteColor;
            studentConfigJava.grade = this.grade;
            studentConfigJava.id = this.id;
            studentConfigJava.name = this.name;
        }

        public StudentConfigJava create() {
            StudentConfigJava config = new StudentConfigJava();
            apply(config);
            return config;
        }
    }

}
