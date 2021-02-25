package org.tsq.mvhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tsq.mvhr.mapper.PositionMapper;
import org.tsq.mvhr.model.Position;

import java.util.Date;
import java.util.List;

/**
 * @Author tsq
 * @Date 2021/2/7 22:28
 * @Description:
 */
@Service
public class PositionService {

    @Autowired
    PositionMapper positionMapper;
    public List<Position> getAllPositions() {
        return positionMapper.getAllPositions();
    }

    public int addPosition(Position position) {
        position.setEnabled(true);
        position.setCreateDate(new Date());
        return positionMapper.insertSelective(position);
    }

    public int updatePosition(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    public int deletePositionById(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }

    public int deletePositionByIds(Integer[] ids) {
        return positionMapper.deletePositionByIds(ids);
    }
}
