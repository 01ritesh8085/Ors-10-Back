package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ComplaintDAOInt;
import com.rays.dto.ComplaintDTO;

@Service
@Transactional
public class ComplaintServiceImpl extends BaseServiceImpl<ComplaintDTO, ComplaintDAOInt>
        implements ComplaintServiceInt {

    @Autowired
    ComplaintDAOInt complaintDAOInt;

}