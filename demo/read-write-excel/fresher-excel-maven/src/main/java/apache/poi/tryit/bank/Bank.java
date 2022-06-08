package apache.poi.tryit;

import java.util.Date;

public class Bank {
    private int id;
    private String userName;
    private Long amountOfMoney;
    private Date remittanceDate;

    public Bank() {
    }

    public Bank(int id, String userName, Long amountOfMoney, Date remittanceDate) {
        this.id = id;
        this.userName = userName;
        this.amountOfMoney = amountOfMoney;
        this.remittanceDate = remittanceDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Long amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public Date getRemittanceDate() {
        return remittanceDate;
    }

    public void setRemittanceDate(Date remittanceDate) {
        this.remittanceDate = remittanceDate;
    }
}
