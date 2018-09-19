package liar.xiaoyu.www.service.serviceimpl;

import liar.xiaoyu.www.dao.StaffDao;
import liar.xiaoyu.www.entity.Staff;
import liar.xiaoyu.www.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffDao staffDao;

    @Override
    public Integer addStaff(Staff staff) {
        return staffDao.insertStaff(staff);
    }

    @Override
    public Integer deleteStaffByID(Integer id) {
        return staffDao.deleteStaffByID(id);
    }

    @Override
    public Integer updateStaffByID(Staff staff) {
        return staffDao.updateStaffByID(staff);
    }

    @Override
    public Staff getStaffByID(Integer id) {
        return staffDao.selectStaffByID(id);
    }

    @Override
    public List<Staff> getAllStaff() {
        return staffDao.selectAllStaff();
    }
}
