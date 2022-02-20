package org.demo.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/about")
public class AboutUsPageController extends AbstractPageController {
    private static final String ABOUT_US_PAGE = "about";
    @RequestMapping(method = RequestMethod.GET)
    public String getAboutUsContentPage(final Model model) throws CMSItemNotFoundException {
        final ContentPageModel demoData = getContentPageForLabelOrId(ABOUT_US_PAGE);
        storeCmsPageInModel(model, demoData);
        setUpMetaDataForContentPage(model, demoData);
        return getViewForPage(model);
    }
}
