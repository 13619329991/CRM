package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.OrderDetails;

/**
 * ������ϸService�ӿ�
 *
 * @author Administrator
 */
public interface OrderDetailsService {


    /**
     * ��ѯ������ϸ����
     */
    List<OrderDetails> find(Map<String, Object> map);


    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * ��ȡָ���������ܽ��
     */
    float getTotalPriceByOrderId(Integer orderId);


}
