///*
// * Copyright (c) 2018. paascloud.net All Rights Reserved.
// * 项目名称：paascloud快速搭建企业级分布式微服务平台
// * 类名称：UserManager.java
// * 创建人：刘兆明
// * 联系方式：paascloud.net@gmail.com
// * 开源地址: https://github.com/paascloud
// * 博客地址: http://blog.paascloud.net
// * 项目官网: http://paascloud.net
// */
//
//package com.paascloud.provider.manager;
//
//import com.google.common.base.Preconditions;
//import com.paascloud.base.constant.GlobalConstant;
//import com.paascloud.base.enums.ErrorCodeEnum;
//import com.paascloud.provider.annotation.MqProducerStore;
//import com.paascloud.provider.mapper.UacGroupUserMapper;
//import com.paascloud.provider.mapper.UacRoleUserMapper;
//import com.paascloud.provider.mapper.UacUserMapper;
//import com.paascloud.provider.model.domain.MqMessageData;
//import com.paascloud.provider.model.domain.UacGroupUser;
//import com.paascloud.provider.model.domain.UacRoleUser;
//import com.paascloud.provider.model.domain.UacUser;
//import com.paascloud.provider.model.enums.MqSendTypeEnum;
//import com.paascloud.provider.model.exceptions.UacBizException;
//import com.paascloud.provider.service.impl.RedisServiceImpl;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.Resource;
//
///**
// * The class User manager.
// *
// * @author paascloud.net @gmail.com
// */
//@Slf4j
//@Component
//@Transactional(rollbackFor = Exception.class)
//public class UserManager {
//	@Resource
//	private UacUserMapper uacUserMapper;
//	@Resource
//	private UacRoleUserMapper uacRoleUserMapper;
//	@Resource
//	private UacGroupUserMapper uacGroupUserMapper;
//	@Resource
//	private RedisServiceImpl redisService;
//
//	@MqProducerStore(sendType = MqSendTypeEnum.SAVE_AND_SEND)
//	public void submitResetPwdEmail(final MqMessageData messageData) {
//		log.info("重置密码发送邮件. messageData={}", messageData);
//	}
//
//	@MqProducerStore
//	public void register(final MqMessageData mqMessageData, final UacUser uacUser) {
//		log.info("注册用户. mqMessageData={}, user={}", mqMessageData, uacUser);
//		uacUserMapper.insertSelective(uacUser);
//	}
//
//}
