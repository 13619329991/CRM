package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.SaleChance;

/**
 * ���ۻ���Service�ӿ�
 *
 * @author Administrator
 */
public interface SaleChanceService {

    /**
     * ��ѯ���ۻ��Ἧ��
     */
    List<SaleChance> find(Map<String, Object> map);

    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * �������ۻ���
     */
    int add(SaleChance saleChance);

    /**
     * �޸����ۻ���
     */
    int update(SaleChance saleChance);

    /**
     * ɾ�����ۻ���
     */
    int delete(Integer id);

    /**
     * ����id����ʵ��
     */
    SaleChance findById(Integer id);
}