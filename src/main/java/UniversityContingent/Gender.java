package UniversityContingent;

public enum Gender {
    FEMALE("She"), MALE("He");
        private String sheHe;

    Gender(String sheHe) {
        this.sheHe = sheHe;
    }

    public String getSheHe() {
        return sheHe;
    }

    public void setSheHe(String sheHe) {
        this.sheHe = sheHe;
    }

    @Override
    public String toString() {
        return  sheHe;
    }
}
