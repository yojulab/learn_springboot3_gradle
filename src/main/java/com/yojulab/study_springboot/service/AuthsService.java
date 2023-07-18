package com.yojulab.study_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import org.springframework.stereotype.Service;

import com.yojulab.study_springboot.dao.SharedDao;
import com.yojulab.study_springboot.utils.Commons;

@Service
public class AuthsService {

    @Autowired
    SharedDao sharedDao;

    @Autowired
    Commons commonUtils;

    // @Autowired
    // BCryptPasswordEncoder bcryptPasswordEncoder;

    public Object insert(Map dataMap) {
        String sqlMapId = "Auths.insert";
        Object result = sharedDao.insert(sqlMapId, dataMap);
        return result;
    }

    public Object selectListByUID(Map dataMap){
        dataMap.put("UNIQUE_ID", commonUtils.getUniqueSequence());
        dataMap.put("roleList", "ROLE_USER");

        Object result = this.insert(dataMap);
        return result;
    }
}