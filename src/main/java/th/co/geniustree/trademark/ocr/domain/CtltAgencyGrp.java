package th.co.geniustree.trademark.ocr.domain;

// Generated Feb 20, 2014 2:00:16 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.Objects;

/**
 * CtltAgencyGrp generated by hbm2java
 */
@Entity
@Table(name = "CTLT_AGENCY_GRP")
public class CtltAgencyGrp extends BaseEntity implements java.io.Serializable {

    private static final long serialVersionUID = -4241855482433229199L;
    @Id
    @SequenceGenerator(name = "CTLT_AGENCY_GRP_SEQ", sequenceName = "CTLT_AGENCY_GRP_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CTLT_AGENCY_GRP_SEQ")
    @Column(name = "AGEN_GRP_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long agenGrpId;

    @Column(name = "AGEN_GRP_NAME", length = 150)
    private String agenGrpName;

    @Column(name = "AGEN_GRP_STATUS", length = 1)
    private String agenGrpStatus;

    @Column(name = "USE_FLAG", length = 1)
    private String useFlag;

    @Column(name = "AGEN_GRP_CODE", length = 3)
    private String agenGrpCode;

    public CtltAgencyGrp() {
    }

    public CtltAgencyGrp(Long agenGrpId) {
        this.agenGrpId = agenGrpId;
    }


    @Transient
    public Long getPk() {
        return agenGrpId;
    }

    public Long getAgenGrpId() {
        return this.agenGrpId;
    }

    public void setAgenGrpId(Long agenGrpId) {
        this.agenGrpId = agenGrpId;
    }

    public String getAgenGrpName() {
        return this.agenGrpName;
    }

    public void setAgenGrpName(String agenGrpName) {
        this.agenGrpName = agenGrpName;
    }

    public String getAgenGrpStatus() {
        return this.agenGrpStatus;
    }

    public void setAgenGrpStatus(String agenGrpStatus) {
        this.agenGrpStatus = agenGrpStatus;
    }

    public String getUseFlag() {
        return this.useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public String getAgenGrpCode() {
        return this.agenGrpCode;
    }

    public void setAgenGrpCode(String agenGrpCode) {
        this.agenGrpCode = agenGrpCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.agenGrpId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CtltAgencyGrp other = (CtltAgencyGrp) obj;
        if (!Objects.equals(this.agenGrpId, other.agenGrpId)) {
            return false;
        }
        return true;
    }

}
