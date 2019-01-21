package com.jc.dozer.domain;

import lombok.Data;

/**
 * @author JC.
 * @date 2018/9/27.
 */
@Data
public class ProductTO<T> {
    private String productName;

    private Long productPrice;

    private T productDetail;
}
