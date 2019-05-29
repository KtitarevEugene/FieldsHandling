package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiEtran;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "S_Org_Passport", schema = "NSI_ETR")
/**ДАННЫЕ О ПАСПОРТЕ ОРГАНИЗАЦИИ (ПУЖТ)**/
public class SOrgPassportEntity implements NsiEtran {
    @Id
    @Column(name = "org_id", nullable = false, length = 36)
    @XmlPath("ORG_ID/@value")
    private Integer orgID;

    @Column(name = "org_OKPO", nullable = false, length = 10)
    @XmlPath("ORG_OKPO/@value")
    private String orgOKPO;

//    public SOrgPassportEntity() {
//    }
//
//    public SOrgPassportEntity(Integer orgID) {
//        this.orgID = orgID;
//    }
}
