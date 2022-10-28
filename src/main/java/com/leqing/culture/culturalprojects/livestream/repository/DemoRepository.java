package com.leqing.culture.culturalprojects.livestream.repository;

import com.leqing.culture.culturalprojects.livestream.entity.UserVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DemoRepository extends JpaRepository<UserVo, Integer>, JpaSpecificationExecutor<UserVo> {
}
