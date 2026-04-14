package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ComplaintDTO;

@Repository
public class ComplaintDAOImpl extends BaseDAOImpl<ComplaintDTO> implements ComplaintDAOInt {

    @Override
    protected List<Predicate> getWhereClause(ComplaintDTO dto, CriteriaBuilder builder, Root<ComplaintDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (dto.getComplaintTicketId() > 0) {
            whereCondition.add(builder.equal(qRoot.get("complaintTicketId"), dto.getComplaintTicketId()));
        }

        if (!isEmptyString(dto.getIssueType())) {
            whereCondition.add(builder.like(qRoot.get("issueType"), dto.getIssueType() + "%"));
        }

        if (!isEmptyString(dto.getStatus())) {
            whereCondition.add(builder.equal(qRoot.get("status"), dto.getStatus()));
        }

        if (dto.getCreatedDate() != null) {
            whereCondition.add(builder.equal(qRoot.get("createdDate"), dto.getCreatedDate()));
        }

        return whereCondition;
    }

    @Override
    public Class<ComplaintDTO> getDTOClass() {
        return ComplaintDTO.class;
    }
}