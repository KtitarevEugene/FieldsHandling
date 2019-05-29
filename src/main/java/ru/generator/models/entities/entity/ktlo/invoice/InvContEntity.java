package ru.generator.models.entities.entity.ktlo.invoice;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import ru.generator.models.entities.annotation.Nsi;
import ru.generator.models.entities.entity.share.nsi.etran.app.*;
import ru.generator.service.annotations.Description;
import ru.generator.service.annotations.IgnoreField;
import ru.generator.service.annotations.ModelClass;

import javax.persistence.*;

/**
 * Created by solop on 20.11.2017.
 */
@ApiModel(discriminator = "НАКЛАДНАЯ: Контейнеры")
@Data
@Entity
@Table(name = "inv_cont", schema = "invoice",
        indexes = {
                @Index(columnList = "id_invoice")
        })
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvContEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    private String id;

    @Basic
    @Column(name = "cont_number", nullable = true, length = 11)
    @Description(value = "Номер контейнера ")
    private String contNumber;


    @Basic
    @Column(name = "cont_train_number", nullable = true)
    @Description(value = "Номер поезда")
    private Integer contTrainNumber;


    @Basic
    @Column(name = "cont_count_in_train", nullable = true)
    @Description(value = "Контейнеров в поезде")
    private Integer contCountInTrain;

    @Basic
    @Column(name = "cont_car_order", nullable = true)
    @Description(value = "Номер вагона для контейнерного поезда ")
    private Integer contCarOrder;

    @Nsi(nsiClassEntity = SCommon_7_Entity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cont_owner_type_ID", referencedColumnName = "id")
    @Description(value = "Тип собственности (ID по НСИ - COMMON, тип 7)")
    @ModelClass(SCommon_7_Entity.class)
    private SCommon_7_Entity contOwnerType;

    @Nsi(nsiClassEntity = SCountryEntity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cont_owner_country_id", referencedColumnName = "CN_ID")
    @Description(value = "Страна-собственник (код ОКСМ по НСИ - COUNTRY)")
    @ModelClass(SCountryEntity.class)
    private SCountryEntity contOwnerCountry;

    @Basic
    @Column(name = "cont_owner_Id", nullable = true, precision = 0)
    @Description(value = "Собственник")
    private Double contOwnerId;

    @Basic
    @Column(name = "cont_owner_okpo", nullable = true, length = 10)
    @Description(value = "Собственник ОКПО")
    private String contOwnerOkpo;

//    @Basic
//    @Column(name = "cont_owner_name", nullable = true, length = 255)
//    @Description(value = "Собственник")
//    private String contOwnerName;


    @Nsi(nsiClassEntity = SContTonnageEntity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cont_tonnage_ID", referencedColumnName = "CONT_TONNAGE_ID")
    @Description(value = "Тоннажность конт. (т) (TONNAGE по НСИ - CONT_TONNAGE)")
    @ModelClass(SContTonnageEntity.class)
    private SContTonnageEntity contTon;


    @Nsi(nsiClassEntity = SContSizeBigEntity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cont_size_big", referencedColumnName = "CONT_SIZE_ID")
    @Description(value = "Размер крупнотоннажного контейнера (CONT_SIZE_ID по НСИ CONT_SIZE_BIG)")
    @ModelClass(SContSizeBigEntity.class)
    private SContSizeBigEntity contSizeBig;


    @Nsi(nsiClassEntity = SContTypeBigEntity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cont_type_big_id", referencedColumnName = "CONT_TYPE_ID")
    @Description(value = "Тип крупнотоннажного контейнера (CONT_TYPE_ID по НСИ CONT_TYPE_BIG) ")
    @ModelClass(SContTypeBigEntity.class)
    private SContTypeBigEntity contType;

//    @Nsi(nsiClassEntity = SContTypeBigEntity.class, type = Nsi.Type.CODE, refField = "code")
//    @Basic
//    @Column(name = "cont_type_big", nullable = true)
//    @Description(value = "Тип крупнотоннажного контейнера (CONT_TYPE_ID по НСИ CONT_TYPE_BIG) ")
//    private Integer contTypeBig;

//    @Basic
//    @Column(name = "cont_width_foot", nullable = true, precision = 0)
//    @Description(value = "Футовость крупнотоннажного контейнера")
//    private Double contWidthFoot;

    @Basic
    @Column(name = "cont_volume", nullable = true)
    @Description(value = "Объем")
    private Integer contVolume;

    @Basic
    @Column(name = "cont_weight_dep", nullable = true, precision = 0)
    @Description(value = "Масса в кг тары")
    private Double contWeightDep;

    @Basic
    @Column(name = "cont_weight_gross", nullable = true, precision = 0)
    @Description(value = "Масса в кг брутто")
    private Double contWeightGross;

    @Basic
    @Column(name = "cont_weight_net", nullable = true, precision = 0)
    @Description(value = "Масса в кг нетто ")
    private Double contWeightNet;

    @Basic
    @Column(name = "cont_places_count", nullable = true)
    @Description(value = "Количество мест ")
    private Integer contPlacesCount;

    @Basic
    @Column(name = "cont_sign", nullable = true, length = 1)
    @Description(value = "Признак")
    private String contSign;

    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_doc_id", nullable = false)
    @Description(value = "invoice_id")
    @IgnoreField
    private InvoiceEntity invoice;
}