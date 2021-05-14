package getterSetter;

public class Main {
    public static void main(String[] args) {
        Product product1=new Product();//bos constructer

        Product product2=new Product(1,"Tablet","Dokunmatik bilgisayar",200,"beyaz");

        //Dogru kullanim daha esnek
        Product product = new Product();//bunu constructer olarak görüyor
        product.setId(1);
        product.setName("Laptop");
        product.setDescrition("Disüstü Bilgisayar");
        product.setPrice(4500);
        product.setRenk("Kirmizi");

        ProductManager productManager = new ProductManager();//fonksiyonlar bir metodda olamali ki temiz kod olsun
        productManager.Add(product);
        productManager.Add2(1, "Desktop", "Masaüstü", 5000, "Siyah", "s");//Eger fieldlari ayri lassda tanimlamis olursam buradakiler gibi
        productManager.Add2(1, "Desktop", "Masaüstü", 5000, "Siyah", "s");//Daha sonra degisiklik yaptigimda hepsini tek tek degistirmem gerekti.
        productManager.Add2(1, "Desktop", "Masaüstü", 5000, "Siyah", "s");// yukaridaki kullanim daha uygun. Daha sürdürülebilir.
    }

}
