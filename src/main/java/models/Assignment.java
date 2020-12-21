package models;

import java.time.LocalDate;

public class Assignment {

    private String title;
    private String description;
    private LocalDate subDateTime;
    private int oralMark = 20;
    private int totalMark = 80;

    public Assignment() {
    }

    public Assignment(String t, String d, LocalDate sDT, int oM, int tM) {
        this.title = t;
        this.description = d;
        this.subDateTime = sDT;
        this.oralMark = oM;
        this.totalMark = tM;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Assignment{" + "title= " + title + ", description= " + description + ", subDateTime= " + subDateTime + ", oralMark= " + oralMark + ", totalMark= " + totalMark + '}';
    }

}
