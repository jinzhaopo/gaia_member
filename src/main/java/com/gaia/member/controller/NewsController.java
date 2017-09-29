package com.gaia.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nt.framework.annotation.validation.RequiredStringValidator;
import com.nt.framework.annotation.validation.Validations;
import com.nt.framework.servlet.Message;

/**
 * 
 * @ClassName: NewsController
 * @Description: 新闻稿
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年9月29日 下午2:29:53
 */
@RestController
@RequestMapping("/news")
public class NewsController extends BaseController {

	/**
	 * 
	 * @Title: add
	 * @Description: 发布新闻稿
	 * @return
	 * @return: Message
	 */
	@Validations(requiredStrings = { @RequiredStringValidator(fieldName = "themes", message = "主题不能为空") })
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Message add() {
		return null;
	}


}
