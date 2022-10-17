package cn.com.kun.springsdk.component.jpa.service;

import cn.com.kun.springsdk.component.jpa.entity.UserEntity;
import cn.com.kun.springsdk.component.jpa.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class SpringJpaDemoService {

    private final static Logger LOGGER = LoggerFactory.getLogger(SpringJpaDemoService.class);

    @Autowired
    UserRepository userRepository;

    public String testSave(String s) {

        UserEntity userEntity = new UserEntity();
        userEntity.setName(UUID.randomUUID().toString());
        userEntity.setPhone(UUID.randomUUID().toString());
        userEntity.setAge(ThreadLocalRandom.current().nextInt(100));
        userEntity.setAddress(UUID.randomUUID().toString());
        userEntity.setCreateTime(new Date());
        userRepository.save(userEntity);

        return "OK";
    }


    public String testDateNull(String s) {

        UserEntity userEntity = new UserEntity();
        userEntity.setName(UUID.randomUUID().toString());
        userEntity.setPhone(UUID.randomUUID().toString());
        userEntity.setAge(ThreadLocalRandom.current().nextInt(100));
        userEntity.setAddress(UUID.randomUUID().toString());
        userRepository.save(userEntity);

        return "OK";
    }

    public String testQuery(String s) {

        Optional<UserEntity> res = userRepository.findById(8L);
        return "OK";
    }

    public String testQueryByWhere(String s) {

        List<UserEntity> res = userRepository.findByPhoneAndAddress("10086", "shenzhen");
        return "OK";
    }

    @Transactional
    public String testUpdate(String s) {
        int res = userRepository.updateUserByAddress("10087", "shenzhen");
        return "OK";
    }

    @Transactional
    public String testDelete(String s) {
        int res = userRepository.deleteUserByAddress(6L);
        return "OK";
    }
}
