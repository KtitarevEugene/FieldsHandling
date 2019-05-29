package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiEtran;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiWithTransIdAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "S_ATS_ITE", schema = "NSI_ETR")
//@IdClass(SAtsIteEntityPK.class)
/**Классификатор контрейлеров **/
public class SAtsIteEntity extends NsiWithTransIdAbstractEntity implements NsiEtran {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODE")
    private Integer code;
    @Column(name = "NAME", length = 100)
    private String name;
    @Column(name = "TYPE", length = 5)
    private String type;
}
 