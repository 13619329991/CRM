package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CusDevPlan;

/**
 * �ͻ������ƻ�Service�ӿ�
 *
 * @author Administrator
 */
public interface CusDevPlanService {


    /**
     * ��ѯ�ͻ������ƻ�����
     */
    List<CusDevPlan> find(Map<String, Object> map);


    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * �޸Ŀͻ������ƻ�
     */
    int update(CusDevPlan cusDevPlan);

    /**
     * ��ӿͻ������ƻ�
     */
    int add(CusDevPlan cusDevPlan);

    /**
     * ɾ���ͻ������ƻ�
     */
    int delete(Integer id);

}
