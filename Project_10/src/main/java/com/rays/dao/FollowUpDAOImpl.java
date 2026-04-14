package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.FollowUpDTO;

@Repository
public class FollowUpDAOImpl extends BaseDAOImpl<FollowUpDTO> implements FollowUpDAOInt {

    @Override
    protected List<Predicate> getWhereClause(FollowUpDTO dto, CriteriaBuilder builder, Root<FollowUpDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (!isEmptyString(dto.getPatient())) {
            whereCondition.add(builder.like(qRoot.get("patient"), dto.getPatient() + "%"));
        }

        if (!isEmptyString(dto.getDoctor())) {
            whereCondition.add(builder.like(qRoot.get("doctor"), dto.getDoctor() + "%"));
        }

        if (dto.getDob() != null) {
            whereCondition.add(builder.equal(qRoot.get("dob"), dto.getDob()));
        }

        if (!isEmptyString(dto.getFees())) {
            whereCondition.add(builder.equal(qRoot.get("fees"), dto.getFees()));
        }

        return whereCondition;
    }

    @Override
    public Class<FollowUpDTO> getDTOClass() {
        return FollowUpDTO.class;
    }
}