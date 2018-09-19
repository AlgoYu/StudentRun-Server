package liar.xiaoyu.www.service.serviceimpl;

import liar.xiaoyu.www.dao.CommodityDao;
import liar.xiaoyu.www.entity.Commodity;
import liar.xiaoyu.www.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    CommodityDao commodityDao;

    @Override
    public Integer addCommodity(Commodity commodity) {
        return commodityDao.addCommodity(commodity);
    }

    @Override
    public Integer deleterCommodityByID(Integer id) {
        return commodityDao.deleteCommodityByID(id);
    }

    @Override
    public Integer updateCommodityByID(Commodity commodity) {
        return commodityDao.updateCommodityByID(commodity);
    }

    @Override
    public Commodity getCommodityByID(Integer id) {
        return commodityDao.selectCommodityByID(id);
    }

    @Override
    public List<Commodity> getAllCommodity() {
        return commodityDao.selectAllCommodity();
    }
}
