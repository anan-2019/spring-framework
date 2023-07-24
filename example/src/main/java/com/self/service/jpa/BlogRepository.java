package com.self.service.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Classname BlogRepository
 * @Date 2023/7/24 13:07
 * @Created by anan
 * @Description description here
 */
public interface BlogRepository extends JpaRepository<Blog, Long> {
}
