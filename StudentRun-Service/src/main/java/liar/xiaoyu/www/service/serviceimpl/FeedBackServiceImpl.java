package liar.xiaoyu.www.service.serviceimpl;

import liar.xiaoyu.www.dao.FeedBackDao;
import liar.xiaoyu.www.entity.Feedback;
import liar.xiaoyu.www.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FeedBackServiceImpl implements FeedBackService {
    @Autowired
    FeedBackDao feedBackDao;

    @Override
    public Integer addFeedBack(Feedback feedback) {
        return feedBackDao.insertFeedBack(feedback);
    }

    @Override
    public Integer deleteFeedBackByID(Integer id) {
        return feedBackDao.deleteFeedBackByID(id);
    }

    @Override
    public Integer updateFeedBackByID(Feedback feedback) {
        return feedBackDao.updateFeedBackByID(feedback);
    }

    @Override
    public Feedback getFeedBackByID(Integer id) {
        return feedBackDao.selectFeedBackByID(id);
    }

    @Override
    public List<Feedback> getAllFeedBack() {
        return feedBackDao.selectAllFeedBack();
    }
}
