package com.market.repository;

import com.market.models.HardwareCategory;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryRawMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        HardwareCategory hardwareCategory = new HardwareCategory();
        hardwareCategory.setCategoryId(resultSet.getInt("category_id"));
        hardwareCategory.setCategoryName(resultSet.getString("category_name"));
        return hardwareCategory;
    }
}
