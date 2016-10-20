package com.market.controllers;

import com.market.models.HardwareProduct;
import com.market.services.HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HardwareController {

    @Autowired
    private HardwareService hardwareService;

    @RequestMapping(value = "/getOverallProductList", method = RequestMethod.GET)
    @ResponseBody
    public List<HardwareProduct> getOverallProductList() {
        return hardwareService.getProductList();
    }

    @RequestMapping(value = "/hardwareProducts", method = RequestMethod.GET)
    public String fetchProducts() {
        return "hardwareProducts";
    }

    @RequestMapping(value = "/getProductListByCategoryId", method = RequestMethod.GET)
    @ResponseBody
    public List<HardwareProduct> getProductListByCategoryId(@RequestParam int categoryId) {
        return hardwareService.getListOfProductsByCategory(categoryId);
    }

    @RequestMapping(value = "/hardwareProductsById", method = RequestMethod.GET)
    public String fetchProductsByCategoryId() {
        return "categoriesById";
    }

}
