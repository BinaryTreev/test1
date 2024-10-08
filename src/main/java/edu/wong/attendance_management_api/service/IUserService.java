package edu.wong.attendance_management_api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.wong.attendance_management_api.entity.User;
import edu.wong.attendance_management_api.entity.dto.LoginDTO;
import edu.wong.attendance_management_api.entity.dto.UserDTO;

import javax.servlet.http.HttpServletResponse;

public interface IUserService extends IService<User> {

    UserDTO getUserInfo(Integer id);

    UserDTO userLogin(LoginDTO dto, HttpServletResponse response);
}
