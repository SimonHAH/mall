package com.cskaoyan.mall.bean.market.specialData;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "cskaoyan_mall_issue")
@AllArgsConstructor
@NoArgsConstructor
public class IssueData {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    private String answer;
    private Boolean deleted;
    private String question;

    @Column(name = "update_time")
    private String updateTime;
    @Column(name = "add_time")
    private String addTime;
}
