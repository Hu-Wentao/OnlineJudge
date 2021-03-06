package com.edu.mapper;

import com.edu.bean.Score;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sunny
 * @since 2018-08-24
 */
public interface ScoreMapper extends BaseMapper<Score> {
    List<Score> selectScoreUserQuestion();
}
