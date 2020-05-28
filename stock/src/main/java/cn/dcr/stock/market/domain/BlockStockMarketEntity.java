package cn.dcr.stock.market.domain;

import cn.dcr.stock.market.util.MyTime;

import java.text.DecimalFormat;

//板块下股票信息
public class BlockStockMarketEntity {
    private String code;
    private String name;
    private Float price;
    private Float increase;
    private Float increasePercent;

    public BlockStockMarketEntity(String strEastMoney){
        String [] strList = strEastMoney.split(",");
        //保留两位2小数
        DecimalFormat decimalFormat=new DecimalFormat(".00");
        this.code = strList[1];
        this.name = strList[2];
        this.price = MyTime.convertEastMoneyFloat(strList[3]);
        this.increase = MyTime.convertEastMoneyFloat(strList[16]);
        this.increasePercent = MyTime.convertEastMoneyFloat(strList[4]);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getIncrease() {
        return increase;
    }

    public void setIncrease(Float increase) {
        this.increase = increase;
    }

    public Float getIncreasePercent() {
        return increasePercent;
    }

    public void setIncreasePercent(Float increasePercent) {
        this.increasePercent = increasePercent;
    }
}
