package cn.slienceme.gulimall.search.feign;


import cn.slienceme.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("gulimall-product")
public interface ProductFeignService {


    @GetMapping("/product/attr/info/{attrId}")
    R attrInfo(@PathVariable("attrId") Long attrId);

    @GetMapping("/product/brand/infos")
    R brandsInfos(@RequestParam("brandIds") List<Long> brandIds);

}
