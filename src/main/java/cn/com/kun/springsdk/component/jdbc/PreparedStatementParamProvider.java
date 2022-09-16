package cn.com.kun.springsdk.component.jdbc;

import java.sql.PreparedStatement;

public interface PreparedStatementParamProvider {

    void initPreparedStatementParam(PreparedStatement ps);
}
