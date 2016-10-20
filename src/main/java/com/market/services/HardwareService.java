package com.market.services;

import com.market.models.HardwareProduct;
import com.market.repository.HardwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardwareService {

    @Autowired
    private HardwareRepository hardwareRepository;

    public List<HardwareProduct> getProductList() {
        return hardwareRepository.getAllProductList();
    }

    public List<HardwareProduct> getListOfProductsByCategory(int categoryId) {
        return hardwareRepository.getProductListByCategory(categoryId);
    }
}
