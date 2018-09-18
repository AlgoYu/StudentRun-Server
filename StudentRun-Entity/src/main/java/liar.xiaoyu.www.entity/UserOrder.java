package liar.xiaoyu.www.entity;


public class UserOrder {

  private Integer id;
  private String orderUuid;
  private Integer userId;
  private Float money;
  private Integer staff;
  private String info;
  private Integer status;
  private String datetime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getOrderUuid() {
    return orderUuid;
  }

  public void setOrderUuid(String orderUuid) {
    this.orderUuid = orderUuid;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Float getMoney() {
    return money;
  }

  public void setMoney(Float money) {
    this.money = money;
  }

  public Integer getStaff() {
    return staff;
  }

  public void setStaff(Integer staff) {
    this.staff = staff;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }
}
