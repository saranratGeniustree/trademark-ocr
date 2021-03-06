package th.co.geniustree.trademark.ocr.domain;

// Generated May 14, 2014 2:24:21 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * RpstTrGoods generated by hbm2java
 */
@Entity
@Table(name = "RPST_TR_GOODS")
public class RpstTrGoods extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "RPST_TR_GOODS_SEQ", sequenceName = "RPST_TR_GOODS_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RPST_TR_GOODS_SEQ")
    @Column(name = "TR_GOODS_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long trGoodsId;

    @ManyToOne
    @JoinColumn(name = "TR_CLASS_ID", nullable = false)
    private RpstTrClass rpstTrClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLASS_ID")
    private CtltNiceClass ctltNiceClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TR_ID", nullable = false)
    private RpstTrademark rpstTrademark;

    @Column(name = "TR_NO", nullable = false, precision = 22, scale = 0)
    private Long trNo;

    @Column(name = "CLASS_CODE", length = 2)
    private String classCode;

    @Column(name = "SEQ_NO", precision = 22, scale = 0)
    private Long seqNo;

    @Lob
    @Column(name = "GOODS_SERVICES")
    private String goodsServices;

    @Column(name = "UPDATE_BY_PRG", length = 20)
    private String updateByPrg;

    @Transient
    private Long itemQty;

    @Transient
    private Long seq;

    public Long getTrGoodsId() {
        return trGoodsId;
    }

    public void setTrGoodsId(Long trGoodsId) {
        this.trGoodsId = trGoodsId;
    }

    public RpstTrClass getRpstTrClass() {
        return rpstTrClass;
    }

    public void setRpstTrClass(RpstTrClass rpstTrClass) {
        this.rpstTrClass = rpstTrClass;
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

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getGoodsServices() {
        return goodsServices;
    }

    public void setGoodsServices(String goodsServices) {
        this.goodsServices = goodsServices;
    }

    public String getUpdateByPrg() {
        return updateByPrg;
    }

    public void setUpdateByPrg(String updateByPrg) {
        this.updateByPrg = updateByPrg;
    }

    public Long getItemQty() {
        return itemQty;
    }

    public void setItemQty(Long itemQty) {
        this.itemQty = itemQty;
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RpstTrGoods that = (RpstTrGoods) o;
        return Objects.equals(trGoodsId, that.trGoodsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trGoodsId);
    }
}
