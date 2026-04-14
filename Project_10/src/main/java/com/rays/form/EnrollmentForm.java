package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.EnrollmentDTO;

public class EnrollmentForm extends BaseForm {

    @NotEmpty(message = "Please enter enrollment code")
    private String enrollmentCode;

    @NotEmpty(message = "Please enter student name")
    private String studentName;

    @NotNull(message = "Please enter enrollment date")
    private LocalDate enrollmentDate;

    @NotEmpty(message = "Please select enrollment status")
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

    // DTO Mapping

    @Override
    public EnrollmentDTO getDto() {
        EnrollmentDTO dto = initDTO(new EnrollmentDTO());
        dto.setEnrollmentCode(enrollmentCode);
        dto.setStudentName(studentName);
        dto.setEnrollmentDate(enrollmentDate);
        dto.setEnrollmentStatus(enrollmentStatus);
        return dto;
    }
}