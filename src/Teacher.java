public class Teacher extends Person {

    private double salary;
    private String sabject;


    public Teacher(String name, int age, String gender, double salary, String sabject) {
        super( name, age, gender );
        this.salary = salary;
        this.sabject = sabject;
    }

enum Sabject {COMPUTER, SCIENCE, CHEMISTRY,ENGLISH,BIOLOGY,MATHEMATICS}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSabject() {
        return sabject;
    }

    public void setSabject(String sabject) {
        this.sabject = sabject;
    }


    @Override
    public String toString() {
        return super.toString()+" salary=" + salary +", sabject' " + sabject + '\'';
    }




}
