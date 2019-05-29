package ru.generator.models.entities.entity.etran.invoice;

import lombok.Data;
import org.hibernate.annotations.Type;
import org.mapstruct.Mapper;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by solop on 20.11.2017.
 */
@Mapper
@Data
@Entity
@Table(name = "invoice_xml", schema = "etran_inv")
@IdClass(value = EtrInvoiceEntityPK.class)
public class EtrInvoiceXMLEntity {
    @Id
    @Column(name = "invoice_id", nullable = false)
    private int invoiceId;
    @Basic

    @Id
    @Column(name = "inv_last_oper", nullable = true)
    private Date invLastOper;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "inv_xml", nullable = true)
    private String xml;
}