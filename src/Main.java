
public class Main {

    public static void main (String[]args){

        Dvornik dvornik = new Dvornik();

            System.out.println(dvornik);

        Person person = new Person("Vasia",23,"m"  );

        System.out.println(person);
        Student student = new Student( "Жека","20",1.88,25, "m");
        System.out.println(student);
        Teacher teacher = new Teacher( "Вася",34,"m",2555.0,"Computers" );
        System.out.println(teacher);
        CollegeStudent collegeStudent = new CollegeStudent(23,"Математический","Петро",23,"23",3.44,"m");
        System.out.println(collegeStudent);

}


}

//        String name;
//public void getName() {
//

//
//
//
