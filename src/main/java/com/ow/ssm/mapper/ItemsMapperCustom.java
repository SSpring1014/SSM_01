package com.ow.ssm.mapper;

import com.ow.ssm.po.ItemsCustom;
import com.ow.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * @Description:
 * @Author: xcl
 * @date: 2018/3/16 15:56
 */
public interface ItemsMapperCustom {

    /**
     * 商品查询列表
     * @param itemsQueryVo
     * @return
     * @throws Exception
     */
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
