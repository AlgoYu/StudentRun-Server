package liar.xiaoyu.www.service.serviceimpl;

import liar.xiaoyu.www.dao.CommodityTypeDao;
import liar.xiaoyu.www.entity.CommodityType;
import liar.xiaoyu.www.service.CommodityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityTypeServiceImpl implements CommodityTypeService {
    @Autowired
    CommodityTypeDao commodityTypeDao;

    @Override
    public List<CommodityType> getAllCommodityType() {
        return commodityTypeDao.selectAllCommodityType();
    }

    @Override
    public Integer updateCommodityTypeByID(CommodityType commodityType) {
        return commodityTypeDao.updateCommodityTypeByID(commodityType);
    }

    @Override
    public Integer deleteCommodityTypeByID(Integer id) {
        return commodityTypeDao.deleteCommodityTypeByID(id);
    }

    @Override
    public CommodityType getCommodityTypeByID(Integer id) {
        return commodityTypeDao.selectCommodityTypeByID(id);
    }
}
