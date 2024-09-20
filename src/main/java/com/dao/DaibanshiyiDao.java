package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DaibanshiyiEntity;
import com.entity.view.DaibanshiyiView;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 事宜信息 Dao 接口
 */
public interface DaibanshiyiDao extends BaseMapper<DaibanshiyiEntity> {

   List<DaibanshiyiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
