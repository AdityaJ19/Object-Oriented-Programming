package Generics.Comparing;

public class Students implements Comparable<Students> {
    String name;
    float rollno;

    public Students(String name, float rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return rollno + " ";
    }

    @Override
    public int compareTo(Students o) {
        int diff = (int)(this.rollno - o.rollno);
        // if diff = 0; both are same
        //if diff < 0; o is bigger else o is smaller
        return diff;
    }
}
