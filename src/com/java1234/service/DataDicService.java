package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.DataDic;

/**
 * �����ֵ�Service�ӿ�
 *
 * @author Administrator
 */
public interface DataDicService {

    /**
     * ��ѯ�����ֵ伯��
     */
    List<DataDic> find(Map<String, Object> map);

    /**
     * ��ѯ���е������ֵ����Ƽ���
     */
    List<DataDic> findAll();

    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * �޸������ֵ�
     */
    int update(DataDic dataDic);

    /**
     * ��������ֵ�
     */
    int add(DataDic dataDic);

    /**
     * ɾ�������ֵ�
     */
    int delete(Integer id);
}
