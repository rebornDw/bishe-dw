package com.zhy.repository.mybatis;

import com.zhy.model.User;
import org.springframework.stereotype.Repository;

/**
 * Describe:xml配置User表操作
 */
@Repository
public interface UserRepository {

    /**
     *  通过手机号查找用户
     * @param phone 手机号
     * @return 用户
     */
    User findByPhone(String phone);

}
