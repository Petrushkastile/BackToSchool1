import java.util.Random;

public class Dvornik {
Random random=new Random();


    private  int age=random.nextInt( 20 )+35;
    String[] names = {"Olivia", "Mason", "Ava", "Sophia", "Isabella", "Charlotte", "Amelia", "Emily", "Madison", "Harper",
            "Ethan", "Logan", "Lucas", "Mia", "Jackson", "Aiden", "Oliver", "Jacob", "Elijah", "Alexander", "Abigail", "Avery",
            "James", "Benjamin", "Lily", "Ella", "Jack", "Chloe", "Luke"};
    private  String name= names [random.nextInt(28 )+1];


    @Override
    public String toString() {
        return "Dvornik:" +
                " age=" + age +
                " name="+name;
    }}




