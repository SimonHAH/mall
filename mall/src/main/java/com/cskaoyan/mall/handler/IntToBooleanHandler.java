package com.cskaoyan.mall.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IntToBooleanHandler extends BaseTypeHandler<Boolean> {


    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Boolean aBoolean, JdbcType jdbcType) throws SQLException {

    }

    //将数据库类型转换成javabean类型
    @Override
    public Boolean getNullableResult(ResultSet resultSet, String columnLabel) throws SQLException {
        int anInt = resultSet.getInt(columnLabel);
        if (anInt==0){
            return false;
        }
        return true;
    }

    @Override
    public Boolean getNullableResult(ResultSet resultSet, int index) throws SQLException {
        int anInt = resultSet.getInt(index);
        if (anInt==0){
            return false;
        }
        return true;
    }

    @Override
    public Boolean getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        int anInt = callableStatement.getInt(i);
        if (anInt==0){
            return false;
        }
        return true;
    }
}
