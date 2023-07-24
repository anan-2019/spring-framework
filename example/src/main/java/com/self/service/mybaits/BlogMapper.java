package com.self.service.mybaits;

import com.self.service.jpa.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Classname BlogMapper
 * @Date 2023/7/24 14:11
 * @Created by anan
 * @Description description here
 */
@Mapper
public interface BlogMapper {
	@Select("select * from blog where id = #{id}")
	Blog login(Long id);
}
