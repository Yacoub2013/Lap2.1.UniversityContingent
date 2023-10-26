package UniversityContingent;
import java.util.ArrayList;
public class Person {
    private String name; //фамилия и имя персоны
    private Gender gender;
    private String  faculty;

    public Person(String name, Gender gender, String faculty) {
        this.name = name;
        this.gender = gender;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender.getSheHe() +
                '}';
    }

    public void print() {

        System.out.print("This is " + name+"." );
        System.out.print(gender);




    }
    public static void printALL(ArrayList<Person> personList){
        personList.forEach(Person :: print);
    }


}









