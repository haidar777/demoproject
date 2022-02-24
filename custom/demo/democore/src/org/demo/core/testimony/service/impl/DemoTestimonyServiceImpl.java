package org.demo.core.testimony.service.impl;

import org.demo.core.model.TestimonyModel;
import org.demo.core.testimony.dao.DemoTestimonyDao;
import org.demo.core.testimony.service.DemoTestimonyService;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.List;

public class DemoTestimonyServiceImpl implements DemoTestimonyService {

    @Resource(name = "demoTestimonyDao")
    private DemoTestimonyDao demoTestimonyDao;

    @Override
    public List<TestimonyModel> getTestimonyForHomepage() {
        List<TestimonyModel> testimonyModelList = demoTestimonyDao.getTestimonyForHomePage();

        if (testimonyModelList != null){
            return testimonyModelList;
        } else {
            return null;
        }
    }

    @Override
    public List<TestimonyModel> getAllTestimony() {
        List<TestimonyModel> testimonyModelList = demoTestimonyDao.getAllTestimony();

        if (testimonyModelList != null){
            return testimonyModelList;
        } else {
            return null;
        }
    }

    @Override
    public float getAVGRating() {
        List<List<Float>> ratingAndReviews = demoTestimonyDao.getRatingAndReviewTestimony();

        float rating = ratingAndReviews.get(0).get(0);
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        float ratingOneDigitAfterPoint = Float.valueOf(decimalFormat.format(rating));

        if (ratingOneDigitAfterPoint != 0){
            return ratingOneDigitAfterPoint;
        } else {
            return 0;
        }
    }

    @Override
    public int getTotalReviews() {
        List<List<Float>> ratingAndReviews = demoTestimonyDao.getRatingAndReviewTestimony();
        float reviews = ratingAndReviews.get(0).get(1);

        int reviewsInt = (int) reviews;

        if (reviewsInt != 0){
            return reviewsInt;
        } else {
            return 0;
        }
    }
}
