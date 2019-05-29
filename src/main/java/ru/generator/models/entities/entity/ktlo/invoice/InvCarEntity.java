package ru.generator.models.entities.entity.ktlo.invoice;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import ru.generator.models.entities.annotation.Nsi;
import ru.generator.models.entities.entity.share.nsi.etran.app.SCountryEntity;
import ru.generator.models.entities.entity.share.nsi.etran.app.SFreightEntity;
import ru.generator.models.entities.entity.share.nsi.etran.app.SStationEntity;
import ru.generator.models.entities.entity.share.nsi.etran.app.SWagTypeEntity;
import ru.generator.service.annotations.Description;
import ru.generator.service.annotations.IgnoreField;
import ru.generator.service.annotations.ModelClass;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by solop on 20.11.2017.
 */
@ApiModel(discriminator = "НАКЛАДНАЯ: Вагоны")
@Data
@Entity
@Table(name = "inv_car", schema = "invoice",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class InvCarEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    private String id;

//    @Basic
//    @Description(value = "№ п/п")
//    @Column(name = "car_number_pp", nullable = true)
//    private Integer carNumberPP;

    @Basic
    @Description(value = "Номер вагона")
    @Column(name = "car_number", nullable = true, length = 20)
    private String carNumber;

    @Basic
    @Column(name = "car_owner_name", nullable = true, length = 255)
    @Description(value = "Собственник")
    private String carOwnerName;

    @Basic
    @Column(name = "car_owner_ID", nullable = true)
    @Description(value = "Собственник")
    private Integer carOwnerId;

    @Basic
    @Column(name = "car_owner_okpo", nullable = true, length = 10)
    @Description(value = "Собственник")
    private String carOwnerOkpoOkpo;

    @Basic
    @Column(name = "car_tenant_ID", nullable = true)
    @Description(value = "Арендатор, ID, код ОКПО, наименование арендатора")
    private Integer carTenantId;

    @Basic
    @Column(name = "car_tenant_okpo", nullable = true, length = 10)
    @Description(value = "Арендатор, ID, код ОКПО, наименование арендатора")
    private String carTenantOkpo;

    @Basic
    @Column(name = "car_tenant_name", nullable = true, length = 255)
    @Description(value = "Арендатор, ID, код ОКПО, наименование арендатора")
    private String carTenantName;

    @Nsi(nsiClassEntity = SWagTypeEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "car_type_ID", referencedColumnName = "WAG_TYPE_ID")
    @Description(value = "Род вагона (ID по НСИ – WAG_TYPE)")
    @ModelClass(SWagTypeEntity.class)
    private SWagTypeEntity carType;

    @Basic
    @Column(name = "car_tonnage", nullable = true, precision = 0)
    @Description(value = "Грузоподъемность в т.")
    private Double carTonnage;

    @Basic
    @Column(name = "car_axles", nullable = true)
    @Description(value = "Кол-во осей")
    private Integer carAxles;

    @Basic
    @Column(name = "car_weight_net", nullable = true, precision = 0)
    @Description(value = "Масса в кг нетто")
    private Double carWeightNet;

    @Basic
    @Column(name = "car_sign", nullable = true, precision = 0)
    @Description(value = "Признак")
    private Integer carSign;


    @Nsi(nsiClassEntity = SCountryEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "car_owner_country_id", referencedColumnName = "CN_ID")
    @Description(value = "Страна-собственник (код ОКСМ по НСИ - COUNTRY)")
    @ModelClass(SCountryEntity.class)
    private SCountryEntity carOwnerCountry;

    @Basic
    @Column(name = "car_weight_gross", nullable = true, precision = 0)
    @Description(value = "Масса в кг брутто")
    private Double carWeightGross;

    @Basic
    @Column(name = "car_rolls", nullable = true)
    @Description(value = "Ролики")
    private Integer carRolls;

    @Basic
    @Column(name = "car_weight_dep", nullable = true, precision = 0)
    @Description(value = "Масса тары ц (с бруса)")
    private Double carWeightDep;

    @Basic
    @Column(name = "car_weight_dep_real", nullable = true, precision = 0)
    @Description(value = "Масса тары ц. (проверенная)")
    private Double carWeightDepReal;

    @Basic
    @Column(name = "car_guide_count", nullable = true)
    @Description(value = "Количество проводников")
    private Integer carGuideCount;

    @Basic
    @Column(name = "car_places_count", nullable = true)
    @Description(value = "Количество мест")
    private Integer carPlacesCount;

    //    Станция перегруза
    @Nsi(nsiClassEntity = SStationEntity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "car_overload_station_id", referencedColumnName = "ST_ID")
    @Description(value = "Станция перегруза")
    @ModelClass(SStationEntity.class)
    private SStationEntity carOverloadStation;

    @Basic
    @Column(name = "car_date_overload", nullable = true)
    @Description(value = "Дата перегруза")
    private Date carDateOverload;

    @Basic
    @Column(name = "car_volume", nullable = true, precision = 0)
    @Description(value = "Объем кузова")
    private Double carVolume;

    @Nsi(nsiClassEntity = SFreightEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "car_prior_freigh_id", referencedColumnName = "FR_ID")
    @Description(value = " Ранее перевозившийся груз (Код ЕТ СНГ по НСИ - FREIGHT)")
    @ModelClass(SFreightEntity.class)
    private SFreightEntity carPriorFreight;

//    Отнесение к заказу. А/О
//    Отнесение к заказу. № заказа
//    Отнесение к заказу. ID заказа
//    Отнесение к заказу. № договора
//    Отнесение к заказу. Наименование клиента


    @Basic
    @Column(name = "car_claim_Id", nullable = true, precision = 0)
    @Description(value = "Идентификатор заявки ГУ-12")
    private Double carClaimId;

    @Basic
    @Column(name = "car_claim_num_otp", nullable = true, precision = 0)
    @Description(value = "Номер отправки в заявке")
    private Double carClaimNumOtp;

    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_doc_id", nullable = false)
    @Description(value = "invoice_id")
    @IgnoreField
    private InvoiceEntity invoice;

}