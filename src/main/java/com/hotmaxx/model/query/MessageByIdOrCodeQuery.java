package com.hotmaxx.model.query;

import lombok.Data;

@Data
public class MessageByIdOrCodeQuery {
    private Integer shopId;
    private Integer shopCode;
}
