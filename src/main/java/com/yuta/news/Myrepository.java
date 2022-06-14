package com.yuta.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Configuration
public class Myrepository {
	@Autowired
	public JdbcTemplate jdbctemplate;
	public int insertOne(String o,String n,String k,String p,String m, String ip) throws DataAccessException {
        // 1件登録
        int rowNumber = jdbctemplate.update(
                "INSERT INTO otoiawase.table(otoi,name,kaisya,phone,mail,ip)"
                        + " VALUES(?, ?, ?, ?, ?,?)",
               o,n,k,p,m,ip);
        return rowNumber;
    }

}
