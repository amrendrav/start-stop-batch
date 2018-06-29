package io.spring.batch.controller;

public class JobDetails {
    private String name;
    private String id;
    private String other1;
    private String other2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    @Override
    public String toString() {
        return "JobDetails{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", other1='" + other1 + '\'' +
                ", other2='" + other2 + '\'' +
                '}';
    }
}
