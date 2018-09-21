package com.imooc.VO;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 21/09/2018
 * Time: 21:47
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}