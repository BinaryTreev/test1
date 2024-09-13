package edu.wong.attendance_management_api.service.impl;

import edu.wong.attendance_management_api.entity.UserRole;
import edu.wong.attendance_management_api.mapper.UserRoleMapper;
import edu.wong.attendance_management_api.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
