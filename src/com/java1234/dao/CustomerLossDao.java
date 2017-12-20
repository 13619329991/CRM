package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CustomerLoss;

/**
 * �ͻ���ʧDao�ӿ�
 *
 * @author Administrator
 */
public interface CustomerLossDao {


    /**
     * ��ѯ�ͻ���ʧ����
     */
    List<CustomerLoss> find(Map<String, Object> map);


    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * ��ӿͻ���ʧ��¼
     */
    int add(CustomerLoss customerLoss);

    /**
     * ͨ��Id����ʵ��
     */
    CustomerLoss findById(Integer id);

    /**
     * �޸Ŀͻ���ʧ��¼
     */
    int update(CustomerLoss customerLoss);
}
