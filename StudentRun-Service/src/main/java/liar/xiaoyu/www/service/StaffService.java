package liar.xiaoyu.www.service;

import liar.xiaoyu.www.entity.Staff;

import java.util.List;

public interface StaffService {
    Integer addStaff(Staff staff);

    Integer deleteStaffByID(Integer id);

    Integer updateStaffByID(Staff staff);

    Staff getStaffByID(Integer id);

    List<Staff> getAllStaff();
}
