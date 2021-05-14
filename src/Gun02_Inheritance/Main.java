package Gun02_Inheritance;

public class Main {
    public static void main(String[] args) {
        //Burasi Normal kullanim
        IndividualCustomer individualCustomer1= new IndividualCustomer();
        individualCustomer1.customerNumber="12";
      CorporateCustomer corporateCustomer1=new CorporateCustomer();
      corporateCustomer1.customerNumber="12345";
      SendikaCustomer sendikaCustomer1=new SendikaCustomer();
      sendikaCustomer1.customerNumber="45698";
      CustomerManager customerManager=new CustomerManager();
      customerManager.add(corporateCustomer1);// tek tek kullanim icin
      customerManager.add(individualCustomer1);
      customerManager.add(sendikaCustomer1);

        CustomerManager customerManager1=new CustomerManager();// Coklu müsteri eklemek icin
        Customer [] customers={individualCustomer1,corporateCustomer1,sendikaCustomer1};
        customerManager1.addMultiple(customers);
    }
}
