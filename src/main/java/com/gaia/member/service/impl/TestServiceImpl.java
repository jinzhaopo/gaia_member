package com.gaia.member.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaia.member.model.Test;
import com.gaia.member.service.TestService;
import com.nt.framework.service.impl.BaseServiceImpl;

/**
 * 
 * @ClassName: TestServiceImpl
 * @Description: test---serviceImpl
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年9月29日 下午2:20:43
 */
@Service
@Transactional(readOnly = true)
public class TestServiceImpl extends BaseServiceImpl<Test> implements TestService {

}
