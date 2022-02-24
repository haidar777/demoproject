package org.demo.core.testimony.dao;

import org.demo.core.model.TestimonyModel;

import java.util.List;

public interface DemoTestimonyDao {
    List<TestimonyModel> getTestimonyForHomePage();
    List<TestimonyModel> getAllTestimony();
    List<List<Float>> getRatingAndReviewTestimony();
}
