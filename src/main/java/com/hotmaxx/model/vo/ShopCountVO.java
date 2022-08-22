package com.hotmaxx.model.vo;

import lombok.Data;

@Data
public class ShopCountVO {
    private long allCount;
    private long inBusiness;
    private long closeShop;
    private long tempCloseShop;
    private long waitOpen;
    private long postPone;
    private long waitSign;
    private long waitConfirm;

}
