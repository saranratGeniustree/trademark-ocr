package th.co.geniustree.trademark.ocr.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * RpstBookM generated by hbm2java
 */
@Entity
@Table(name = "RPST_BOOK_M")
public class RpstBookM extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -8123495729212827966L;

    @Id
    @SequenceGenerator(name = "RPST_BOOK_M_SEQ", sequenceName = "RPST_BOOK_M_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RPST_BOOK_M_SEQ")
    @Column(name = "BOOK_M_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long bookMId;

    @Column(name = "BOOK_ADMIN", length = 15)
    private String bookAdmin;

    @Column(name = "BOOK_RUNNING", precision = 22, scale = 0)
    private Long bookRunning;

    @Column(name = "BOOK_YEAR", length = 4)
    private String bookYear;

    @Temporal(TemporalType.DATE)
    @Column(name = "BOOK_DATE", length = 7)
    private Date bookDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "REGISTRAR_DATE", length = 7)
    private Date registrarDate;

    @Column(name = "ORG_CODE", length = 18)
    private String orgCode;

    @Column(name = "LOT_NO", precision = 22, scale = 0)
    private Long lotNo;

    @Column(name = "TR_NO", precision = 22, scale = 0)
    private Long trNo;

    @Column(name = "TK_TYPE", length = 1)
    private String tkType;

    @Column(name = "TK_CODE", precision = 2, scale = 0)
    private Long tkCode;

    @Column(name = "TK_NO", precision = 4)
    private BigDecimal tkNo;

    @Column(name = "M_SEQ", precision = 22, scale = 0)
    private Long mSeq;

    @Column(name = "TK_HEADER", length = 100)
    private String tkHeader;

    @Column(name = "RECV_NAME", length = 500)
    private String recvName;

    @Column(name = "RECV_ADDR", length = 500)
    private String recvAddr;

    @Column(name = "RECV_LOC_CODE", length = 8)
    private String recvLocCode;

    @Column(name = "RECV_POSTCODE", length = 5)
    private String recvPostcode;

    @Column(name = "RECV_FLAG", length = 1)
    private String recvFlag;

    @Column(name = "NOT_RECV_REASON", length = 150)
    private String notRecvReason;

    @Column(name = "SECOND_FLAG", length = 1)
    private String secondFlag;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECV_DATE", length = 7)
    private Date recvDate;

    @Column(name = "DAY_LIMIT", precision = 3, scale = 0)
    private Long dayLimit;

    @Temporal(TemporalType.DATE)
    @Column(name = "DUE_BOOK_DATE", length = 7)
    private Date dueBookDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "DUE_RECV_DATE", length = 7)
    private Date dueRecvDate;

    @Column(name = "PRINT_STATUS", length = 1)
    private String printStatus;

    @Column(name = "IMAGE_FLAG", length = 1)
    private String imageFlag;

    @Temporal(TemporalType.DATE)
    @Column(name = "POST_SCAN_DATE", length = 7)
    private Date postScanDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "CANCEL_DATE", length = 7)
    private Date cancelDate;

    @Column(name = "CANCEL_FLAG", length = 1)
    private String cancelFlag;

    @Column(name = "CANCEL_REMARK", length = 100)
    private String cancelRemark;

    @Column(name = "BOOK_M_ID_REF", precision = 22, scale = 0)
    private Long bookMIdRef;

    @Column(name = "PRINT_ORG_CODE", length = 18)
    private String printOrgCode;

    @Temporal(TemporalType.DATE)
    @Column(name = "PRINT_DATE", length = 7)
    private Date printDate;

    @Column(name = "UPDATE_BY_PRG", length = 20)
    private String updateByPrg;

    @Column(name = "NEW_BOOK_M_ID", precision = 22, scale = 0)
    private Long newBookMId;

    @Column(name = "BARCODE", precision = 15, scale = 0)
    private Long barcode;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORG_ID")
    private CtltOrganize ctltOrganize;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TR_ID")
    private RpstTrademark rpstTrademark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TK_ID")
    private RpstTkCode rpstTkCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID")
    private RpstTrOwner rpstTrOwner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AGENCY_ID")
    private RpstTrAgency rpstTrAgency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGISTRAR_ID")
    private CtltOfficer registrarCtltOfficer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SIGNER_ID")
    private CtltOfficer signerCtltOfficer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRINT_USER_ID")
    private CtltOfficer printCtltOfficer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCAN_USER_ID")
    private CtltOfficer scanCtltOfficer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCAN_ID")
    private CtstScan ctstScan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_SCAN_ID")
    private CtstScan postCtstScan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RECV_LOC_ID")
    private CtltLocation recvCtltLocation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RECV_USER_ID")
    private CtltOfficer recvUserId;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECV_USER_DATE", length = 7)
    private Date recvUserDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NEW_JOB_ID")
    private CtltRecvJob ctltRecvJob;

    @Column(name = "EXST_ORDER_ID")
    private Long exstOrderId;

    public RpstBookM() {
    }

    public RpstBookM(Long bookMId) {
        this.bookMId = bookMId;
    }

    @Transient
    public Long getPk() {
        return bookMId;
    }

    public Long getBookMId() {
        return this.bookMId;
    }

    public void setBookMId(Long bookMId) {
        this.bookMId = bookMId;
    }

    public String getBookAdmin() {
        return this.bookAdmin;
    }

    public void setBookAdmin(String bookAdmin) {
        this.bookAdmin = bookAdmin;
    }

    public Long getBookRunning() {
        return this.bookRunning;
    }

    public void setBookRunning(Long bookRunning) {
        this.bookRunning = bookRunning;
    }

    public String getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public Date getBookDate() {
        return this.bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Date getRegistrarDate() {
        return this.registrarDate;
    }

    public void setRegistrarDate(Date registrarDate) {
        this.registrarDate = registrarDate;
    }

    public CtltOrganize getCtltOrganize() {
        return ctltOrganize;
    }

    public void setCtltOrganize(CtltOrganize ctltOrganize) {
        this.ctltOrganize = ctltOrganize;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Long getLotNo() {
        return this.lotNo;
    }

    public void setLotNo(Long lotNo) {
        this.lotNo = lotNo;
    }

    public RpstTrademark getRpstTrademark() {
        return rpstTrademark;
    }

    public void setRpstTrademark(RpstTrademark rpstTrademark) {
        this.rpstTrademark = rpstTrademark;
    }

    public Long getTrNo() {
        return this.trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public String getTkType() {
        return this.tkType;
    }

    public void setTkType(String tkType) {
        this.tkType = tkType;
    }

    public RpstTkCode getRpstTkCode() {
        return rpstTkCode;
    }

    public void setRpstTkCode(RpstTkCode rpstTkCode) {
        this.rpstTkCode = rpstTkCode;
    }

    public Long getTkCode() {
        return this.tkCode;
    }

    public void setTkCode(Long tkCode) {
        this.tkCode = tkCode;
    }

    public BigDecimal getTkNo() {
        return this.tkNo;
    }

    public void setTkNo(BigDecimal tkNo) {
        this.tkNo = tkNo;
    }

    public Long getMSeq() {
        return mSeq;
    }

    public void setMSeq(Long mSeq) {
        this.mSeq = mSeq;
    }

    public String getTkHeader() {
        return this.tkHeader;
    }

    public void setTkHeader(String tkHeader) {
        this.tkHeader = tkHeader;
    }

    public RpstTrOwner getRpstTrOwner() {
        return rpstTrOwner;
    }

    public void setRpstTrOwner(RpstTrOwner rpstTrOwner) {
        this.rpstTrOwner = rpstTrOwner;
    }

    public RpstTrAgency getRpstTrAgency() {
        return rpstTrAgency;
    }

    public void setRpstTrAgency(RpstTrAgency rpstTrAgency) {
        this.rpstTrAgency = rpstTrAgency;
    }

    public String getRecvName() {
        return this.recvName;
    }

    public void setRecvName(String recvName) {
        this.recvName = recvName;
    }

    public String getRecvAddr() {
        return this.recvAddr;
    }

    public void setRecvAddr(String recvAddr) {
        this.recvAddr = recvAddr;
    }

    public CtltLocation getRecvCtltLocation() {
        return recvCtltLocation;
    }

    public void setRecvCtltLocation(CtltLocation recvCtltLocation) {
        this.recvCtltLocation = recvCtltLocation;
    }

    public String getRecvLocCode() {
        return this.recvLocCode;
    }

    public void setRecvLocCode(String recvLocCode) {
        this.recvLocCode = recvLocCode;
    }

    public String getRecvPostcode() {
        return this.recvPostcode;
    }

    public void setRecvPostcode(String recvPostcode) {
        this.recvPostcode = recvPostcode;
    }

    public String getRecvFlag() {
        return this.recvFlag;
    }

    public void setRecvFlag(String recvFlag) {
        this.recvFlag = recvFlag;
    }

    public String getNotRecvReason() {
        return this.notRecvReason;
    }

    public void setNotRecvReason(String notRecvReason) {
        this.notRecvReason = notRecvReason;
    }

    public String getSecondFlag() {
        return this.secondFlag;
    }

    public void setSecondFlag(String secondFlag) {
        this.secondFlag = secondFlag;
    }

    public Date getRecvDate() {
        return this.recvDate;
    }

    public void setRecvDate(Date recvDate) {
        this.recvDate = recvDate;
    }

    public Long getDayLimit() {
        return this.dayLimit;
    }

    public void setDayLimit(Long dayLimit) {
        this.dayLimit = dayLimit;
    }

    public Date getDueBookDate() {
        return this.dueBookDate;
    }

    public void setDueBookDate(Date dueBookDate) {
        this.dueBookDate = dueBookDate;
    }

    public Date getDueRecvDate() {
        return this.dueRecvDate;
    }

    public void setDueRecvDate(Date dueRecvDate) {
        this.dueRecvDate = dueRecvDate;
    }

    public String getPrintStatus() {
        return this.printStatus;
    }

    public void setPrintStatus(String printStatus) {
        this.printStatus = printStatus;
    }

    public String getImageFlag() {
        return this.imageFlag;
    }

    public void setImageFlag(String imageFlag) {
        this.imageFlag = imageFlag;
    }

    public CtstScan getCtstScan() {
        return ctstScan;
    }

    public void setCtstScan(CtstScan ctstScan) {
        this.ctstScan = ctstScan;
    }

    public CtstScan getPostCtstScan() {
        return postCtstScan;
    }

    public void setPostCtstScan(CtstScan postCtstScan) {
        this.postCtstScan = postCtstScan;
    }

    public Date getPostScanDate() {
        return this.postScanDate;
    }

    public void setPostScanDate(Date postScanDate) {
        this.postScanDate = postScanDate;
    }

    public Date getCancelDate() {
        return this.cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelFlag() {
        return this.cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public String getCancelRemark() {
        return this.cancelRemark;
    }

    public void setCancelRemark(String cancelRemark) {
        this.cancelRemark = cancelRemark;
    }

    public Long getBookMIdRef() {
        return this.bookMIdRef;
    }

    public void setBookMIdRef(Long bookMIdRef) {
        this.bookMIdRef = bookMIdRef;
    }

    public CtltOfficer getRegistrarCtltOfficer() {
        return registrarCtltOfficer;
    }

    public void setRegistrarCtltOfficer(CtltOfficer registrarCtltOfficer) {
        this.registrarCtltOfficer = registrarCtltOfficer;
    }

    public CtltOfficer getSignerCtltOfficer() {
        return signerCtltOfficer;
    }

    public void setSignerCtltOfficer(CtltOfficer signerCtltOfficer) {
        this.signerCtltOfficer = signerCtltOfficer;
    }

    public CtltOfficer getPrintCtltOfficer() {
        return printCtltOfficer;
    }

    public void setPrintCtltOfficer(CtltOfficer printCtltOfficer) {
        this.printCtltOfficer = printCtltOfficer;
    }

    public String getPrintOrgCode() {
        return this.printOrgCode;
    }

    public void setPrintOrgCode(String printOrgCode) {
        this.printOrgCode = printOrgCode;
    }

    public Date getPrintDate() {
        return this.printDate;
    }

    public void setPrintDate(Date printDate) {
        this.printDate = printDate;
    }

    public CtltOfficer getScanCtltOfficer() {
        return scanCtltOfficer;
    }

    public void setScanCtltOfficer(CtltOfficer scanCtltOfficer) {
        this.scanCtltOfficer = scanCtltOfficer;
    }

    public String getUpdateByPrg() {
        return this.updateByPrg;
    }

    public void setUpdateByPrg(String updateByPrg) {
        this.updateByPrg = updateByPrg;
    }

    public Long getNewBookMId() {
        return this.newBookMId;
    }

    public void setNewBookMId(Long newBookMId) {
        this.newBookMId = newBookMId;
    }

    public Long getBarcode() {
        return this.barcode;
    }

    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

    public CtltOfficer getRecvUserId() {
        return recvUserId;
    }

    public void setRecvUserId(CtltOfficer recvUserId) {
        this.recvUserId = recvUserId;
    }

    public Date getRecvUserDate() {
        return recvUserDate;
    }

    public void setRecvUserDate(Date recvUserDate) {
        this.recvUserDate = recvUserDate;
    }

    public CtltRecvJob getCtltRecvJob() {
        return ctltRecvJob;
    }

    public void setCtltRecvJob(CtltRecvJob ctltRecvJob) {
        this.ctltRecvJob = ctltRecvJob;
    }

    public Long getExstOrderId() {
        return exstOrderId;
    }

    public void setExstOrderId(Long exstOrderId) {
        this.exstOrderId = exstOrderId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.bookMId);
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
        final RpstBookM other = (RpstBookM) obj;
        if (!Objects.equals(this.bookMId, other.bookMId)) {
            return false;
        }
        return true;
    }

}
