package org.dodo.web.common;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Type;


@Data
@AllArgsConstructor
public class user {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    private String name;
}
