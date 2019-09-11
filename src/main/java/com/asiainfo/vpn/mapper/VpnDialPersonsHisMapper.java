package com.asiainfo.vpn.mapper;

import com.asiainfo.vpn.bean.VpnDialPersonsHis;
import com.asiainfo.vpn.bean.VpnDialPersonsHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VpnDialPersonsHisMapper {
    long countByExample(VpnDialPersonsHisExample example);

    int deleteByExample(VpnDialPersonsHisExample example);

    int insert(VpnDialPersonsHis record);

    int insertSelective(VpnDialPersonsHis record);

    List<VpnDialPersonsHis> selectByExample(VpnDialPersonsHisExample example);

    int updateByExampleSelective(@Param("record") VpnDialPersonsHis record, @Param("example") VpnDialPersonsHisExample example);

    int updateByExample(@Param("record") VpnDialPersonsHis record, @Param("example") VpnDialPersonsHisExample example);
}