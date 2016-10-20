package com.market.repository;

import com.market.models.HardwareProduct;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HardwareRawMapper implements RowMapper {

    @Override
    public HardwareProduct mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        HardwareProduct hardwareProduct = new HardwareProduct();
        hardwareProduct.setComputerId(resultSet.getInt("computer_id"));
        hardwareProduct.setComputerName(resultSet.getString("computer_name"));
        hardwareProduct.setComputerPrice(resultSet.getInt("computer_price"));
        hardwareProduct.setComputerSupplier(resultSet.getString("computer_supplier"));
        hardwareProduct.setSupplierAddress(resultSet.getString("supplier_address"));
        hardwareProduct.setComputerCustomer(resultSet.getString("computer_customer"));
        return hardwareProduct;
    }
}
