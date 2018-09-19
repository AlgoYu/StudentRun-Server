package liar.xiaoyu.www.service.serviceimpl;

import liar.xiaoyu.www.dao.SchoolDao;
import liar.xiaoyu.www.entity.School;
import liar.xiaoyu.www.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    SchoolDao schoolDao;

    @Override
    public Integer addSchool(School school) {
        return schoolDao.addSchool(school);
    }

    @Override
    public Integer deleteSchoolByID(Integer id) {
        return schoolDao.deleteSchoolByID(id);
    }

    @Override
    public Integer updateSchoolByID(School school) {
        return schoolDao.updateSchoolByID(school);
    }

    @Override
    public School getSchoolByID(Integer id) {
        return schoolDao.selectSchoolByID(id);
    }

    @Override
    public List<School> getAllSchool() {
        return schoolDao.selectAllSchool();
    }
}
