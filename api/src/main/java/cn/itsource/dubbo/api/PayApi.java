package cn.itsource.dubbo.api;

import cn.itsource.dubbo.domain.PayInfo;

public interface PayApi {

	/**
	 * 根据订单id获取支付消息
	 */
	public PayInfo getPayInfo(String uuid);

}