package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Product;

/**
 * ��ƷService�ӿ�
 *
 * @author Administrator
 */
public interface ProductService {

    /**
     * ��ѯ��Ʒ����
     */
    List<Product> find(Map<String, Object> map);

    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);
}
