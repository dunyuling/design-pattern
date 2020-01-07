package com.rc.dp.pattern.behaivor.visitor;

/**
 * @ClassName ArtCompany
 * @Description 具体访问者：艺术公司
 * @Author liux
 * @Date 20-1-3 上午11:59
 * @Version 1.0
 */
public class ArtCompany implements Company {
    public String create(Paper element) {
        return "讲学图";
    }

    public String create(Cuprum element) {
        return "朱熹铜像";
    }
}