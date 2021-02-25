package org.tsq.mvhr.mapper;

import org.apache.ibatis.annotations.Param;
import org.tsq.mvhr.model.Position;

import java.util.List;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    List<Position> getAllPositions();

    int deletePositionByIds(@Param("ids") Integer[] ids);
}