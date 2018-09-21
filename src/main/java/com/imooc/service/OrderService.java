package com.imooc.service;

import com.imooc.dataobject.OrderMater;
import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 21/09/2018
 * Time: 22:39
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);

    OrderDTO findOne(String orderId);

    Page <OrderDTO> findList(String buyerOpenId, Pageable pageable);


    OrderDTO cancel(OrderDTO orderDTO);

    OrderDTO finish(OrderDTO orderDTO);

    OrderDTO paid(OrderDTO orderDTO);

}