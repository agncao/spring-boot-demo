package com.caojm.tl.domain;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单实体类
 *
 * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
 * @create 2017/08/07 9:26
 */
public class ProductOrder implements Serializable {
    /**
     *
     * column product_order.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * column product_order.purchaser_id
     *  采购商id
     * @mbggenerated
     */
    private Long purchaserId;

    /**
     *
     * column product_order.purchaser_name
     * 采购商:与中心库对应字段长度保持一致
     * @mbggenerated
     */
    private String purchaserName;

    /**
     *
     * column product_order.user_name
     * 创建人：对应于T_REG_USER.login_name
     * @mbggenerated
     */
    private String userName;

    /**
     *
     * column product_order.supplier_id
     * 供应商id
     * @mbggenerated
     */
    private Long supplierId;

    /**
     *
     * column product_order.supplier_name
     * 供应商:与中心库对应字段长度保持一致
     * @mbggenerated
     */
    private String supplierName;

    /**
     *
     * column product_order.product_code
     * 产品代码：对应OMS产品表的subcategory字段
     * @mbggenerated
     */
    private Integer productCode;

    /**
     *
     * column product_order.product_category
     * 产品分类，与proudct.category关联
     * @mbggenerated
     */
    private String productCategory;

    /**
     *
     * column product_order.product_name
     * 产品名：对应于OMS.product.subcategory_name
     * @mbggenerated
     */
    private String productName;

    /**
     *
     * column product_order.order_status
     * 订单状态：0未开始5生效10已关停15 到期失效20预期放弃,25取消订单
     * @mbggenerated
     */
    private Short orderStatus;

    /**
     *
     * column product_order.paid_status
     *  支付状态：0待支付5支付取消10支付成功
     * @mbggenerated
     */
    private Short paidStatus;

    /**
     * column product_order.paid_time
     * 支付时间
     */
    private Date paidTime;

    /**
     * column product_order.paid_type
     * 支付类型：0线下1在线
     */
    private Byte paidType;

    /**
     *
     * column product_order.create_time
     * 创建时间
     * @mbggenerated
     */
    private Date createTime;

    /**
     *
     * column product_order.creator_id
     * 创建人：对应于T_REG_USER.id
     * @mbggenerated
     */
    private Long creatorId;

    /**
     *
     * column product_order.creator_id
     * 订单编号
     * @mbggenerated
     */
    private String orderCode;

    /**
     * 订单金额
     */
    private BigDecimal productPrice;

    /**
     * This field corresponds to the database column product_order.content
     *
     * 备注

     */
    private String content;

    /**
     * This field corresponds to the database column product_order.hidden
     *  '0:有效1删除',
     * @mbggenerated
     */
    private Byte hidden;

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     *
     * This method returns the value of the database column product_order.id
     *
     * @return the value of product_order.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * This method sets the value of the database column product_order.id
     *
     * @param id the value for product_order.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     *
     * This method returns the value of the database column product_order.purchaser_id
     *
     * @return the value of product_order.purchaser_id
     *
     * @mbggenerated
     */
    public Long getPurchaserId() {
        return purchaserId;
    }

    /**
     *
     * This method sets the value of the database column product_order.purchaser_id
     *
     * @param purchaserId the value for product_order.purchaser_id
     *
     * @mbggenerated
     */
    public void setPurchaserId(Long purchaserId) {
        this.purchaserId = purchaserId;
    }

    /**
     *
     * This method returns the value of the database column product_order.purchaser_name
     *
     * @return the value of product_order.purchaser_name
     *
     * @mbggenerated
     */
    public String getPurchaserName() {
        return purchaserName;
    }

    /**
     *
     * This method sets the value of the database column product_order.purchaser_name
     *
     * @param purchaserName the value for product_order.purchaser_name
     *
     * @mbggenerated
     */
    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName == null ? null : purchaserName.trim();
    }

    /**
     *
     * This method returns the value of the database column product_order.user_name
     *
     * @return the value of product_order.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * This method sets the value of the database column product_order.user_name
     *
     * @param userName the value for product_order.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     *
     * This method returns the value of the database column product_order.supplier_id
     *
     * @return the value of product_order.supplier_id
     *
     * @mbggenerated
     */
    public Long getSupplierId() {
        return supplierId;
    }

    /**
     *
     * This method sets the value of the database column product_order.supplier_id
     *
     * @param supplierId the value for product_order.supplier_id
     *
     * @mbggenerated
     */
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    /**
     *
     * This method returns the value of the database column product_order.supplier_name
     *
     * @return the value of product_order.supplier_name
     *
     * @mbggenerated
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     *
     * This method sets the value of the database column product_order.supplier_name
     *
     * @param supplierName the value for product_order.supplier_name
     *
     * @mbggenerated
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     *
     * This method returns the value of the database column product_order.product_code
     *
     * @return the value of product_order.product_code
     *
     * @mbggenerated
     */
    public Integer getProductCode() {
        return productCode;
    }

    /**
     *
     * This method sets the value of the database column product_order.product_code
     *
     * @param productCode the value for product_order.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    /**
     *
     * This method returns the value of the database column product_order.product_name
     *
     * @return the value of product_order.product_name
     *
     * @mbggenerated
     */
    public String getProductName() {
        return productName;
    }

    /**
     *
     * This method sets the value of the database column product_order.product_name
     *
     * @param productName the value for product_order.product_name
     *
     * @mbggenerated
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     *
     * This method returns the value of the database column product_order.order_status
     *
     * @return the value of product_order.order_status
     *
     * @mbggenerated
     */
    public Short getOrderStatus() {
        return orderStatus;
    }

    /**
     *
     * This method sets the value of the database column product_order.order_status
     *
     * @param orderStatus the value for product_order.order_status
     *
     * @mbggenerated
     */
    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     *
     * This method returns the value of the database column product_order.paid_status
     *
     * @return the value of product_order.paid_status
     *
     * @mbggenerated
     */
    public Short getPaidStatus() {
        return paidStatus;
    }

    /**
     *
     * This method sets the value of the database column product_order.paid_status
     *
     * @param paidStatus the value for product_order.paid_status
     *
     * @mbggenerated
     */
    public void setPaidStatus(Short paidStatus) {
        this.paidStatus = paidStatus;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public Byte getPaidType() {
        return paidType;
    }

    public void setPaidType(Byte paidType) {
        this.paidType = paidType;
    }

    /**
     *
     * This method returns the value of the database column product_order.create_time
     *
     * @return the value of product_order.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     * This method sets the value of the database column product_order.create_time
     *
     * @param createTime the value for product_order.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     * This method returns the value of the database column product_order.creator_id
     *
     * @return the value of product_order.creator_id
     *
     * @mbggenerated
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     *
     * This method sets the value of the database column product_order.creator_id
     *
     * @param creatorId the value for product_order.creator_id
     *
     * @mbggenerated
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getHidden() {
        return hidden;
    }

    public void setHidden(Byte hidden) {
        this.hidden = hidden;
    }

}