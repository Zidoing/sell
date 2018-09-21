package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 21/09/2018
 * Time: 21:55
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;


    @JsonProperty("foods")
    private List <ProductInfoVO> productInfoVOList;

}