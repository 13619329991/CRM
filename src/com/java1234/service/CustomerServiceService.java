package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CustomerService;

/**
 * �ͻ�����Service�ӿ�
 *
 * @author Administrator
 */
public interface CustomerServiceService {

    /**
     * ��ӿͻ�����
     */
    int add(CustomerService customerService);

    /**
     * ��ѯ�ͻ�����
     */
    List<CustomerService> find(Map<String, Object> map);

    /**
     * ��ѯ�ͻ������¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * �޸Ŀͻ�����
     */
    int update(CustomerService customerService);
}
