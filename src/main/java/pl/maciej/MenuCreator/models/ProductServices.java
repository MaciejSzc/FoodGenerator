package pl.maciej.MenuCreator.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices {

    private List<ProductEntity> productData = new ArrayList<>();

    public void addProduct(ProductForm productForm) {
        ProductEntity productEntity = new ProductEntity(productForm.getName(), productForm.getProtein(),
                productForm.getFat(), productForm.getCarbo(), productForm.getKcal(), productForm.getCount());
        productData.add(productEntity);
    }

    public List<ProductEntity> getAllProducts() {
        return productData;
    }



    public void deleteProduct(String key) {
        for (int i = 0; i < productData.size(); i++) {
            if (productData.get(i).getName().equals(key)) {
                productData.remove(i);//moze byc foreach ale uzyj break; na koncu
            }
        }
    }
}
