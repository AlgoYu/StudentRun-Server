package liar.xiaoyu.www.service;

import liar.xiaoyu.www.entity.Feedback;

import java.util.List;

public interface FeedBackService {
    Integer addFeedBack(Feedback feedback);
    Integer deleteFeedBackByID(Integer id);
    Integer updateFeedBackByID(Feedback feedback);
    Feedback getFeedBackByID(Integer id);
    List<Feedback> getAllFeedBack();
}
