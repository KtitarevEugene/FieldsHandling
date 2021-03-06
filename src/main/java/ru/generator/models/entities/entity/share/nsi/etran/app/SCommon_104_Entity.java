package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.Subselect;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiWithTransIdAbstractEntity;
import ru.generator.service.annotations.Description;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "row")
@Entity
//@Table(name = "S_COMMON", schema = "NSI_ETR")
@Subselect("select * from NSI_ETR.S_COMMON where PARAM_ID=104")
//@IdClass(SCommonEntityPK.class)
/**Общие классификаторы, под которые не стоит заводить отдельные таблицы Например типы сообщений, вида руководителей и т.д. **/
public class SCommon_104_Entity extends NsiWithTransIdAbstractEntity implements Serializable {
    //    @Id
//    @Column(name = "PARAMID")
//    private Integer paramid;
    @Id
    @Column(name = "id")
    @XmlPath("ID/@value")
    @Description(value = "Идент. параметра")
    private Integer id;
    @Column(name = "name", length = 255)
    @XmlPath("NAME/@value")
    @Description(value = "Значение параметра")
    private String name;
}
