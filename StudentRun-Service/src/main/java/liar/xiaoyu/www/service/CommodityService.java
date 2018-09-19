package liar.xiaoyu.www.service;

import liar.xiaoyu.www.entity.Commodity;

import java.util.List;

public interface CommodityService {
    
    Integer addCommodity(Commodity commodity);

    Integer deleterCommodityByID(Integer id);

    Integer updateCommodityByID(Commodity commodity);

    Commodity getCommodityByID(Integer id);

    List<Commodity> getAllCommodity();
}
