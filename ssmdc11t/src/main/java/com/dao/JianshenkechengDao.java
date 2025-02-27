package com.dao;

import com.entity.JianshenkechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenkechengVO;
import com.entity.view.JianshenkechengView;


/**
 * 健身课程
 * 
 * @author 
 * @email 
 * @date 2021-02-25 11:11:15
 */
public interface JianshenkechengDao extends BaseMapper<JianshenkechengEntity> {
	
	List<JianshenkechengVO> selectListVO(@Param("ew") Wrapper<JianshenkechengEntity> wrapper);
	
	JianshenkechengVO selectVO(@Param("ew") Wrapper<JianshenkechengEntity> wrapper);
	
	List<JianshenkechengView> selectListView(@Param("ew") Wrapper<JianshenkechengEntity> wrapper);

	List<JianshenkechengView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenkechengEntity> wrapper);
	
	JianshenkechengView selectView(@Param("ew") Wrapper<JianshenkechengEntity> wrapper);
	
}
