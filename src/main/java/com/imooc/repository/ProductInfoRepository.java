package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 21/09/2018
 * Time: 21:24
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface ProductInfoRepository extends JpaRepository <ProductInfo, String> {

    List <ProductInfo> findByProductStatus(Integer productStatus);

}