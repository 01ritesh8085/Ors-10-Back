package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FollowUpDAOInt;
import com.rays.dto.FollowUpDTO;

@Service
@Transactional
public class FollowUpServiceImpl 
        extends BaseServiceImpl<FollowUpDTO, FollowUpDAOInt>
        implements FollowUpServiceInt {

    @Autowired
    FollowUpDAOInt followUpDAOInt;

}