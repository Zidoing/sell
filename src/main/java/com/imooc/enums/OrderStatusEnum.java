package com.imooc.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 21/09/2018
 * Time: 22:27
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Getter
public enum OrderStatusEnum {

    NEW(0, "新订单"),
    FINISH(1, "完结"),
    CANCEL(2, "已取消");

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}