package com.ow.ssm.service.impl;

import com.ow.ssm.mapper.ItemsMapperCustom;
import com.ow.ssm.po.ItemsCustom;
import com.ow.ssm.po.ItemsQueryVo;
import com.ow.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: xcl
 * @date: 2018/3/16 16:02
 */
@Service
public class ItemsServiceImpl implements ItemsService {


    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    @Override
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }
}
