package com.vipkid.controller.mobile;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import com.vipkid.controller.parent.base.BaseWebController;
@Controller
public class CurriculumMobileController extends BaseWebController {
	public static final String PATH = "/mobile/curriculum";

	@Override
	protected void registerViewController(ViewControllerRegistry viewControllerRegistry) {
		viewControllerRegistry.addViewController(CurriculumMobileController.PATH).setViewName(CurriculumMobileController.PATH);
	}

	/**
	 * 初始化
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/mobile/curriculum", method = RequestMethod.GET)
	public String init(Model model,HttpServletRequest request){
		return CurriculumMobileController.PATH;
	}
}
