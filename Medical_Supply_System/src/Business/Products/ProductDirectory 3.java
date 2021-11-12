/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Products;

import java.util.List;

/**
 *
 * @author rutuja
 */
public class ProductDirectory {
    
    List<Product> productList;

    public ProductDirectory(List<Product> productList) {
        this.productList = productList;
    }
    
    public List<Product> getProductList() {
        return productList;
    }
    
       
}
