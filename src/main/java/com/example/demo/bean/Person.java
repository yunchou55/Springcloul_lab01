package com.example.demo.bean;

public class Person {
    Integer PersonId;
    String Pname;
    int Page;

    public Person(Integer personId, String pname, int page) {
        PersonId = personId;
        Pname = pname;
        Page = page;
    }

    public Integer getPersonId() {
        return PersonId;
    }

    public void setPersonId(Integer personId) {
        PersonId = personId;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }
}
