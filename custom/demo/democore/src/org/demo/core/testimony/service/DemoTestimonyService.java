package org.demo.core.testimony.service;

import org.demo.core.model.TestimonyModel;

import java.util.List;

public interface DemoTestimonyService {
    List<TestimonyModel> getTestimonyForHomepage();
    List<TestimonyModel> getAllTestimony();
    float getAVGRating();
    int getTotalReviews();
}
