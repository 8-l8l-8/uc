/*** *************************************************** * Copyright (C), NingBo ZhiWeiReach info. Co., Ltd. * ***************************************************** *  **/package com.uc.system.dao.impl;import java.util.List;import org.springframework.data.mongodb.core.query.Criteria;import org.springframework.data.mongodb.core.query.Query;import com.uc.system.dao.LocationDao;import com.uc.system.exception.ZhiWeiException;import com.uc.system.model.Location;/** * @author cwt * @date 2016-04-06 */public class LocationDaoImpl extends GeneralDaoImpl implements LocationDao{        @Override    public Location insert(Location ob)        throws ZhiWeiException    {        mongoTemp.save(ob);        return ob;    }        @Override    public Location findOne(String id)        throws ZhiWeiException    {        // TODO Auto-generated method stub        return null;    }        @Override    public Location findOne(Location ob)        throws ZhiWeiException    {        // TODO Auto-generated method stub        return null;    }        @Override    public List<Location> findAll()        throws ZhiWeiException    {        // TODO Auto-generated method stub        return null;    }        @Override    public long findCont()        throws ZhiWeiException    {        // TODO Auto-generated method stub        return 0;    }        @Override    public boolean removeOneById(String id)        throws ZhiWeiException    {        // TODO Auto-generated method stub        return false;    }        @Override    public boolean removeAll()        throws ZhiWeiException    {        // TODO Auto-generated method stub        return false;    }        @Override    public boolean findAndModify(Location ob)        throws ZhiWeiException    {        // TODO Auto-generated method stub        return false;    }        @Override    public Location findOneByFiled(String field, String value)        throws ZhiWeiException    {        Location ob = mongoTemp.findOne(new Query(Criteria.where(field).is(value)), Location.class);        return ob;    }    }