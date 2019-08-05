package grades;

import java.util.HashMap;

public class GradesApplication {




    public static void main(String[] args) {
    HashMap<String, String> students = new HashMap<>();

//        student peter = new student("Peter");
//        peter.addGrade(95);
//        peter.addGrade(93);
//        peter.addGrade(99);
//        System.out.println(peter.grades);
//        System.out.println(peter.getGradeAverage());
//
//        student inara = new student("Inara");
//        inara.addGrade(100);
//        inara.addGrade(100);
//        inara.addGrade(99);
//
//        student wash = new student("Wash");
//        wash.addGrade(74);
//        wash.addGrade(65);
//        wash.addGrade(91);
//
//        student mal = new student("Malcolm");
//        mal.addGrade(54);
//        mal.addGrade(23);
//        mal.addGrade(62);
        students.put("PeterHollman ", "Peter");
        students.put("InaraSerra ", "Inara");
        students.put("HobanWashburne ", "Wash");
        students.put("MalcolmReynolds ", "Mal");
        System.out.println(students);
    }
}
