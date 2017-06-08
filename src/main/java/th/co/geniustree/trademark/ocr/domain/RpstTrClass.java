package th.co.geniustree.trademark.ocr.domain;

// Generated May 14, 2014 2:24:21 PM by Hibernate Tools 3.4.0.CR1


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * RpstTrClass generated by hbm2java
 */
@Entity
@Table(name = "RPST_TR_CLASS")
public class RpstTrClass extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "RPST_TR_CLASS_SEQ", sequenceName = "RPST_TR_CLASS_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RPST_TR_CLASS_SEQ")
    @Column(name = "TR_CLASS_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long trClassId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLASS_ID")
    private CtltNiceClass ctltNiceClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TR_ID", nullable = false)
    private RpstTrademark rpstTrademark;

    @Column(name = "TR_NO", nullable = false, precision = 22, scale = 0)
    private Long trNo;

    @Column(name = "SEQ_NO", precision = 22, scale = 0)
    private Long seqNo;

    @Column(name = "CLASS_CODE", length = 2)
    private String classCode;

    @Column(name = "CLASS_JOIN", length = 2)
    private String classJoin;

    @Column(name = "RULE", length = 2000)
    private String rule;

    @Column(name = "UPDATE_BY_PRG", length = 20)
    private String updateByPrg;

    @Column(name = "GOODS_CNT", nullable = false, precision = 22, scale = 0)
    private Long goodsCnt;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "rpstTrClass")
    private Set<RpstTrGoods> rpstTrGoodses = new HashSet<RpstTrGoods>(0);

    public Long getTrClassId() {
        return trClassId;
    }

    public void setTrClassId(Long trClassId) {
        this.trClassId = trClassId;
    }

    public CtltNiceClass getCtltNiceClass() {
        return ctltNiceClass;
    }

    public void setCtltNiceClass(CtltNiceClass ctltNiceClass) {
        this.ctltNiceClass = ctltNiceClass;
    }

    public RpstTrademark getRpstTrademark() {
        return rpstTrademark;
    }

    public void setRpstTrademark(RpstTrademark rpstTrademark) {
        this.rpstTrademark = rpstTrademark;
    }

    public Long getTrNo() {
        return trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassJoin() {
        return classJoin;
    }

    public void setClassJoin(String classJoin) {
        this.classJoin = classJoin;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getUpdateByPrg() {
        return updateByPrg;
    }

    public void setUpdateByPrg(String updateByPrg) {
        this.updateByPrg = updateByPrg;
    }

    public Long getGoodsCnt() {
        return goodsCnt;
    }

    public void setGoodsCnt(Long goodsCnt) {
        this.goodsCnt = goodsCnt;
    }

    public Set<RpstTrGoods> getRpstTrGoodses() {
        return rpstTrGoodses;
    }

    public void setRpstTrGoodses(Set<RpstTrGoods> rpstTrGoodses) {
        this.rpstTrGoodses = rpstTrGoodses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RpstTrClass that = (RpstTrClass) o;
        return Objects.equals(trClassId, that.trClassId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trClassId);
    }
}
