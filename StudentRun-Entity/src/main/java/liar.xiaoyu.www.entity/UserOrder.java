package liar.xiaoyu.www.entity;


public class UserOrder {

  private long id;
  private String orderUuid;
  private long userId;
  private double money;
  private long staff;
  private String info;
  private long status;
  private java.sql.Timestamp datetime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getOrderUuid() {
    return orderUuid;
  }

  public void setOrderUuid(String orderUuid) {
    this.orderUuid = orderUuid;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public long getStaff() {
    return staff;
  }

  public void setStaff(long staff) {
    this.staff = staff;
  }


  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Timestamp getDatetime() {
    return datetime;
  }

  public void setDatetime(java.sql.Timestamp datetime) {
    this.datetime = datetime;
  }

}
