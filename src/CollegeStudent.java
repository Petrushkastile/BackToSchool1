public class CollegeStudent extends Student{
    public int year;
    public String major;

    public CollegeStudent(int year,String major,String name,int age,String id_number,Double gpa,String gender) {
        super(name,id_number,gpa,age,gender);
        this.year=year;
        this.major=major;
    }
enum Major {ELECTRICAL_ENGINEERING,COMMUNICATIONS,MATHEMATICAL, LINGUISTIC}

       public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString()+" year=" + year +", major='" + major + '\'';

    }


    }

