package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImp() {
    }

    @Override
    public List<User> getUsers() {
        List<User> userList = null;
        try {
            userList = (List<User>) userDao.getAllUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public void addUser(User user) {
        try {
            userDao.addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void clearAll() {
        try {
            userDao.clearAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editUser(User user) {
        try {
            userDao.editUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(User user) {
        try {
            userDao.deleteUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
