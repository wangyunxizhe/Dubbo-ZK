package com.yuan.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yuan.common.utils.JSONResult;
import com.yuan.web.service.CulsterService;

/**
 * @Description: 订购商品controller
 */
@Controller
public class PayController {

    @Autowired
    private CulsterService buyService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/buy")
    @ResponseBody
    public JSONResult doGetlogin(String itemId) {
        if (StringUtils.isNotBlank(itemId)) {
            buyService.displayBuy(itemId);
        } else {
            return JSONResult.errorMsg("商品id不能为空");
        }
        return JSONResult.ok();
    }

}
