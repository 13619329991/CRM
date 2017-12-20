package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.OrderDetails;

/**
 * ������ϸDao�ӿ�
 *
 * @author Administrator
 */
public interface OrderDetailsDao {


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
