package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiWithTransIdAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_TRANSFERSTATIONS", schema = "NSI_ETR")
//@IdClass(STransferstationsEntityPK.class)
/**Классификатор станций передачи груза между перевозчиками **/
public class STransferstationsEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Column(name = "ST_ID")
    private Integer stId;
    @Id
    @Column(name = "TRST_ID")
    private Integer trstId;
    @Column(name = "CARRIER_IN")
    private Integer carrierIn;
    @Column(name = "CARRIER_OUT")
    private Integer carrierOut;
}
 