package dao.sql;

import model.UserEntity;

import java.util.List;

/**
 * Created by wanghaiyan on 2016/4/8.
 */

public interface UserEntitySQL{

    public void update(UserEntity user);

    public void insert(UserEntity user);

    public void insertBatch(List<UserEntity> users);

    public void deleteAll();

    public void deleteById(Integer userId);

    public void deleteByIds(List<Long> userIds);

    public void deleteBatch(List<UserEntity> userList);

    public UserEntity findById(Integer userId);
    public  List<UserEntity> findALL();

}
