package cn.itcast.asset.service;

import cn.itcast.asset.mapper.MasscanMapper;
import cn.itcast.asset.model.message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 7w1st22
 * @date 2022/3/24	当前系统日期
 * @time 16:39	当前系统时间
 */
@Service
public class MasscanService {

    @Autowired
    private MasscanMapper masscanMapper;

    public void insert(message masscan) {
        masscanMapper.insert(masscan);
    }
}

