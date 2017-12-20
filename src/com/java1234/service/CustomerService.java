package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Customer;
import com.java1234.entity.CustomerFw;
import com.java1234.entity.CustomerGc;
import com.java1234.entity.CustomerGx;

/**
 * 客户Service接口
 *
 * @author Administrator
 */
public interface CustomerService {

    /**
     * 查询客户集合
     */
    List<Customer> find(Map<String, Object> map);

    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 添加客户
     */
    int add(Customer customer);

    /**
     * 修改客户
     */
    int update(Customer customer);

    /**
     * 删除客户
     */
    int delete(Integer id);

    /**
     * 通过Id查找实体
     */
    Customer findById(Integer id);

    /**
     * 查找流失客户，并且添加到流失客户表里
     */
    void checkCustomerLoss();

    /**
     * 查询客户贡献
     */
    List<CustomerGx> findCustomerGx(Map<String, Object> map);

    /**
     * 查询客户贡献记录数
     */
    Long getTotalCustomerGx(Map<String, Object> map);

    /**
     * 查询客户构成
     */
    List<CustomerGc> findCustomerGc();

    /**
     * 查询客户服务分析
     */
    List<CustomerFw> findCustomerFw();
}
