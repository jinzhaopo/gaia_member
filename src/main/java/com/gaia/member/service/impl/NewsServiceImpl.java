package com.gaia.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaia.member.mapper.NewsMapper;
import com.gaia.member.model.News;
import com.gaia.member.service.NewsService;
import com.nt.framework.service.impl.BaseServiceImpl;
import com.nt.framework.tkMapper.MyMapper;

/**
 * 
 * @ClassName: NewsServiceImpl
 * @Description: 新闻稿---service
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年9月26日 上午9:45:12
 */
@Transactional(readOnly = true)
@Service
public class NewsServiceImpl extends BaseServiceImpl<News> implements NewsService {

	@Autowired
	private NewsMapper newsmapper;

	@Autowired
	protected void setMapper(NewsMapper mapper) {
		super.setMapper(mapper);
	}

}
