package com.jc.dozer.main;

import com.jc.dozer.domain.*;
import com.jc.dozer.util.DozerUtil;
import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author JC.
 * @date 2018/9/27.
 */
public class MainTest {
    public static void main(String[] args) {
        DozerBeanMapper oDozerBeanMapper = new DozerBeanMapper();

        ProductTO<ProductDetail> oProductTO = new ProductTO<>();
        oProductTO.setProductName("iphoneX");
        oProductTO.setProductPrice(1000000L);
        ProductDetail<PropertyTO> oProductDetail = new ProductDetail<>();
        oProductDetail.setDetailContent("dedicated for install B");
        oProductTO.setProductDetail(oProductDetail);

        PropertyTO oPropertyTO = new PropertyTO();
        oPropertyTO.setPropertyName("color");
        oPropertyTO.setPropertyValue("black");

        oProductDetail.setPropertyList(Arrays.asList(oPropertyTO));

        ProductVO<ProductDetail<PropertyVO>> oProductVO = new ProductVO();
        ProductDetail<PropertyVO> voProductDetail = new ProductDetail<>();
        voProductDetail.setPropertyList(new ArrayList<PropertyVO>());
        oProductVO.setProductDetail(voProductDetail);
        oDozerBeanMapper.map(oProductTO, oProductVO);
        oProductVO.getProductDetail().setPropertyList(DozerUtil.coverList(oProductVO.getProductDetail().getPropertyList(), PropertyVO.class));
        System.out.println(oProductVO.getProductDetail().getDetailContent());
    }
}
