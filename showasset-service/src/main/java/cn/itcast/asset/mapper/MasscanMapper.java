package cn.itcast.asset.mapper;

import cn.itcast.asset.model.message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 7w1st22
 * @date 2022/3/24	当前系统日期
 * @time 16:36	当前系统时间
 */
@Mapper
public interface MasscanMapper {
    @Insert("insert into masscan (id, masscan) values(#{id}, #{masscan})")
    void insert(message masscan);
}
