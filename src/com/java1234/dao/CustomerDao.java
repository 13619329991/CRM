package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Customer;
import com.java1234.entity.CustomerFw;
import com.java1234.entity.CustomerGc;
import com.java1234.entity.CustomerGx;

/**
 * �ͻ�Dao�ӿ�
 *
 * @author Administrator
 */
public interface CustomerDao {


    /**
     * ��ѯ�ͻ�����
     */
    List<Customer> find(Map<String, Object> map);

    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * ��ӿͻ�
     */
    int add(Customer customer);

    /**
     * �޸Ŀͻ�
     */
    int update(Customer customer);

    /**
     * ɾ���ͻ�
     */
    int delete(Integer id);

    /**
     * ͨ��Id����ʵ��
     */
    Customer findById(Integer id);

    /**
     * ������ʧ�Ŀͻ� 6����δ�µ��Ŀͻ�
     */
    List<Customer> findLossCustomer();

    /**
     * ��ѯ�ͻ�����
     */
    List<CustomerGx> findCustomerGx(Map<String, Object> map);

    /**
     * ��ѯ�ͻ����׼�¼��
     */
    Long getTotalCustomerGx(Map<String, Object> map);

    /**
     * ��ѯ�ͻ�����
     */
    List<CustomerGc> findCustomerGc();

    /**
     * ��ѯ�ͻ��������
     */
    List<CustomerFw> findCustomerFw();

}
