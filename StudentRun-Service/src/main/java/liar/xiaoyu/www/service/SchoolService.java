package liar.xiaoyu.www.service;

import liar.xiaoyu.www.entity.School;

import java.util.List;

public interface SchoolService {
    Integer addSchool(School school);

    Integer deleteSchoolByID(Integer id);

    Integer updateSchoolByID(School school);

    School getSchoolByID(Integer id);

    List<School> getAllSchool();
}
