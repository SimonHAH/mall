package com.cskaoyan.mall.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StringToArrayHandler extends BaseTypeHandler<List<Integer>> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<Integer> integers, JdbcType jdbcType) throws SQLException {

    }

    //将数据库类型转换成javabean类型
    @Override
    public List<Integer> getNullableResult(ResultSet resultSet, String columnLabel) throws SQLException {
        List<Integer> list = new ArrayList<>();
        String idsString = resultSet.getString(columnLabel);
        idsString = idsString.substring(1,idsString.length()-1);
        String[] split = idsString.split(",");
        for (String s : split) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }

    @Override
    public List<Integer> getNullableResult(ResultSet resultSet, int index) throws SQLException {
        List<Integer> list = new ArrayList<>();
        String idsString = resultSet.getString(index);
        idsString = idsString.substring(1,idsString.length()-1);
        String[] split = idsString.split(",");
        for (String s : split) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }

    @Override
    public List<Integer> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        List<Integer> list = new ArrayList<>();
        String idsString = callableStatement.getString(i);
        idsString = idsString.substring(1,idsString.length()-1);
        String[] split = idsString.split(",");
        for (String s : split) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }
}
