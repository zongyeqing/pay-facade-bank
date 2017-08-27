package com.zong.pay.facade.bank.service;


import com.zong.pay.facade.bank.entity.CardBin;
import com.zong.pay.facade.bank.exceptions.BankBizException;
import com.zong.paycommon.page.PageBean;
import com.zong.paycommon.page.PageParam;

import java.util.Map;


/**
 * 
 * @描述: 银行卡卡Bin信息Dubbo服务接口.
 * @作者: HuPitao,WuShuicheng .
 * @创建时间: 2014-4-16, 下午1:45:38
 */
public interface CardBinFacade {

	/**
	 * 创建
	 * 
	 * @param entity
	 * @return
	 */
	public long create(CardBin entity) throws BankBizException;

	/**
	 * 修改
	 * 
	 * @param entity
	 * @return
	 */
	public long update(CardBin entity) throws BankBizException;

	/**
	 * 分页查询
	 * 
	 * @param pageParam
	 *            分页实体对象
	 * @param paramMap
	 *            查询条件
	 * @return
	 */
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) throws BankBizException;

	/**
	 * 根据ID查找
	 * 
	 * @param id
	 *            主键
	 * @return
	 */
	public CardBin getById(long id) throws BankBizException;

	/**
	 * 根据卡BIN查找
	 *            主键
	 * @return
	 */
	public CardBin getByCardBin(String cardBin, Integer status) throws BankBizException;
}
