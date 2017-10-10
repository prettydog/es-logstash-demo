package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "article", type = "jdbc")
public class Job {

    @Id
    private Long id;


    private String job_number;


    private String cancelReason;


    private String processStatus;


    private String businessNumber;

    private String ownerAcountStatus;

    private String businessStatus;

    private Boolean ownerReviewStatus = false;

    private Boolean driverReviewStatus = false;

    private Boolean invoice;

    private String phonetic;

    private String textDescription;

    private String photos;

    private String carType;

    private String kilometers;

    private String referencePrice;

    private String jobCategory;

    private String jobType;

    private String payPriceHistory;

    private String realPriceHistory;

    private String payPrice;

    private String realPrice;

    private String unit;

    private String goodsNumber;

    private String remark;

    private String status;

    private String paymentType;

    private Boolean weihuotong;

    private String jobDate;

    private String owner;

    private String driver;

    private String area;

    private String backId;

    private String source;


    private String orderMode;

    private String project;

    private String price;

    private String number;

    private String storefront;

    private String business;

    public Job() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJob_number() {
        return job_number;
    }

    public void setJob_number(String job_number) {
        this.job_number = job_number;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getOwnerAcountStatus() {
        return ownerAcountStatus;
    }

    public void setOwnerAcountStatus(String ownerAcountStatus) {
        this.ownerAcountStatus = ownerAcountStatus;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public Boolean getOwnerReviewStatus() {
        return ownerReviewStatus;
    }

    public void setOwnerReviewStatus(Boolean ownerReviewStatus) {
        this.ownerReviewStatus = ownerReviewStatus;
    }

    public Boolean getDriverReviewStatus() {
        return driverReviewStatus;
    }

    public void setDriverReviewStatus(Boolean driverReviewStatus) {
        this.driverReviewStatus = driverReviewStatus;
    }

    public Boolean getInvoice() {
        return invoice;
    }

    public void setInvoice(Boolean invoice) {
        this.invoice = invoice;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getKilometers() {
        return kilometers;
    }

    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    public String getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(String referencePrice) {
        this.referencePrice = referencePrice;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getPayPriceHistory() {
        return payPriceHistory;
    }

    public void setPayPriceHistory(String payPriceHistory) {
        this.payPriceHistory = payPriceHistory;
    }

    public String getRealPriceHistory() {
        return realPriceHistory;
    }

    public void setRealPriceHistory(String realPriceHistory) {
        this.realPriceHistory = realPriceHistory;
    }

    public String getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(String payPrice) {
        this.payPrice = payPrice;
    }

    public String getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(String realPrice) {
        this.realPrice = realPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Boolean getWeihuotong() {
        return weihuotong;
    }

    public void setWeihuotong(Boolean weihuotong) {
        this.weihuotong = weihuotong;
    }

    public String getJobDate() {
        return jobDate;
    }

    public void setJobDate(String jobDate) {
        this.jobDate = jobDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBackId() {
        return backId;
    }

    public void setBackId(String backId) {
        this.backId = backId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOrderMode() {
        return orderMode;
    }

    public void setOrderMode(String orderMode) {
        this.orderMode = orderMode;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStorefront() {
        return storefront;
    }

    public void setStorefront(String storefront) {
        this.storefront = storefront;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobNumber='" + job_number + '\'' +
                ", cancelReason='" + cancelReason + '\'' +
                ", processStatus='" + processStatus + '\'' +
                ", businessNumber='" + businessNumber + '\'' +
                ", ownerAcountStatus='" + ownerAcountStatus + '\'' +
                ", businessStatus='" + businessStatus + '\'' +
                ", ownerReviewStatus=" + ownerReviewStatus +
                ", driverReviewStatus=" + driverReviewStatus +
                ", invoice=" + invoice +
                ", phonetic='" + phonetic + '\'' +
                ", textDescription='" + textDescription + '\'' +
                ", photos='" + photos + '\'' +
                ", carType='" + carType + '\'' +
                ", kilometers='" + kilometers + '\'' +
                ", referencePrice='" + referencePrice + '\'' +
                ", jobCategory='" + jobCategory + '\'' +
                ", jobType='" + jobType + '\'' +
                ", payPriceHistory='" + payPriceHistory + '\'' +
                ", realPriceHistory='" + realPriceHistory + '\'' +
                ", payPrice='" + payPrice + '\'' +
                ", realPrice='" + realPrice + '\'' +
                ", unit='" + unit + '\'' +
                ", goodsNumber='" + goodsNumber + '\'' +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", weihuotong=" + weihuotong +
                ", jobDate='" + jobDate + '\'' +
                ", owner='" + owner + '\'' +
                ", driver='" + driver + '\'' +
                ", area='" + area + '\'' +
                ", backId='" + backId + '\'' +
                ", source='" + source + '\'' +
                ", orderMode='" + orderMode + '\'' +
                ", project='" + project + '\'' +
                ", price='" + price + '\'' +
                ", number='" + number + '\'' +
                ", storefront='" + storefront + '\'' +
                ", business='" + business + '\'' +
                '}';
    }
}
