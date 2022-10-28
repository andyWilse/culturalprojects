package com.leqing.culture.culturalprojects.livestream.services.impl;

import com.leqing.culture.culturalprojects.livestream.entity.UserVo;
import com.leqing.culture.culturalprojects.livestream.repository.DemoRepository;
import com.leqing.culture.culturalprojects.livestream.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;

    @Override
    public List<UserVo> selectAll() {
        return demoRepository.findAll();
    }
}
