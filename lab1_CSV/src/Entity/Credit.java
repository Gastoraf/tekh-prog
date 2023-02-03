package Entity;

import java.util.Date;

public class Credit extends Testing {

    private boolean typeGrade;


    public Credit(String teacherName, Date dateTesting, int numberAudience, boolean typeGrade) {
        super(teacherName, dateTesting, numberAudience);
        this.typeGrade = typeGrade;
    }

    public boolean isTypeGrade() {
        return typeGrade;
    }

    public void setTypeGrade(boolean typeGrade) {
        this.typeGrade = typeGrade;
    }
}
