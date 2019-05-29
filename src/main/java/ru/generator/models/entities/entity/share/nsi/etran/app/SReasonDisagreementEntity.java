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
@Table(name = "S_REASON_DISAGREEMENT", schema = "NSI_ETR")
//@IdClass(SReasonDisagreementEntityPK.class)
/**Справочник причин разногласий. **/
public class SReasonDisagreementEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Column(name = "SHORTNAME", length = 2000)
    private String shortname;
    @Column(name = "REASON_NAME", length = 4000)
    private String reasonName;
    @Column(name = "REASON_CODE", length = 255)
    private String reasonCode;
    @Id
    @Column(name = "ID")
    private Integer id;
}
 