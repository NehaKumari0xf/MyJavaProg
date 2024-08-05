class Person {
    private String name;
    private String gender;
    private String mobile;

    public Person(String name, String gender, String mobile) {
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
    }
    // Getter methods
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }
}

// inhrit student class from person
class Student extends Person {
    private String clas; 

    public Student(String name, String gender, String mobile, String clas) {
        super(name, gender, mobile);
        this.clas = clas;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
}
