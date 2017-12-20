package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Order;

/**
 * ����Dao�ӿ�
 *
 * @author Administrator
 */
public interface OrderDao {


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

    /**
     * ����ָ���ͻ�������Ķ���
     * n
     */
    Order findLastOrderByCusId(int cusId);
}
