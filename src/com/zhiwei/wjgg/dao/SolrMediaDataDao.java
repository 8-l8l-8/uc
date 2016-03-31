/** * *************************************************** * Copyright (C), NingBo ZhiWeiReach info. Co., Ltd. * ***************************************************** *  * */package com.zhiwei.wjgg.dao;import java.util.Date;import java.util.List;import com.zhiwei.wjgg.dao.CommonDao;import com.zhiwei.wjgg.exception.ZhiWeiException;import com.zhiwei.wjgg.model.SolrMedia;/** * @author cwt * @date 2016-03-07 */public interface SolrMediaDataDao  extends CommonDao<SolrMedia> , OriginalData{    public List<SolrMedia> insert(List<SolrMedia> obList)throws ZhiWeiException;        /**     *      * @Title: findInTime      * @Description: TODO(查询时间点内的数据)      * @param @param start     * @param @param end     * @param @return 设定文件      * @return List<SolrMedia> 返回类型     */    public List<SolrMedia> findInTime(Date start,Date end) throws ZhiWeiException;        /**     *      * @Title: findObByIdList     * @Description: TODO(获取多id的对象)     * @param @param ids     * @param @return 设定文件     * @return List<SolrMedia> 返回类型     */    public List<SolrMedia> findObByIdList(List<String> ids)throws ZhiWeiException;    }