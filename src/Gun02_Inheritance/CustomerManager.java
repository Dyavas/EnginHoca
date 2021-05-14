package Gun02_Inheritance;

public class CustomerManager {
//    public void add(IndividualCustomer individualCustomer){
//        System.out.println(individualCustomer.customerNumber+"Bireysel Nolu müsteri kaydedildi.");
//    }
//    public void add (CorporateCustomer corporateCustomer){
//        System.out.println(corporateCustomer.customerNumber+"Ticari müsteri numarasi Kaydedildi.");
//    } inheritance da, süper class referans alindigi icin bu sekilde kullanimdan ziyade , evlatlarin
//    kullanilmi yerine baba kullanilirsa daha sonra yeni bir evlat ekledigimizde
//    extradan owerlooding metod  yazmamiza gerek kalmaz. Sadece baba classdan olusturmamiz yeterli
//    olacaktir.
    // todo SOLID ---> OPEN cLOSED pRINCIPLE
    public void add(Customer customer){//bunu kullanirsak referantiplerin kullanimina daha uygundur.
        System.out.println(customer.customerNumber+"Müsteri Kaydedildi.");
    }
    public void addMultiple(Customer[] customers){
        for (Customer customer:customers
             ) {
            add(customer);
            
        }
    }
}
