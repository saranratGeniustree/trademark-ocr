package th.co.geniustree.trademark.ocr.domain;

// default package
// Generated Jul 19, 2014 2:08:18 PM by Hibernate Tools 3.4.0.CR1


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * SistNo04Class generated by hbm2java
 */
@Entity
@Table(name = "SIST_NO04_CLASS")
public class SistNo04Class extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 862785762957404929L;

    @Id
    @SequenceGenerator(name = "SIST_NO04_CLASS_SEQ", sequenceName = "SIST_NO04_CLASS_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_NO04_CLASS_SEQ")
    @Column(name = "NICE_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long niceId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TR_CLASS_ID")
    private RpstTrClass rpstTrClass;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TR_NO04_ID", nullable = false)
    private SistNo04 sistNo04;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NICE_CLASS_ID", nullable = false)
    private CtltNiceClass ctltNiceClass;

    @Column(name = "GOODS_TYPE", length = 20)
    private String goodsType;

    @Column(name = "TRW_NICE_CLASS_ID", precision = 15, scale = 0)
    private Long trwNiceClassId;

    public SistNo04Class() {
    }

    public SistNo04Class(Long niceId) {
        super();
        this.niceId = niceId;
    }

    public SistNo04Class(Long niceId, SistNo04 sistNo04, CtltNiceClass ctltNiceClass) {
        this.niceId = niceId;
        this.sistNo04 = sistNo04;
        this.ctltNiceClass = ctltNiceClass;
    }

    @Transient
    public Long getPk() {
        return niceId;
    }

    public Long getNiceId() {
        return this.niceId;
    }

    public void setNiceId(Long niceId) {
        this.niceId = niceId;
    }

    public RpstTrClass getRpstTrClass() {
        return this.rpstTrClass;
    }

    public void setRpstTrClass(RpstTrClass rpstTrClass) {
        this.rpstTrClass = rpstTrClass;
    }

    public SistNo04 getSistNo04() {
        return this.sistNo04;
    }

    public void setSistNo04(SistNo04 sistNo04) {
        this.sistNo04 = sistNo04;
    }

    public CtltNiceClass getCtltNiceClass() {
        return this.ctltNiceClass;
    }

    public void setCtltNiceClass(CtltNiceClass ctltNiceClass) {
        this.ctltNiceClass = ctltNiceClass;
    }

    public String getGoodsType() {
        return this.goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Long getTrwNiceClassId() {
        return trwNiceClassId;
    }

    public void setTrwNiceClassId(Long trwNiceClassId) {
        this.trwNiceClassId = trwNiceClassId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.niceId);
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
        final SistNo04Class other = (SistNo04Class) obj;
        if (!Objects.equals(this.niceId, other.niceId)) {
            return false;
        }
        return true;
    }

}
