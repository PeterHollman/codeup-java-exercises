package grades;

import java.util.ArrayList;

public class student {

    private String name;
    private ArrayList<Integer> grades;

    public student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
            double total = 0;
        for(int i=0; i<grades.size(); i++){
             total = total + grades.get(i);
        }
        return total / grades.size();
    }



    public static void main(String[] args) {

        student peter = new student("Peter");
        peter.addGrade(95);
        System.out.println(peter.grades);
        peter.addGrade(93);
        System.out.println(peter.grades);
        System.out.println(peter.getGradeAverage());
    }
}
