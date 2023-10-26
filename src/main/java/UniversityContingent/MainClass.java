package UniversityContingent;
import java.util.ArrayList;




public class MainClass {
    public static void main(String[] args) {

        Person professor1 = new Professor("Ronald Turner",Gender.MALE,"Computer science",AcademicDegree.DOCTOR,"'Programming paradigm'");
        Person professor2 = new Professor("Ruth Hollings",Gender.FEMALE," Jurisprudence ",AcademicDegree.PHD," 'Domestic atbitration'");
        Person student1 = new Student("Leo Wilkinson",Gender.MALE," Computer science ",DegreeOfStudy.BACHELOR,3);
        Person student2 = new Student("Anna Cunningam ",Gender.FEMALE," World economy ",DegreeOfStudy.MASTER,1);
        Person student3 = new Student("Jill Lundqvist ", Gender.FEMALE," Jurisprudence ",DegreeOfStudy.MASTER,1);
        Person student4  = new Student("Ronald Correa ",Gender.MALE," Computer science "," 'Design of a functional programming language' ");
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(professor1);
        personList.add(professor2);
        personList.add(student1);
        personList.add(student2);
        personList.add(student3);
        personList.add(student4);
        Person.printALL(personList);

            /*






            ArrayList<Person> personList = new ArrayList<>();

            personList.add(professor1);
            personList.add(professor2);
            personList.add(student1);
            personList.add(student2);
            personList.add(student3);
            personList.add(student4);

            Person.printALL(personList);


        } */
    }
}

