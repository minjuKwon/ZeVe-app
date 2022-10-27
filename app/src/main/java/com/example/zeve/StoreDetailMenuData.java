package com.example.zeve;

public class StoreDetailMenuData {

    private String menuName;
    private String MenuTag;
    private int menuPrice;

    public String getMenuName() {
        return menuName;
    }

    public String getMenuTag() {
        return MenuTag;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuTag(String menuTag) {
        MenuTag = menuTag;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }
}
