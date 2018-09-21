package com.imooc.repository;

import com.imooc.dataobject.OrderMater;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMaterRepository extends JpaRepository <OrderMater, String> {

    Page <OrderMater> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
