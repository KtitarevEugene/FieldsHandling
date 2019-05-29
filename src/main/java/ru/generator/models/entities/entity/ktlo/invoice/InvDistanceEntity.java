package ru.generator.models.entities.entity.ktlo.invoice;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import ru.generator.service.annotations.Description;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import ru.generator.models.entities.annotation.Nsi;
import ru.generator.models.entities.entity.share.nsi.etran.app.*;
import ru.generator.service.annotations.IgnoreField;
import ru.generator.service.annotations.ModelClass;

import javax.persistence.*;

/**
 * Created by solop on 20.11.2017.
 */
@ApiModel(discriminator = "НАКЛАДНАЯ: Маршрут следования")
@Data
@Entity
@Table(name = "inv_distance", schema = "invoice",
        indexes = {
                @Index(columnList = "id_invoice")
        })
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvDistanceEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @Description(value = "id_inv_distance", position = 100)
    private String id;

    //   Страна инфраструктуры(код ОКСМ по НСИ - COUNTRY)
    @Nsi(nsiClassEntity = SCountryEntity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dist_country_Id", referencedColumnName = "CN_ID")
    @Description(value = "Страна инфраструктуры(код ОКСМ по НСИ - COUNTRY) ", position = 200)
    @ModelClass(SCountryEntity.class)
    private SCountryEntity distCountry;

    //    Идентификатор страны инфраструктуры станции (ссылка на страну ST_CN_ID по НСИ - STATION)
    @Nsi(nsiClassEntity = SStationEntity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dist_station_Id", referencedColumnName = "ST_ID")
    @Description(value = "Станция (код ОСЖД по НСИ - STATION - ST_CODE_OSJD)", position = 400)
    @ModelClass(SStationEntity.class)
    private SStationEntity distStation;

    //    Порт (ID по НСИ - PORT)
    @Nsi(nsiClassEntity = SPortEntity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dist_port_id", referencedColumnName = "ID")
    @Description(value = "Порт (ID по НСИ - PORT)", position = 700)
    @ModelClass(SPortEntity.class)
    private SPortEntity distPort;

    @Basic
    @Column(name = "dist_load_way", nullable = true, length = 40)
    @Description(value = "Подъездной путь ", position = 900)
    private String distLoadWay;

    @Basic
    @Column(name = "dist_min_way", nullable = true)
    @Description(value = "Кратчайшее расстояние до следующей узловой станции ", position = 1000)
    private Integer distMinWay;

    // TODO: 31.03.2019 Плательщик на предыдущем отрезке
    @Basic
    @Column(name = "dist_payer_Id", nullable = true)
    @Description(value = "Плательщик", position = 1100)
    private Integer distPayerId;

    @Basic
    @Column(name = "dist_payer_code", nullable = true, length = 10)
    @Description(value = "Код плательщика", position = 1200)
    private String distPayerCode;

    @Basic
    @Column(name = "dist_sub_code", nullable = true, length = 12)
    @Description(value = "Подкод экспедитора", position = 1300)
    private String distSubCode;

    //    Вид транспорта (ID по НСИ - COMMON, тип 103)
    @Nsi(nsiClassEntity = SCommon_103_Entity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dist_transp_type_ID", referencedColumnName = "id")
    @Description(value = "Вид транспорта (ID по НСИ - COMMON, тип 103)", position = 1400)
    @ModelClass(SCommon_103_Entity.class)
    private SCommon_103_Entity distTranspType;

    //    Вид колеи (ID по НСИ - COMMON, тип 104)
    @Nsi(nsiClassEntity = SCommon_104_Entity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dist_track_type_ID", referencedColumnName = "id")
    @Description(value = "Вид колеи (ID по НСИ - COMMON, тип 104)", position = 1500)
    @ModelClass(SCommon_104_Entity.class)
    private SCommon_104_Entity distTrackType;

    @Basic
    @Column(name = "dist_type_station", nullable = true, length = 12)
    @Description(value = "Тип станции", position = 1600)
    private String distTypeStation;

    @Nsi(nsiClassEntity = SStationEntity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dist_payment_station_Id", referencedColumnName = "ST_ID")
    @Description(value = "Расчетная станция", position = 1700)
    @ModelClass(SStationEntity.class)
    private SStationEntity distPaymentStation;

    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne
    @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_doc_id", nullable = false)
    @Description(value = "id_invoice", position = 2300)
    @IgnoreField
    private InvoiceEntity invoice;
}