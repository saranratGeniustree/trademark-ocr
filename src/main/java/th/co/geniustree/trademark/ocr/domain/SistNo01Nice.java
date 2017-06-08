package th.co.geniustree.trademark.ocr.domain;

// default package
// Generated Jul 7, 2014 4:23:24 PM by Hibernate Tools 3.4.0.CR1


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * SistNo01Nice generated by hbm2java
 */
@Entity
@Table(name = "SIST_NO01_NICE")
public class SistNo01Nice extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -9086777436011332158L;

    @Id
    @SequenceGenerator(name = "SIST_NO01_NICE_SEQ", sequenceName = "SIST_NO01_NICE_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_NO01_NICE_SEQ")
    @Column(name = "NICE_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long niceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JOIN_CLASS_ID")
    private CtltNiceClass ctltNiceClassJoin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TR_NO01_ID", nullable = false)
    private SistNo01 sistNo01;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NICE_CLASS_ID", nullable = false)
    private CtltNiceClass ctltNiceClass;

    @Lob
    @Column(name = "NICE_DETAIL")
    private String niceDetail;

    @Lob
    @Column(name = "NICE_DETAIL_ENG")
    private String niceDetailEng;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRW_NICE_CLASS_ID")
    private TrwtNo01Nice trwtNo01Nice;

    public SistNo01Nice() {
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

    public CtltNiceClass getCtltNiceClassJoin() {
        return ctltNiceClassJoin;
    }

    public void setCtltNiceClassJoin(CtltNiceClass ctltNiceClassJoin) {
        this.ctltNiceClassJoin = ctltNiceClassJoin;
    }

    public SistNo01 getSistNo01() {
        return this.sistNo01;
    }

    public void setSistNo01(SistNo01 sistNo01) {
        this.sistNo01 = sistNo01;
    }

    public CtltNiceClass getCtltNiceClass() {
        return ctltNiceClass;
    }

    public void setCtltNiceClass(CtltNiceClass ctltNiceClass) {
        this.ctltNiceClass = ctltNiceClass;
    }

    public String getNiceDetail() {
        return this.niceDetail;
    }

    public void setNiceDetail(String niceDetail) {
        this.niceDetail = niceDetail;
    }

    public String getNiceDetailEng() {
        return niceDetailEng;
    }

    public void setNiceDetailEng(String niceDetailEng) {
        this.niceDetailEng = niceDetailEng;
    }

    public TrwtNo01Nice getTrwtNo01Nice() {
        return trwtNo01Nice;
    }

    public void setTrwtNo01Nice(TrwtNo01Nice trwtNo01Nice) {
        this.trwtNo01Nice = trwtNo01Nice;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.niceId);
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
        final SistNo01Nice other = (SistNo01Nice) obj;
        if (!Objects.equals(this.niceId, other.niceId)) {
            return false;
        }
        return true;
    }

}
