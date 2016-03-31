/**
 * ***************************************************
 * Copyright (C), NingBo ZhiWeiReach info. Co., Ltd. *
 *****************************************************
 * 类的详细说明 
 * 
 * @author 东临碣石
 * @Date 2016年1月15日
 * @version 1.00 
 */
package test.com.zhiwei.wjgg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.zhiwei.wjgg.dao.EventKeyPointDao;
import com.zhiwei.wjgg.dao.EventTrendDao;
import com.zhiwei.wjgg.exception.ZhiWeiException;
import com.zhiwei.wjgg.model.EventKeyPoint;
import com.zhiwei.wjgg.model.EventTrend;

import test.object.ObjectTest;

/**
 * 
 * @ClassName: EventDaoTest
 * @Description: TODO(测试事件危机等级)
 * @author chenweitao
 * @date 2016年2月26日 上午11:37:28
 */
public class EventKeyPointDaoTest extends ObjectTest {
    @Resource
    EventKeyPointDao dao;

    @Test
    public void saveTest() {
	EventKeyPoint ob = new EventKeyPoint();
	Map<String, List<String>> map = new HashMap<String, List<String>>();

	List<String> list = new ArrayList<String>();
	list.add("213131");
	
	map.put("2012-12-16 09", list);
	ob.setTime_content(map);
	ob.setEventId("1");
	ob.setType("all");
	try {
	    dao.insert(ob);
	} catch (ZhiWeiException e) {
	    e.printStackTrace();
	}
    }

    @Test
    public void showTest() {
	try {
	    List<EventKeyPoint> a = dao.findAll();
	    for (EventKeyPoint ob : a) {
		System.out.println(ob);
	    }
	} catch (ZhiWeiException e) {
	    e.printStackTrace();
	}
    }

    @Test
    public void remove() {
	try {
	    System.out.println(dao.removeOneById("1"));
	} catch (ZhiWeiException e) {
	    System.out.println(false);
	}
    }

    @Test
    public void findByEventIdInTime() {
	String eventId = "1";
	String start = "2012-12-16 05";
	String end = "2012-12-16 07";
	String type = "all";

	EventKeyPoint ob = dao.findByEventIdInTime(eventId, type);

	    System.out.println(ob.toString());
    }

}
