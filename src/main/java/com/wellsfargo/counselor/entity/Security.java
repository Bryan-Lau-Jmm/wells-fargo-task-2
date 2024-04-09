package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long SecurityId;

    @OneToOne
    private Portfolio portfolio;



    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false)
    private float Purchasedate;

    @Column(nullable = false)
    private float Purchaseprice;

    @Column(nullable = false)
    private float Quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio,String Name, String Category, float Purchasedate, float Purchaseprice, float Quantity) {
        this.portfolio = portfolio;
        this.Name = Name;
        this.Category = Category;
        this.Purchasedate = Purchasedate;
        this.Purchaseprice = Purchaseprice;
        this.Quantity = Quantity;
    }

    public Long getSecurityId() {
        return SecurityId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getPurchasedate() {
        return Purchasedate;
    }

    public void setPurchasedate(float Purchasedate) {
        this.Purchasedate = Purchasedate;
    }

    public String getPurchaseprice() {
        return Purchaseprice;
    }

    public void setPurchaseprice(float Purchaseprice) {
        this.Purchaseprice = Purchaseprice;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(float Quantity) {
        this.Quantity = Quantity;
    }






}
