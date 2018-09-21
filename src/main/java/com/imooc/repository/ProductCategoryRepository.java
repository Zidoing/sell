package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 20/09/2018
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface ProductCategoryRepository extends JpaRepository <ProductCategory, Integer> {

    List <ProductCategory> findByCategoryTypeIn(List <Integer> categoryTypeList);
 }
