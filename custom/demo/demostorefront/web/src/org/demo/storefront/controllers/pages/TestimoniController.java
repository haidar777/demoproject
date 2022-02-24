package org.demo.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.demo.core.testimony.service.DemoTestimonyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("/testimony")
public class TestimoniController extends AbstractPageController {
    @Resource(name = "demoTestimonyService")
    DemoTestimonyService demoTestimonyService;

    private static final String TESTIMONY_PAGE = "testimony";
    @RequestMapping(method = RequestMethod.GET)
    public String getContentPage(final Model model) throws CMSItemNotFoundException{
        final ContentPageModel demoData = getContentPageForLabelOrId(TESTIMONY_PAGE);
        storeCmsPageInModel(model, demoData);
        setUpMetaDataForContentPage(model, demoData);
        //get All Data From Testimony
        model.addAttribute("testimonyList", demoTestimonyService.getAllTestimony());
        return getViewForPage(model);
    } 
}
