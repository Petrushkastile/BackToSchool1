import java.util.Random;

public class Student extends Person {
    private String id_number;
    private double gpa;

    public Student(String name,String id_number,double gpa, int age, String gender) {
        super( name, age, gender );
        this.gpa=gpa;
        this.id_number=id_number;
    }



    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +" id_number='" + id_number + '\'' +", gpa=" + gpa ;


    }


}
