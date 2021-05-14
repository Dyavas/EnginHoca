package getterSetter;

public class ProductManager {
    public void Add(Product product){
        System.out.println(product.getName());
    }
    public void Add2(int id,String name,String desc,double price,String renk,String kod){// bu kullanim temiz kod yazmaya uygun degil
        // cünkü daha sonra kodda degisiklik yada ekleme cikarma yaptigim da olusturulan
        // tüm kodlar degistirilmek zorunda
        System.out.println(price);
    }
}
