package com.imooc.controller;

import com.imooc.VO.ProductInfoVO;
import com.imooc.VO.ProductVO;
import com.imooc.VO.ResultVO;
import com.imooc.dataobject.ProductCategory;
import com.imooc.dataobject.ProductInfo;
import com.imooc.service.CategoryService;
import com.imooc.service.ProductService;
import com.imooc.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 21/09/2018
 * Time: 21:45
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {


    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list() {
        List <ProductInfo> productInfoList = productService.findUpAll();

        ArrayList <Integer> categoryTypeList = new ArrayList <>();

        for (ProductInfo productInfo : productInfoList) {

            categoryTypeList.add(productInfo.getCategoryType());
        }

        List <ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);


        List <ProductVO> productVOList = new ArrayList <>();

        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List <ProductInfoVO> productInfoVOList = new ArrayList <>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);

                }

            }
            productVO.setProductInfoVOList(productInfoVOList);

            productVOList.add(productVO);


        }


        return ResultVOUtil.success(productVOList);
    }


}