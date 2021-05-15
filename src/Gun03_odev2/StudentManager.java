package Gun03_odev2;

public class StudentManager extends UserManager {
    public void lessonAdd(Student student){
        System.out.println(student.getFirstName() +student.getLastName()+" Isimli Ögrenci"+student.getClasse()+"Sinifina eklendi.");
    }
    public void activeted(Student student){
        System.out.println(student.getFirstName() +student.getLastName()+" Isimli Ögrencinin Durumu: "+student.getStatus());
    }
}
