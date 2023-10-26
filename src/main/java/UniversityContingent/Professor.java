package UniversityContingent;

public class Professor extends Person {
    private AcademicDegree academicDegree;
    private String speciality;


    public Professor(String name, Gender gender, String faculty, AcademicDegree academicDegree, String speciality) {

        super(name, gender, faculty);
        this.academicDegree = academicDegree;
        this.speciality = speciality;
    }

    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(AcademicDegree academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "academicDegree=" + academicDegree.getAcademicDegree() +
                '}';
    }

    public void print(){
        super.print();
        System.out.print(" teachers at "+ getFaculty()+ ".");
        System.out.print(getGender());
        System.out.println(" has "+getAcademicDegree()+" degree in "+ getSpeciality()+ ".");
    }
}



