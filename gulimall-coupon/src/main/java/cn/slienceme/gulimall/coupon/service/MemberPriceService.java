package cn.slienceme.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.slienceme.common.utils.PageUtils;
import cn.slienceme.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author slience_me
 * @email slienceme.cn@gmail.com
 * @date 2025-01-17 20:52:03
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

