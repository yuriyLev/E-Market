package com.market.repository;

import com.market.models.HardwareProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class HardwareRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final String GET_ALL_PRODUCTS_QUERY = "SELECT computer_id, computer_name, computer_price, computer_supplier,supplier_address,computer_customer FROM hardware";
    private static final String GET_PRODUCTS_BY_CATEGORY_ID_QUERY = "SELECT computer_id, computer_name, computer_price, computer_supplier,supplier_address,computer_customer FROM hardware WHERE category_id=?";

//    private static final String INSERT_PRODUCT_QUERY = "INSERT INTO hardware (computer_name, computer_price, computer_supplier,supplier_address,computer_customer) VALUES (?, ?, ?, ?, ?)";

    public List<HardwareProduct> getAllProductList() {
        return jdbcTemplate.query(GET_ALL_PRODUCTS_QUERY, new HardwareRawMapper());
    }

    public List<HardwareProduct> getProductListByCategory(int categoryId) {
        return jdbcTemplate.query(GET_PRODUCTS_BY_CATEGORY_ID_QUERY, new Object[]{categoryId}, new HardwareRawMapper());

    }

//    public void addProduct(HardwareProduct hardwareProduct) {
//        jdbcTemplate.update(INSERT_PRODUCT_QUERY, hardwareProduct.getComputer_name(), hardwareProduct.getComputer_price(), hardwareProduct.getComputer_supplier(), hardwareProduct.getSupplier_address());
//    }

}
