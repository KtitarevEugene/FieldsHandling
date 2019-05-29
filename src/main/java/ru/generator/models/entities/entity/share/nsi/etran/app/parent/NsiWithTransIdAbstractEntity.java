package ru.generator.models.entities.entity.share.nsi.etran.app.parent;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public class NsiWithTransIdAbstractEntity extends TimeActiveNsiEntity implements NsiEtran {
    //    @Id
//    @Column(name = "TRANS_ID")
    @Transient
    @XmlPath("TRANS_ID/@value")
    private Integer transId;

}

