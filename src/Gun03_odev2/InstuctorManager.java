package Gun03_odev2;

public class InstuctorManager extends UserManager{
    public void lessonAssignment(Instructor instructor){
        System.out.println(instructor.getFirstName()+instructor.getLastName()+" Isimli Ögretmen "+instructor.getBranch()+" Bransina atandi.");
        System.out.println("Toplam ders saati: "+instructor.getSumLesson());
    }
}
