package com.rays.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SessionDAOInt;
import com.rays.dto.SessionDTO;

@Service
@Transactional
public class SessionServiceImpl extends BaseServiceImpl<SessionDTO, SessionDAOInt> implements SessionServiceInt{

}
