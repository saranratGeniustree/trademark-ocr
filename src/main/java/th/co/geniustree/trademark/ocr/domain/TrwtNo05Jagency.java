package th.co.geniustree.trademark.ocr.domain;

// Generated Nov 27, 2013 11:05:02 AM by Hibernate Tools 3.4.0.CR1


import javax.persistence.*;
import java.util.Objects;

/**
 * TrwtNo05Jagency generated by hbm2java
 */
@Entity
@Table(name = "TRWT_NO05_JAGENCY")
public class TrwtNo05Jagency extends BaseEntity implements java.io.Serializable{

    private static final long serialVersionUID = -8123809505932358215L;
    @Id
    @SequenceGenerator(name = "TRWT_NO05_JAGENCY_SEQ", sequenceName = "TRWT_NO05_JAGENCY_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRWT_NO05_JAGENCY_SEQ")
    @Column(name = "JAGENCY_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long jagencyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TITLE_ID")
    private CtltTitle ctltTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOC_ID")
    private CtltLocation ctltLocation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OCCU_ID")
    private CtltOccupation ctltOccupation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRW_NO05_ID")
    private TrwtNo05 trwtNo05;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NAT_ID")
    private CtltNation ctltNation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private CtltCountry ctltCountry;

    @Column(name = "JAGENCY_TYPE", length = 1)
    private String jagencyType;

    @Column(name = "JAGENCY_NAME", length = 150)
    private String jagencyName;

    @Column(name = "JAGENCY_SURNAME", length = 150)
    private String jagencySurname;

    @Column(name = "JAGENCY_CARDID", length = 50)
    private String jagencyCardid;

    @Column(name = "JAGENCY_ADDR", length = 150)
    private String jagencyAddr;

    @Column(name = "JAGENCY_MOO", length = 150)
    private String jagencyMoo;

    @Column(name = "JAGENCY_SOI", length = 150)
    private String jagencySoi;

    @Column(name = "JAGENCY_ROAD", length = 150)
    private String jagencyRoad;

    @Column(name = "JAGENCY_POSTCODE", length = 10)
    private String jagencyPostcode;

    @Column(name = "JAGENCY_PHONE", length = 50)
    private String jagencyPhone;

    @Column(name = "JAGENCY_FAX", length = 50)
    private String jagencyFax;

    @Column(name = "JAGENCY_EMAIL", length = 150)
    private String jagencyEmail;

    @Column(name = "USE_STATUS", length = 1)
    private String useStatus;

    @Column(name = "AND_OR_TYPE", length = 1)
    private String andOrType;

    @Column(name = "AGEN_KIND", length = 1)
    private String agenKind;

    public Long getJagencyId() {
        return this.jagencyId;
    }

    public void setJagencyId(Long jagencyId) {
        this.jagencyId = jagencyId;
    }


    public CtltTitle getCtltTitle() {
        return this.ctltTitle;
    }

    public void setCtltTitle(CtltTitle ctltTitle) {
        this.ctltTitle = ctltTitle;
    }

    public CtltLocation getCtltLocation() {
        return this.ctltLocation;
    }

    public void setCtltLocation(CtltLocation ctltLocation) {
        this.ctltLocation = ctltLocation;
    }

    public CtltOccupation getCtltOccupation() {
        return this.ctltOccupation;
    }

    public void setCtltOccupation(CtltOccupation ctltOccupation) {
        this.ctltOccupation = ctltOccupation;
    }

    public TrwtNo05 getTrwtNo05() {
        return this.trwtNo05;
    }

    public void setTrwtNo05(TrwtNo05 trwtNo05) {
        this.trwtNo05 = trwtNo05;
    }

    public CtltNation getCtltNation() {
        return this.ctltNation;
    }

    public void setCtltNation(CtltNation ctltNation) {
        this.ctltNation = ctltNation;
    }

    public CtltCountry getCtltCountry() {
        return this.ctltCountry;
    }

    public void setCtltCountry(CtltCountry ctltCountry) {
        this.ctltCountry = ctltCountry;
    }

    public String getJagencyType() {
        return this.jagencyType;
    }

    public void setJagencyType(String jagencyType) {
        this.jagencyType = jagencyType;
    }

    public String getJagencyName() {
        return this.jagencyName;
    }

    public void setJagencyName(String jagencyName) {
        this.jagencyName = jagencyName;
    }

    public String getJagencySurname() {
        return this.jagencySurname;
    }

    public void setJagencySurname(String jagencySurname) {
        this.jagencySurname = jagencySurname;
    }

    public String getJagencyCardid() {
        return this.jagencyCardid;
    }

    public void setJagencyCardid(String jagencyCardid) {
        this.jagencyCardid = jagencyCardid;
    }

    public String getJagencyAddr() {
        return this.jagencyAddr;
    }

    public void setJagencyAddr(String jagencyAddr) {
        this.jagencyAddr = jagencyAddr;
    }

    public String getJagencySoi() {
        return this.jagencySoi;
    }

    public void setJagencySoi(String jagencySoi) {
        this.jagencySoi = jagencySoi;
    }

    public String getJagencyRoad() {
        return this.jagencyRoad;
    }

    public void setJagencyRoad(String jagencyRoad) {
        this.jagencyRoad = jagencyRoad;
    }


    public String getJagencyPostcode() {
        return this.jagencyPostcode;
    }

    public void setJagencyPostcode(String jagencyPostcode) {
        this.jagencyPostcode = jagencyPostcode;
    }

    public String getJagencyPhone() {
        return this.jagencyPhone;
    }

    public void setJagencyPhone(String jagencyPhone) {
        this.jagencyPhone = jagencyPhone;
    }

    public String getJagencyFax() {
        return this.jagencyFax;
    }

    public void setJagencyFax(String jagencyFax) {
        this.jagencyFax = jagencyFax;
    }

    public String getJagencyEmail() {
        return this.jagencyEmail;
    }

    public void setJagencyEmail(String jagencyEmail) {
        this.jagencyEmail = jagencyEmail;
    }

    public String getUseStatus() {
        return this.useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }

    public String getJagencyMoo() {
        return jagencyMoo;
    }

    public void setJagencyMoo(String jagencyMoo) {
        this.jagencyMoo = jagencyMoo;
    }

    public String getAndOrType() {
        return andOrType;
    }

    public void setAndOrType(String andOrType) {
        this.andOrType = andOrType;
    }

    public String getAgenKind() {
        return agenKind;
    }

    public void setAgenKind(String agenKind) {
        this.agenKind = agenKind;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.jagencyId);
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
        final TrwtNo05Jagency other = (TrwtNo05Jagency) obj;
        if (!Objects.equals(this.jagencyId, other.jagencyId)) {
            return false;
        }
        return true;
    }

}