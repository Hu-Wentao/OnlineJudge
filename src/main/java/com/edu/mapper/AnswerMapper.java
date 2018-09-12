package com.edu.mapper;

import com.edu.bean.Answer;
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
public interface AnswerMapper extends BaseMapper<Answer> {
    List<Answer> selectAnswerUserQuestion();
    List<Answer> selectAnswerByUserQuestion(Integer userId, Integer questionId);
}
