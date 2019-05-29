package ru.generator.models.entities.entity.etran.invoice;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class EtrInvoiceEntityPK implements Serializable {
    @Id
    @Column(name = "invoice_id")
    private int invoiceId;
    @Id
    @Column(name = "inv_last_oper")
    private Date invLastOper;

    public EtrInvoiceEntityPK() {
    }

    public EtrInvoiceEntityPK(int invoiceId, Date invLastOper) {
        this.invoiceId = invoiceId;
        this.invLastOper = invLastOper;
    }
}
