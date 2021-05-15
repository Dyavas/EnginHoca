package Gun03_odev2;

public class Main {
    public static void main(String[] args) {

        Student student=new Student(1,"Davut","Yavas","Male","1980","Tr","Herne","1b",true);
        Instructor instructor=new Instructor(2,"Ayse","Yildiz","Famale","1970","tr","Ankara","Matematik",20);

        StudentManager studentManager=new StudentManager();
        studentManager.add(student);
        studentManager.activeted(student);
        studentManager.lessonAdd(student);
        System.out.println("");
        InstuctorManager instuctorManager=new InstuctorManager();
        instuctorManager.add(instructor);
        instuctorManager.lessonAssignment(instructor);

    }
}
