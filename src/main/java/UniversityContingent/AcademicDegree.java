package UniversityContingent;

public enum AcademicDegree {
    CANDIDATE("candidate"), DOCTOR("Ph.D"),PHD("PhD");
    private String academicDegree;

    AcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return  academicDegree;
    }
}
