package cn.wolfcode.crm.util;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Makol
 * @time 2018年6月20日 下午12:47:34
 * @email Administrator@qq.com
 * @description
 */
//返回通过Ajas格式发送请求需要返回一个结果时使用

@Getter
@Setter
public class JsonResult {
    private boolean success = true;
    private String msg;

    public void markMsg(String msg) {
        this.success = false;
        this.msg = msg;
    }

}
