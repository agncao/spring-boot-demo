package com.caojm.tl.web.controller;

import com.caojm.tl.domain.ProductOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 产品订单控制类
 *
 * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
 * @create 2017/08/07 9:31
 */
@RequestMapping("/order")
@Controller
public class ProductOrderController {
    private final static Logger logger = LoggerFactory.getLogger(ProductOrderController.class);

    @GetMapping("list")
    public ModelAndView list(ModelAndView mv){
        logger.info("请求{} 开始 查询【待开通】列表 ", "/order/list");

        List<ProductOrder> list = new ArrayList<ProductOrder>();
        ProductOrder entity =new ProductOrder();
        entity.setId(1L);
        entity.setCreateTime(new Date());//
        entity.setPurchaserId(1113172136L);
        entity.setPurchaserName("testcgs0708b");
        entity.setSupplierName("testqt560");
        entity.setSupplierId(1112799699L);
        entity.setOrderCode("XMZT201704281140");
        entity.setUserName("testqt560");
        entity.setProductCategory("XMZTC000");
        entity.setProductCode(10);
        entity.setProductName("向匹配项目中推送10次，定价为1668元（推荐）");
        entity.setOrderStatus((short)0);
        entity.setPaidStatus((short)0);
        entity.setCreateTime(new Date());
        entity.setCreatorId(10068l);
        entity.setProductPrice(new BigDecimal(1668));
        list.add(entity);

        entity =new ProductOrder();
        entity.setId(2L);
        entity.setCreateTime(new Date());//
        entity.setPurchaserId(1113172136L);
        entity.setPurchaserName("testcgs0708b");
        entity.setSupplierName("testqt505");
        entity.setSupplierId(1112798866L);
        entity.setOrderCode("XMZT201705090003");
        entity.setUserName("testqt560");
        entity.setProductCategory("XMZTC000");
        entity.setProductCode(5);
        entity.setProductName("向匹配项目中推送5次，定价为668元（推荐）");
        entity.setOrderStatus((short)0);
        entity.setPaidStatus((short)0);
        entity.setCreateTime(new Date());
        entity.setCreatorId(1112798867L);
        entity.setProductPrice(new BigDecimal(1668));
        list.add(entity);

        mv.addObject("list",list);
        mv.setViewName("order/list");
        return mv;
    }
}
