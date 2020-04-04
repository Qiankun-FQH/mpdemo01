package jw2.qk.mpdemo01.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 * @date 2020-04-04 11:01
 * @title
 **/
@Data//有参无参，getter/setter
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableField(fill = FieldFill.INSERT) //查入时修改createTime字段
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE) //插入时或修改时修改updateTime字段
    private Date updateTime;
}