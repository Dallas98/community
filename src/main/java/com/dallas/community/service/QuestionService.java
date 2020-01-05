package com.dallas.community.service;

import com.dallas.community.dto.QuestionDTO;
import com.dallas.community.mapper.QuestionMapper;
import com.dallas.community.mapper.UserMapper;
import com.dallas.community.model.Question;
import com.dallas.community.model.User;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: community
 * @description:
 * @author: Dallas
 * @create: 2020-01-05 15:54
 */

@Service
public class QuestionService
{
    @Autowired
    private QuestionMapper questionMapper;

    @Autowired UserMapper userMapper;

    public List<QuestionDTO> list() {
        List<Question> questions =questionMapper.list();
        List<QuestionDTO> questionDTOList =new ArrayList<>();
        for (Question question:questions){
            User user=userMapper.findById(question.getCreator());
            QuestionDTO questionDTO=new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }
}
