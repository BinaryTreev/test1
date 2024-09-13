package edu.wong.attendance_management_api.service.impl;

import edu.wong.attendance_management_api.entity.Group;
import edu.wong.attendance_management_api.mapper.GroupMapper;
import edu.wong.attendance_management_api.service.IGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, Group> implements IGroupService {

}
