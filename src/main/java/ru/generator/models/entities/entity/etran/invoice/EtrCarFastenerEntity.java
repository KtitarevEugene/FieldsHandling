package ru.generator.models.entities.entity.etran.invoice;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import org.mapstruct.Mapper;
import ru.generator.service.annotations.IgnoreField;
import ru.generator.service.annotations.ModelClass;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by solop on 20.11.2017.
 */
@Mapper
@Data
@Entity
@Table(name = "car_fastener", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice"),
                @Index(columnList = "id_inv_car")
        })
public class EtrCarFastenerEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "fastener_id", nullable = true)
    @XmlPath("fastenerID/@value")
    private Integer fastenerId;
    @Basic
    @Column(name = "fastener_name", nullable = true, length = 4000)
    @XmlPath("fastenerName/@value")
    private String fastenerName;
    @Basic
    @Column(name = "fastener_count", nullable = true)
    @XmlPath("fastenerCount/@value")
    private Integer fastenerCount;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
    @ManyToOne
    @JoinColumn(name = "id_inv_car", referencedColumnName = "id", nullable = false)
    @IgnoreField
    private EtrInvCarEntity invCar;
    @OneToMany(mappedBy = "carFastener", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "fastenerProperty")
    @ModelClass(EtrFastenerPropertyCarEntity.class)
    private Collection<EtrFastenerPropertyCarEntity> fastenerPropertyCars = new ArrayList<>();
}