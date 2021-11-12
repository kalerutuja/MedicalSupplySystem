/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Products;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rutuja
 */
public class ProductDirectory {
    
    List<Product> productList;

    public ProductDirectory() {
        this.productList = new ArrayList<>();
    }
    
    public List<Product> getProductList() {
        return productList;
    }
    
       
}
