package liar.xiaoyu.www.service;

import liar.xiaoyu.www.entity.CommodityType;

import java.util.List;

public interface CommodityTypeService {
    List<CommodityType> getAllCommodityType();
    Integer addCommodityTypeByID(CommodityType commodityType);
    Integer updateCommodityTypeByID(CommodityType commodityType);
    Integer deleteCommodityTypeByID(Integer id);
    CommodityType getCommodityTypeByID(Integer id);
}
