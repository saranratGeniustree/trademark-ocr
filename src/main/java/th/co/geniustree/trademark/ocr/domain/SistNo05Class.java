package th.co.geniustree.trademark.ocr.domain;

// default package
// Generated Jul 19, 2014 2:08:18 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * SistNo05Class generated by hbm2java
 */
@Entity
@Table(name = "SIST_NO05_CLASS")
public class SistNo05Class extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 7658773455547433133L;

    @Id
    @SequenceGenerator(name = "SIST_NO05_CLASS_SEQ", sequenceName = "SIST_NO05_CLASS_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_NO05_CLASS_SEQ")
    @Column(name = "NICE_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long niceId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TR_CLASS_ID")
    private RpstTrClass rpstTrClass;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TR_NO05_ID", nullable = false)
    private SistNo05 sistNo05;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NICE_CLASS_ID", nullable = false)
    private CtltNiceClass ctltNiceClass;

    @Column(name = "GOODS_TYPE", length = 20)
    private String goodsType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRW_NICE_CLASS_ID")
    private TrwtNo05Class trwtNo05Class;

    public SistNo05Class() {
    }

    public SistNo05Class(Long niceId) {
        super();
        this.niceId = niceId;
    }

    public SistNo05Class(Long niceId, SistNo05 sistNo05, CtltNiceClass ctltNiceClass) {
        this.niceId = niceId;
        this.sistNo05 = sistNo05;
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

    public SistNo05 getSistNo05() {
        return this.sistNo05;
    }

    public void setSistNo05(SistNo05 sistNo05) {
        this.sistNo05 = sistNo05;
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

    public TrwtNo05Class getTrwtNo05Class() {
        return trwtNo05Class;
    }

    public void setTrwtNo05Class(TrwtNo05Class trwtNo05Class) {
        this.trwtNo05Class = trwtNo05Class;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.niceId);
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
        final SistNo05Class other = (SistNo05Class) obj;
        if (!Objects.equals(this.niceId, other.niceId)) {
            return false;
        }
        return true;
    }

}
