/**
 * ***************************************************
 * Copyright (C), NingBo ZhiWeiReach info. Co., Ltd. *
 *****************************************************
 * 类的详细说明 
 * 
 * @author 东临碣石
 * @Date 2016年2月26日
 * @version 1.00 
 */
package com.zhiwei.wjgg.service;

import java.util.List;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @ClassName: IGeneralService
 * @author 落花流水
 * @date 2016年2月26日 上午9:10:00
 */
public interface IGeneralService<T>
{

    public boolean add(T ob);

    public boolean updata(T ob);

    public boolean delete(T ob);

    public boolean deleteById(String id);

    public boolean search(T ob);

    public T findOneById(String id);

    public List<T> findAll(Object... ob);

}
