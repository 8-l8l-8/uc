/*** *************************************************** * Copyright (C), NingBo ZhiWeiReach info. Co., Ltd. * ***************************************************** *  **/package com.zhiwei.wjgg.service;import java.text.ParseException;import java.util.List;import com.zhiwei.wjgg.model.SolrWeibo;/** * @author cwt * @date 2016-03-07 */public interface SolrWeiboDataService extends IGeneralService<SolrWeibo>, SolrSourceService<SolrWeibo>{        public List<SolrWeibo> insert(List<SolrWeibo> obList);    /**     * @Title: findInTime      * @Description: TODO(根据时间点查询这一个小时内的内容)      * @param @param time(yyyy-MM-dd hh)     * @param @return 设定文件      * @return List<SolrWeibo> 返回类型     */    public List<SolrWeibo> findInTime(String time) throws ParseException;        /**     *      * @Title: findObByIdList      * @Description: TODO(获取多id的对象)      * @param @param ids     * @param @return 设定文件      * @return List<SolrWeibo> 返回类型     */    public List<SolrWeibo> findObByIdList(List<String> ids);}