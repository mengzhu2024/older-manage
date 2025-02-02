package com.dao;

import com.entity.GongzuorenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuorenyuanView;

/**
 * 社区工作人员 Dao 接口
 *
 * @author 
 */
public interface GongzuorenyuanDao extends BaseMapper<GongzuorenyuanEntity> {

   List<GongzuorenyuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
