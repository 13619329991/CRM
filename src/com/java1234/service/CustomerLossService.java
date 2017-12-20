package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CustomerLoss;

/**
 * �ͻ���ʧService�ӿ�
 *
 * @author Administrator
 */
public interface CustomerLossService {

    /**
     * ��ѯ�ͻ���ʧ����
     */
    List<CustomerLoss> find(Map<String, Object> map);


    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * ͨ��Id����ʵ��
     */
    CustomerLoss findById(Integer id);

    /**
     * �޸Ŀͻ���ʧ��¼
     */
    int update(CustomerLoss customerLoss);
}
