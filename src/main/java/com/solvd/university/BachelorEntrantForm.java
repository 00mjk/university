package com.solvd.university;

import java.time.LocalDate;
import java.util.List;

/**
 * Application for higher education of the 1st stage (Bachelor's degree)
 */
public class BachelorEntrantForm extends EntrantForm {

    private List<Certificate> certificates;

    public BachelorEntrantForm(
            Integer id,
            Entrant entrant,
            SpecializationPlan specializationPlan,
            boolean paid,
            Employee issuedBy,
            LocalDate acceptedDate,
            List<Certificate> certificates
    ) {
        super(id, entrant, specializationPlan, paid, issuedBy, acceptedDate);
        this.certificates = certificates;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BachelorEntrantForm that = (BachelorEntrantForm) o;
        return certificates.equals(that.certificates);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + certificates.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n\ttype - bachelor entrant form\n\tCertificates: %s",
                super.toString(), this.certificates.toString());
    }

    public Integer getTotalMark() {
        Integer totalMark = 0;
        for (Certificate certificate : this.certificates) {
            totalMark += certificate.getMark();
        }
        return totalMark;
    }
}
