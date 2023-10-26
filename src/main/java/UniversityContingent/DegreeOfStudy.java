package UniversityContingent;

public enum DegreeOfStudy {
    BACHELOR("bachelor"), MASTER("master");
    private String degreeOfStudy;

    DegreeOfStudy(String degreeOfStudy) {
        this.degreeOfStudy = degreeOfStudy;
    }

    public String getDegreeOfStudy() {
        return degreeOfStudy;
    }

    public void setDegreeOfStudy(String degreeOfStudy) {
        this.degreeOfStudy = degreeOfStudy;
    }

    @Override
    public String toString() {
        return  degreeOfStudy;
    }
}
