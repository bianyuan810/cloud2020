package com.yt.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yt
 * @version 1.0
 * @date 2020-10-8 16:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private  Integer code;
    private  String message;
    private  T data;

    public CommonResult(Integer code, String message) {
       this(code,message,null);
    }
}
