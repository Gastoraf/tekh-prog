package Entity;

import java.util.Date;

public abstract class Testing {

    private String teacherName;
    private Date dateTesting;
    private int numberAudience;

    public Testing(String teacherName, Date dateTesting, int numberAudience) {
        this.teacherName = teacherName;
        this.dateTesting = dateTesting;
        this.numberAudience = numberAudience;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getDateTesting() {
        return dateTesting;
    }

    public void setDateTesting(Date dateTesting) {
        this.dateTesting = dateTesting;
    }

    public int getNumberAudience() {
        return numberAudience;
    }

    public void setNumberAudience(int numberAudience) {
        this.numberAudience = numberAudience;
    }
}
