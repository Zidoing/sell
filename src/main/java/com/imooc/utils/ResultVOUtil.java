package com.imooc.utils;

import com.imooc.VO.ResultVO;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 21/09/2018
 * Time: 22:17
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("success");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO <Object> objectResultVO = new ResultVO <>();

        objectResultVO.setMsg(msg);
        objectResultVO.setCode(code);
        return objectResultVO;
    }

}