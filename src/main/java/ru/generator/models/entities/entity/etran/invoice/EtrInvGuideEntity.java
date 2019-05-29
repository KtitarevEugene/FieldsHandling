package ru.generator.models.entities.entity.etran.invoice;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import ru.generator.service.annotations.IgnoreField;

import javax.persistence.*;

/**
 * Created by solop on 20.11.2017.
 */
@Data
@Entity
@Table(name = "inv_guide", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvGuideEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "guide_fio", nullable = true, length = 80)
    @XmlPath("guideFIO/@value")
    private String guideFio;
    @Basic
    @Column(name = "guide_passport_ser", nullable = true, length = 10)
    @XmlPath("guidePassportSer/@value")
    private String guidePassportSer;
    @Basic
    @Column(name = "guide_passport_num", nullable = true, length = 10)
    @XmlPath("guidePassportNum/@value")
    private String guidePassportNum;
    @Basic
    @Column(name = "guide_warrant_num", nullable = true, length = 10)
    @XmlPath("guideWarrantNum/@value")
    private String guideWarrantNum;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}