package com.alibaba.excel.libai;

import org.apache.poi.common.usermodel.HyperlinkType;

/**
 * @author liba8723@qq.com
 * this class is used to represent a cell value with certain kinds of link
 */
public class LinkedValue {
    private String value;
    private HyperlinkType hyperlinkType;
    private String linkAddress;

    /**
     * generate a LinkedValue Object
     * @param value cell value
     * @param hyperlinkType hyperlink type
     * @param linkAddress link address value
     */
    public LinkedValue(String value, HyperlinkType hyperlinkType, String linkAddress) {
        this.value = value;
        this.hyperlinkType = hyperlinkType;
        this.linkAddress = linkAddress;
    }

    public String getValue() {
        return value;
    }

    public HyperlinkType getHyperlinkType() {
        return hyperlinkType;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    @Override
    public String toString() {
        return getValue();
    }
}
