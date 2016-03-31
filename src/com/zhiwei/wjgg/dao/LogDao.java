/*** *************************************************** * Copyright (C), NingBo ZhiWeiReach info. Co., Ltd. * ***************************************************** *  **/package com.zhiwei.wjgg.dao;import java.util.List;import com.zhiwei.wjgg.exception.ZhiWeiException;import com.zhiwei.wjgg.model.Log;/** * @author 落花流水 * @date 2016-02-23 */public interface LogDao extends CommonDao<Log>{       public void addLog(Log log) throws ZhiWeiException;    public List<Log> findAllLogByType(String type);        public List<Log> findAllLogByTime(String startTime, String endTime);        public List<Log> findAllLogByTimeWithType(String startTime, String endTime, String type);}