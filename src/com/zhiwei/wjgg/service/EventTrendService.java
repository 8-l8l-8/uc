/** * *************************************************** * Copyright (C), NingBo ZhiWeiReach info. Co., Ltd. * ***************************************************** *  * */package com.zhiwei.wjgg.service;import com.zhiwei.wjgg.model.Event;import com.zhiwei.wjgg.model.EventTrend;import com.zhiwei.wjgg.model.EventUpate;/** *  * @ClassName: EventTrendService * @Description: TODO(这里用一句话描述这个类的作用) * @author chenweitao * @date 2016年2月29日 下午3:36:47 */public interface EventTrendService extends IGeneralService<EventTrend>{        /**     *      * @Title: findByEventIdInTime     * @Description: TODO(查询时间段内的数据)     * @param @param eventId     * @param @param type     * @param @return 设定文件     * @return EventTrend 返回类型     */    public EventTrend findByEventIdInTime(String eventId, String type);        /**     *      * @Title: addInfoByOb     * @Description: TODO(添加到原有数据，若没有则添加，有则合并)     * @param @param ob     * @param @return 设定文件     * @return boolean 返回类型     */    public boolean addInfoByOb(EventTrend ob);        /**     * @Title: addAllByThree     * @Description: TODO(将三个平台的数据合成全部的趋势数据)     * @param @return 设定文件     * @return boolean 返回类型     */    public boolean addAllByThree(String eventId);        /**     * @Title: findEventUpataByEvent     * @Description: 获取事件需要更新的数据     * @param @param event     * @param @return 设定文件     * @return EventUpata 返回类型     */    public EventUpate findEventUpataByEvent(Event event);        /**     * @Title: deleteByEventId      * @Description: TODO(按eventId删除)      * @param @param eventId     * @param @return 设定文件      * @return boolean 返回类型     */    public boolean deleteByEventId(String eventId);}