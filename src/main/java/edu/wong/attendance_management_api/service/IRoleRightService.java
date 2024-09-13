package edu.wong.attendance_management_api.service;

import edu.wong.attendance_management_api.entity.RoleRight;
import com.baomidou.mybatisplus.extension.service.IService;
import edu.wong.attendance_management_api.entity.dto.RoleRightDTO;

import java.util.List;

public interface IRoleRightService extends IService<RoleRight> {
    void syncRight(RoleRightDTO dto);

    List<Integer> getRightList(Integer id);
}
