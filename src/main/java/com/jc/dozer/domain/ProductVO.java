package com.jc.dozer.domain;

import lombok.Data;

/**
 * @author JC.
 * @date 2018/9/27.
 */
@Data
public class ProductVO<T> {
    private String productName;

    private String productPrice;

    private T productDetail;

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductPrice(Long productPrice) {
        System.out.println(productPrice);
    }
}
