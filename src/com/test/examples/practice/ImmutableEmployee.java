package com.test.examples.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class ImmutableEmployee {
    private final String name;
    private final List<String> skills;
    private final Date joiningDate;

    public ImmutableEmployee(String name, List<String> skills, Date joiningDate){
        this.name = name;
        this.skills = new ArrayList<>(skills);
        this.joiningDate = new Date(joiningDate.getTime());
    }

    public String getName(){ return name;}
    public List<String> getSkills(){ return Collections.unmodifiableList(skills);}
    public Date getJoiningDate(){return new Date(joiningDate.getTime());}

    public static void main(String[] args) {
        List<String> skills = new ArrayList<>();
        skills.add("Java");

    }

}