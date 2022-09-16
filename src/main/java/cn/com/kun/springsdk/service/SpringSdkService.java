package cn.com.kun.springsdk.service;

import cn.com.kun.springsdk.bean.entiy.SpringTestDO;
import cn.com.kun.springsdk.dao.SpringTestMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringSdkService {

    private final static Logger LOGGER = LoggerFactory.getLogger(SpringSdkService.class);

    public void show(){
        LOGGER.info("SpringSdkService");
    }

}
