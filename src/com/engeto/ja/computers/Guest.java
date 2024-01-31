package com.engeto.ja.computers;

import java.time.LocalDate;

public class Guest {
    private String name;

    private LocalDate birthdate;

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate(String date) {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Guest(String name, LocalDate birthdate) {

    }

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirthdate(String date) {
    }

//    public boolean getBirthdate(String LocalDate) {
//        boolean LocalDate = false;
//        return LocalDate;
//    }


//    public <Malikova> void setName(String Malikova) {
//    }
}