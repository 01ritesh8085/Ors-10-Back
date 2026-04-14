package com.rays.dto;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ENROLLMENT")
public class EnrollmentDTO extends BaseDTO {

    @Column(name = "ENROLLMENT_CODE", unique = true)
    private String enrollmentCode;

    @Column(name = "STUDENT_NAME", length = 50)
    private String studentName;

    @Column(name = "ENROLLMENT_DATE")
    private LocalDate enrollmentDate;

    @Column(name = "ENROLLMENT_STATUS", length = 50)
    private String enrollmentStatus;

    // Getter Setter

    public String getEnrollmentCode() {
        return enrollmentCode;
    }

    public void setEnrollmentCode(String enrollmentCode) {
        this.enrollmentCode = enrollmentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    // BaseDTO methods

    @Override
    public String getValue() {
        return enrollmentCode;
    }

    @Override
    public String getUniqueKey() {
        return "enrollmentCode";
    }

    @Override
    public String getUniqueValue() {
        return enrollmentCode;
    }

    @Override
    public String getLabel() {
        return "Enrollment";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("enrollmentCode", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("enrollmentCode", enrollmentCode);
        return map;
    }
}