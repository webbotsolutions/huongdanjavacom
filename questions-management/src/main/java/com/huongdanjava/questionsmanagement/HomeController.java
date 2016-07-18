package com.huongdanjava.questionsmanagement;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huongdanjava.questionsmanagement.service.CategoryService;
import com.huongdanjava.questionsmanagement.service.QuestionService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private QuestionService questionService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate );

		return "home";
	}

    @RequestMapping(value = "/addQuestion")
    public String addQuestion(Map<String, Object> map) {
        List<Map<Integer, String>> categories = categoryService.findAllCategories();
        map.put("categories", categories);

        return "addQuestion";
    }

    @RequestMapping(value = "/doAddQuestion", method = RequestMethod.POST)
    public String doAddQuestion(HttpServletRequest request) {
        String categoryIdAsString = request.getParameter("category");
        String description = request.getParameter("description");

        questionService.addQuestion(Integer.parseInt(categoryIdAsString), description);

        return "home";
    }

}
