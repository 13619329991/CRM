package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Order;

/**
 * ����Service�ӿ�
 *
 * @author Administrator
 */
public interface OrderService {

    /**
     * ��ѯ��������
     */
    List<Order> find(Map<String, Object> map);


    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * ͨ��Id����ʵ��
     */
    Order findById(Integer id);
}
