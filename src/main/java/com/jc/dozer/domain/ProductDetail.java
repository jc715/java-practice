package com.jc.dozer.domain;

import lombok.Data;

import java.util.List;

/**
 * @author JC.
 * @date 2018/9/27.
 */
@Data
public class ProductDetail<T> {
    private String detailContent;

    private List<T> propertyList;
}
