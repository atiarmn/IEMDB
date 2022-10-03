package IEMDBClasses;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Actor {
    private int id;
    private String name;
    private String birthDate;
    private String nationality;

    public int getId(){
        return id;
    }

    public String getBirthday() { return birthDate; }

    public String getNationality() { return nationality; }

    public String getName(){
        return name;
    }

    public int getAge(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate today = LocalDate.now();
        dtf.format(today);
        LocalDate birthday = LocalDate.parse(birthDate);
        Period p = Period.between(birthday, today);
        return p.getYears();
    }
}