package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_INV_REASONRELEASE", schema = "NSI_ETR")
/**Классификатор причин отцепки. **/
public class SInvReasonreleaseEntity {
    @Id
    @Column(name = "REASON_ID")
    private Integer reasonId;
    @Column(name = "REASON_NAME", length = 255)
    private String reasonName;
    @Column(name = "REASON_CODE", length = 2)
    private String reasonCode;
    @Column(name = "REASON_MNEMOCODE", length = 255)
    private String reasonMnemocode;
}
 