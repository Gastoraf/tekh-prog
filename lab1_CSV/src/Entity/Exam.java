package Entity;

public class Exam extends Testing {

    private int numberOfTickets;
    private int grade;
    private String type;

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isHavePractice() {
        return havePractice;
    }

    public void setHavePractice(boolean havePractice) {
        this.havePractice = havePractice;
    }
}
