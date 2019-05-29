package ru.generator.models.entities.entity.etran.invoice;

import ru.generator.models.entities.entity.share.nsi.etran.app.parent.adapter.XMLDateTimeAdapterEtran;
import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import ru.generator.service.annotations.IgnoreField;

import javax.persistence.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * Created by solop on 20.11.2017.
 */
@Data
@Entity
@Table(name = "inv_oper", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvOperEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "oper_date", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("operDate/@value")
    private Date operDate;
    @Basic
    @Column(name = "oper_result", nullable = true, length = 255)
    @XmlPath("operResult/@value")
    private String operResult;
    @Basic
    @Column(name = "oper_remark", nullable = true, length = 4000)
    @XmlPath("operRemark/@value")
    private String operRemark;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}