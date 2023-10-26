package UniversityContingent;

public class Student extends Person{
    private DegreeOfStudy degreeOfStudy;

    private int courseNum;  //номер курса
    private String dissertationTopic; // тема дисертации, если аспирант


    public Student(String name, Gender gender, String faculty, String dissertationTopic) {
        super(name, gender, faculty);

        this.dissertationTopic = dissertationTopic;
    }

    public Student(String name, Gender gender, String faculty, DegreeOfStudy degreeOfStudy, int courseNum) {
        super(name, gender, faculty);
        this.degreeOfStudy = degreeOfStudy;
        this.courseNum = courseNum;

    }

    public DegreeOfStudy getDegreeOfStudy() {
        return degreeOfStudy;
    }

    public void setDegreeOfStudy(DegreeOfStudy degreeOfStudy) {
        this.degreeOfStudy = degreeOfStudy;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public String getDissertationTopic() {
        return dissertationTopic;
    }

    public void setDissertationTopic(String dissertationTopic) {
        this.dissertationTopic = dissertationTopic;
    }

    @Override
    public String toString() {
        return "Student{" +
                "degreeOfStudy=" + degreeOfStudy.getDegreeOfStudy() +
                '}';
    }

    public void print(){
        super.print();
        System.out.print(" studies at "+ getFaculty()+ ".");
        if(courseNum!=0 ){
            System.out.print(getGender());
        System.out.println(" is " + getCourseNum()+ " th year "+ getDegreeOfStudy()+ " student.") ;
    }else{
            System.out.print(getGender());
            System.out.println(" dissertation topic" +dissertationTopic);}
    }


}




