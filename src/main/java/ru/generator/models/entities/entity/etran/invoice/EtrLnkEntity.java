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
@Table(name = "lnk", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrLnkEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "type_id", nullable = true)
    @XmlPath("typeID/@value")
    private Integer typeId;
    @Basic
    @Column(name = "doc_id1", nullable = true)
    @XmlPath("docId1/@value")
    private Integer docId1;
    @Basic
    @Column(name = "doc_id2", nullable = true)
    @XmlPath("docId2/@value")
    private Integer docId2;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}