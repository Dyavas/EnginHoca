package Classes;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();//Classlar Referans tutucu yapilardir.olusturulen
        // her nesne ilgili klasa refere edilir.
        CustomerManager customerManager1=new CustomerManager();
        customerManager=customerManager1;//bunu kullanirsam yukaridaki tanimlama cöpe dönüsür.
        // java garber collector ile bunu hafizadan siler.
        customerManager.add();
        customerManager.remove();
        customerManager.update();

    }
}
