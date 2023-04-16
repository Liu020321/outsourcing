package com.outsourcing.pojo;

public class patient {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public patient(String name, String sex, int age, String symptom,String status) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.symptom = symptom;
        this.status=status;
    }

    public patient() {
        super();
    }

    private String name;
    private String sex;
    private int age;
    private String symptom;
    private String status;

}
