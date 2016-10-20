package com.market.repository;

import com.market.models.HardwareCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CategoryRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final String GET_ALL_CATEGORIES_QUERY = "SELECT category_id, category_name FROM categories";

    public List<HardwareCategory> getAllCategoryList() {
        return jdbcTemplate.query(GET_ALL_CATEGORIES_QUERY, new RowMapper<HardwareCategory>() {
            @Override
            public HardwareCategory mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                HardwareCategory hardwareCategory = new HardwareCategory();
                hardwareCategory.setCategoryId(resultSet.getInt("category_id"));
                hardwareCategory.setCategoryName(resultSet.getString("category_name"));
                return hardwareCategory;
            }
        });
    }
}

