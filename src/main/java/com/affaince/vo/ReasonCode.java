package com.affaince.vo;

/**
 * Created by rbsavaliya on 20-11-2016.
 */
public enum ReasonCode {
    RETURNED_UNWANTED(0),UNDELIVERED_OUT_OF_STOCK(1),RETURNED_DAMAGED(2),RETURNED_EXPIRED_GOODS(3);

    ReasonCode(int codeValue){
        this.codeValue = codeValue;
    }
    private int codeValue;

    public int getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(int codeValue) {
        this.codeValue = codeValue;
    }

    public static ReasonCode valueOf(int codeValue) {
        switch (codeValue) {
            case 0:
                return RETURNED_UNWANTED;
            case 1:
                return UNDELIVERED_OUT_OF_STOCK;
            case 2:
                return RETURNED_DAMAGED;
            case 3:
                return RETURNED_EXPIRED_GOODS;
            default:
                return RETURNED_UNWANTED;
        }
    }

}
