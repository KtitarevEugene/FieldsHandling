package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_CONT_SIZE_TO_TONNAGE", schema = "NSI_ETR")
@IdClass(SContSizeToTonnageEntityPK.class)
/**Связка между размерами и тоннажностью контейнеров. **/
public class SContSizeToTonnageEntity {
    @Id
    @Column(name = "TONNAGE_ID")
    private Integer tonnageId;
    @Id
    @Column(name = "SIZE_ID")
    private Integer sizeId;
}
 