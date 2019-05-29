package ru.generator.models.entities.entity.etran.invoice;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import org.mapstruct.Mapper;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.adapter.XMLDateTimeAdapterEtran;
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
@Table(name = "inv_joint", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvJointEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "jnt_date", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("jntDate/@value")
    private Date jntDate;
    @Basic
    @Column(name = "jnt_station_code", nullable = true, length = 6)
    @XmlPath("jntStationCode/@value")
    private String jntStationCode;
    @Basic
    @Column(name = "jnt_station_name", nullable = true, length = 80)
    @XmlPath("jntStationName/@value")
    private String jntStationName;
    @Basic
    @Column(name = "jnt_carrier_id", nullable = true)
    @XmlPath("jntCarrierID/@value")
    private Integer jntCarrierId;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}