package Day9;

class Professor {

    String name;

    Professor(String name) {
        this.name = name;
    }
}

class College {

    String collegeName;
    Professor professor;

    College(String collegeName, Professor professor) {
        this.collegeName = collegeName;
        this.professor = professor;
    }

    void display() {
        System.out.println("College : " + collegeName);
        System.out.println("Professor : " + professor.name);
    }
}

public class CollegeAggregation {

    public static void main(String[] args) {

        Professor p = new Professor("Ravi");

        College c = new College("ABC College", p);

        c.display();
    }
}