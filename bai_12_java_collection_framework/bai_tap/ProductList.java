package bai_12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductList {
    static List<Product> productList = new ArrayList<>();
    {
        productList.add(new Product("Iphone", "Iphone12", 36000000));
        productList.add(new Product("SamSung", "SamSungJ7Prime", 5000000));
        productList.add(new Product("Oppo", "OppoV45", 5000000));
    }
    Scanner scanner = new Scanner(System.in);
    public void addProduct(){
        Product product = null;
        System.out.println("Nhập vào tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào id sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        product = new Product(name, id, price);
        productList.add(product);
    }

    public void editProduct(){
        System.out.println("Nhập vào id sản phẩm muốn sửa");
        String id = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)){
                System.out.println("Nhập vào tên sản phẩm: ");
                String name = scanner.nextLine();
                System.out.println("Nhập vào giá sản phẩm: ");
                int price = Integer.parseInt(scanner.nextLine());
                productList.get(i).setName(name);
                productList.get(i).setPrice(price);
            }
        }
    }

    public void deleteProduct(){
        System.out.println("Nhập vào id sản phẩm muốn xóa");
        String id = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)){
                productList.remove(i);
            }
        }
    }

    public void displayProduct(){
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void searchName(){
        System.out.println("Nhập vào tên sản phẩm muốn tìm");
        String name = scanner.nextLine();
        Boolean flag = false;
        for (Product product : productList) {
            if (product.getName().equals(name)){
                System.out.println("Sản phẩm đang tìm: "+product);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Sản phẩm đang tìm không có trong danh sách");
        }
    }

    public static void main(String[] args) {
        ProductList productManager = new ProductList();
        productManager.displayProduct();
        productManager.deleteProduct();
        productManager.addProduct();
        productManager.displayProduct();
        productManager.searchName();
        System.out.println("Sắp xếp giảm dần theo giá");
        ThePriceIsFalling thePriceIsFalling =  new ThePriceIsFalling();
        Collections.sort(productList, thePriceIsFalling);
        productManager.displayProduct();

        System.out.println("Sắp xếp tăng dần theo giá");
        PriceIncreasesGradually priceIncreasesGradually =  new PriceIncreasesGradually();
        Collections.sort(productList, priceIncreasesGradually);
        productManager.displayProduct();
    }
}
