package com.hotmaxx.model.po;

import lombok.Data;

@Data
public class DashboardDemo {

    private String shopCode;

    private Double rate;

    private Double taskAmount;

    private Double nowAmount;

    private DayData today;

    private DayData yesterday;

    @Data
    public static class DayData{


        private Double amount;

        private Integer orderCount;

        private Double orderPrice;

        private Integer orderAmount;
    }
}
