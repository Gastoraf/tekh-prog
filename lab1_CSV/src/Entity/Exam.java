package Entity;

import java.util.Date;

public class Exam extends Testing {

    private int numberOfTickets;
    private String typeOfAssessment;

    public Exam(String teacherName, Date dateTesting, int numberAudience, int numberOfTickets, String typeOfAssessment) {
        super(teacherName, dateTesting, numberAudience);
        this.numberOfTickets = numberOfTickets;
        this.typeOfAssessment = typeOfAssessment;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getTypeOfAssessment() {
        return typeOfAssessment;
    }

    public void setTypeOfAssessment(String typeOfAssessment) {
        this.typeOfAssessment = typeOfAssessment;
    }

}
