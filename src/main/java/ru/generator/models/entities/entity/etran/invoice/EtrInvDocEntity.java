package ru.generator.models.entities.entity.etran.invoice;

import ru.generator.models.entities.entity.share.nsi.etran.app.parent.adapter.XMLDateTimeAdapterEtran;
import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import org.mapstruct.Mapper;
import ru.generator.service.annotations.IgnoreField;

import javax.persistence.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * Created by solop on 20.11.2017.
 */
@Mapper
@Data
@Entity
@Table(name = "inv_doc", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvDocEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "doc_type_id", nullable = true)
    @XmlPath("docTypeID/@value")
    private Integer docTypeId;
    @Basic
    @Column(name = "doc_number", nullable = true, length = 255)
    @XmlPath("docNumber/@value")
    private String docNumber;
    @Basic
    @Column(name = "doc_date", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("docDate/@value")
    private Date docDate;
    @Basic
    @Column(name = "day_count", nullable = true)
    @XmlPath("dayCount/@value")
    private Integer dayCount;
    @Basic
    @Column(name = "model_wag", nullable = true, length = 50)
    @XmlPath("modelWag/@value")
    private String modelWag;
    @Basic
    @Column(name = "doc_vet", nullable = true, length = 39)
    @XmlPath("docVet/@value")
    private String docVet;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}