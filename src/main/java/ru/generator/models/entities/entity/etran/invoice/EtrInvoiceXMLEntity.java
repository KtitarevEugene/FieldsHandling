package ru.generator.models.entities.entity.etran.invoice;

import ru.generator.models.entities.entity.share.nsi.etran.app.parent.adapter.XMLDateTimeAdapterEtran;
import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.Type;
import org.mapstruct.Mapper;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Collection;
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