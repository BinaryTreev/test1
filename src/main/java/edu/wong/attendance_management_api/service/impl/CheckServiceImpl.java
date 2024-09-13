package edu.wong.attendance_management_api.service.impl;

import edu.wong.attendance_management_api.entity.Check;
import edu.wong.attendance_management_api.mapper.CheckMapper;
import edu.wong.attendance_management_api.service.ICheckService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CheckServiceImpl extends ServiceImpl<CheckMapper, Check> implements ICheckService {

}
